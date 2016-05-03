/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ValorWorkFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Valoreswork;
import model.view.Viewconsultavaloreswork;

/**
 *
 * @author Wolverine
 */
public class ValorWorkController {

            private  ValorWorkFacade valorWorkFacade;
    
    public Valoreswork salvar(Valoreswork valor) {
        valorWorkFacade = new ValorWorkFacade();
        try {
            return valorWorkFacade.salvar(valor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorWorkController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Valor " + ex);
            return null;
        }
    }
    public Valoreswork consultar(int idvalor)  {
        valorWorkFacade = new ValorWorkFacade();
        try {
            return valorWorkFacade.consultar(idvalor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorWorkController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Valor " + ex);
            return null;
        }
    }
    
    public List<Valoreswork> listar(int idFornecedor) {
        valorWorkFacade = new ValorWorkFacade();
        try {
            return valorWorkFacade.listar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorWorkController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
    
    public List<Viewconsultavaloreswork> listarConsulta(int idFornecedorcidade) {
        valorWorkFacade = new ValorWorkFacade();
        try {
            return valorWorkFacade.listarConsulta(idFornecedorcidade);
        } catch (SQLException ex) {
            Logger.getLogger(ValorWorkController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
}
