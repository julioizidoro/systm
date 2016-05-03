/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.OrcamentoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Produtosorcamento;

/**
 *
 * @author Wolverine
 */
public class OrcamentoController {
    
    OrcamentoFacade orcamentoFacade;
    
    public Orcamento salvar(Orcamento orcamento){
        orcamentoFacade = new OrcamentoFacade();
        try {
            return orcamentoFacade.salvar(orcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar orcamento " + ex);
            return null;
        }
    }
    
    public Orcamento consultar(int idVenda){
        orcamentoFacade = new OrcamentoFacade();
        try {
            return orcamentoFacade.consultar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar orcamento " + ex);
            return null;
        }
    }
        
      public Orcamentoprodutosorcamento salvar(Orcamentoprodutosorcamento orcamentoprodutosorcamento) {
        orcamentoFacade = new OrcamentoFacade();
        try {
            return orcamentoFacade.salvar(orcamentoprodutosorcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Orcamento Produto  " + ex);
            return null;
        }
    }
      
      public List<Orcamentoprodutosorcamento> listarOrcamentoProdutoOrcamento(int idOrcamento) {
          orcamentoFacade = new OrcamentoFacade();
        try {
            return orcamentoFacade.listarOrcamentoProdutoOrcamento(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Orcamento Produto  " + ex);
            return null;
        }
      }
      
      public Produtosorcamento consultarProdutoOrcamento(int idProdutoOrcamento) {
          orcamentoFacade = new OrcamentoFacade();
        try {
            return orcamentoFacade.consultarProdutoOrcamento(idProdutoOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Orcamento Produto  " + ex);
            return null;
        }
      }
      
      public void excluirOrcamentoProdutoOrcamento(int idOrcamentoprodutosorcamento) {
          orcamentoFacade = new OrcamentoFacade();
        try {
            orcamentoFacade.excluirOrcamentoProdutoOrcamento(idOrcamentoprodutosorcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Orcamento Produto  " + ex);
        }
      }
      
      public void excluirOrcamento(int idOrcamento) {
        orcamentoFacade = new OrcamentoFacade();
        try {
            orcamentoFacade.excluirOrcamento(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Orcamento " + ex);
        }
      }
      
      public Orcamentoprodutosorcamento consultarOrcamentoProdutoOrcamento(int idIrcamentoProdutosOrcamento) {
         orcamentoFacade = new OrcamentoFacade();
        try {
            return orcamentoFacade.consultarOrcamentoProdutoOrcamento(idIrcamentoProdutosOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar  Orcamento Produto Orcamento " + ex);
            return null;
        } 
      }
}
