/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FornecedorFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.view.Viewfornecedor;

/**
 *
 * @author Wolverine
 */
public class FornecedorController {
    
    FornecedorFacade fornecedorFacade;
    
    public Fornecedor salvar(Fornecedor fornecedor) {
        fornecedorFacade = new FornecedorFacade();
        try {
            return fornecedorFacade.salvar(fornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor " + ex);
            return null;
        }
    }
    
    public Fornecedor consultar(int idFornecedor) {
        fornecedorFacade = new FornecedorFacade();
        try {
            return fornecedorFacade.consultar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fornecedor " + ex);
            return null;
        }
    }
    
    public List<Viewfornecedor> listaFornecedor(String sql) {
        fornecedorFacade = new FornecedorFacade();
        try {
            return fornecedorFacade.listaFornecedor(sql);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Fornecedores " + ex);
            return null;
        }
    }
    
    public List<Fornecedor> listaFornecedorCadastro(String sql) {
        fornecedorFacade = new FornecedorFacade();
        try {
            return fornecedorFacade.listaFornecedorCadastro(sql);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Fornecedores " + ex);
            return null;
        }
    }
}
