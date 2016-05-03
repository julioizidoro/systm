/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FornecedorProdutoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedorproduto;
import model.view.Viewfornecedorproduto;

/**
 *
 * @author Wolverine
 */
public class FornecedorProdutoController {
    
    FornecedorProdutoFacade fornecedorProdutoFacade;
    
    public Fornecedorproduto salvar(Fornecedorproduto fornecedorProduto) {
        fornecedorProdutoFacade = new FornecedorProdutoFacade();
        try {
            return fornecedorProdutoFacade.salvar(fornecedorProduto);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor Produto " + ex);
            return null;
        }
    }
        
    public void Excluir(int idFornecedorProduto) {
        fornecedorProdutoFacade = new FornecedorProdutoFacade();
        try {
            fornecedorProdutoFacade.Excluir(idFornecedorProduto);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor Produto " + ex);
        }
    }
    
    public List<Viewfornecedorproduto> listaFornecedorProduto(int idProduto) {
        fornecedorProdutoFacade = new FornecedorProdutoFacade();
        try {
            return fornecedorProdutoFacade.listaFornecedorProduto(idProduto);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor Produto " + ex);
            return null;
        }    
    }
    
}
