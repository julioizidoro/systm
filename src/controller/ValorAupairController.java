/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ValorAupairFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Valoresaupair;
import model.view.Viewconsultavaloresaupair;

/**
 *
 * @author Wolverine
 */
public class ValorAupairController {

    private  ValorAupairFacade valorAupairFacade;
    
    public Valoresaupair salvar(Valoresaupair valor) {
        valorAupairFacade = new ValorAupairFacade();
        try {
            return valorAupairFacade.salvar(valor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorAupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Valor " + ex);
            return null;
        }
    }
    public Valoresaupair consultar(int idvalor)  {
        valorAupairFacade = new ValorAupairFacade();
        try {
            return valorAupairFacade.consultar(idvalor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorAupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Valor " + ex);
            return null;
        }
    }
    
    public List<Valoresaupair> listar(int idFornecedor) {
        valorAupairFacade = new ValorAupairFacade();
        try {
            return valorAupairFacade.listar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorAupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
    
    public List<Viewconsultavaloresaupair> listarConsulta(int idFornecedor) {
        valorAupairFacade = new ValorAupairFacade();
        try {
            return valorAupairFacade.listarConsulta(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorAupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
}
