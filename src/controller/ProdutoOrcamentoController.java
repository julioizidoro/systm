/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ProdutoOrcamentoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produtosorcamento;
import model.view.Viewprodutosfiltro;


/**
 *
 * @author Wolverine
 */
public class ProdutoOrcamentoController {
    
    ProdutoOrcamentoFacade produtoOrcamentoFacade;
    
    public Produtosorcamento salvar(Produtosorcamento produto) {
        produtoOrcamentoFacade = new ProdutoOrcamentoFacade();
        try {
            return produtoOrcamentoFacade.salvar(produto);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoOrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Produto Orçamento " + ex);
            return null;
        }
    }
    
    public List<Produtosorcamento> listarProdutoOrcamento(String descricao) {
        produtoOrcamentoFacade = new ProdutoOrcamentoFacade();
        try {
            return produtoOrcamentoFacade.listarProdutosOrcamento(descricao);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoOrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Produto Orçamento " + ex);
            return null;
        }
    }
    
    public Produtosorcamento consultar(int idProdutoOrcamento) {
        produtoOrcamentoFacade = new ProdutoOrcamentoFacade();
        try {
            return produtoOrcamentoFacade.consultar(idProdutoOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoOrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Produto Orcamento " + ex);
            return null;
        }
    }
    
    public List<Viewprodutosfiltro> listarFiltroProdutosOrcamento(int idProduto) {
        produtoOrcamentoFacade = new ProdutoOrcamentoFacade();
        try {
            return produtoOrcamentoFacade.listarFiltroProdutosOrcamento(idProduto);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoOrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Filtro Produto Orcamento " + ex);
            return null;
        }
    }
    
    public Viewprodutosfiltro consultarFiltro(int idProduto, int idProdutoOrcamento) {
        produtoOrcamentoFacade = new ProdutoOrcamentoFacade();
        try {
            return produtoOrcamentoFacade.consultarFiltro(idProduto, idProdutoOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoOrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Filtro Produto Orcamento " + ex);
            return null;
        }
    }
}
