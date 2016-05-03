/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ValorHighSchoolFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Valoreshighschool;
import model.view.Viewconsultavaloreshighschool;

/**
 *
 * @author Wolverine
 */
public class ValorHighSchoolController {

    private  ValorHighSchoolFacade valorHighSchoolFacade;
    
    public Valoreshighschool salvar(Valoreshighschool valor) {
        valorHighSchoolFacade = new ValorHighSchoolFacade();
        try {
            return valorHighSchoolFacade.salvar(valor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorHighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Valor " + ex);
            return null;
        }
    }
    public Valoreshighschool consultar(int idvalor)  {
        valorHighSchoolFacade = new ValorHighSchoolFacade();
        try {
            return valorHighSchoolFacade.consultar(idvalor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorHighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Valor " + ex);
            return null;
        }
    }
    
    public List<Valoreshighschool> listar(int idFornecedor) {
        valorHighSchoolFacade = new ValorHighSchoolFacade();
        try {
            return valorHighSchoolFacade.listar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorHighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
    
    public List<Viewconsultavaloreshighschool> listarConsulta(int idFornecedorCidade) {
        valorHighSchoolFacade = new ValorHighSchoolFacade();
        try {
            return valorHighSchoolFacade.listarConsulta(idFornecedorCidade);
        } catch (SQLException ex) {
            Logger.getLogger(ValorHighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
}
