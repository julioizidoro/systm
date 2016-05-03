/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ProdutoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produtos;

/**
 *
 * @author Wolverine
 */
public class ProdutoController {
    
    private ProdutoFacade produtoFacade;
    
    public Produtos salvar(Produtos produto) {
        produtoFacade = new ProdutoFacade();
        try {
            return produtoFacade.salvar(produto);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Produto " + ex);
            return null;
        }
    }
    
    public List<Produtos> listarProdutos(String descricao) {
        produtoFacade = new ProdutoFacade();
        try {
            return produtoFacade.listarProdutos(descricao);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Produtos " + ex);
            return null;
        }
    }
    
    public Produtos consultar(int idProduto) {
        produtoFacade = new ProdutoFacade();
        try {
            return produtoFacade.consultar(idProduto);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Produto " + ex);
            return null;
        }
    }
    
}
