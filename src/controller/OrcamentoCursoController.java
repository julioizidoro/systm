/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrcamentoCursoDao;
import facade.OrcamentoCursoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Orcamentocurso;
import model.Produtoorcamentocurso;
import model.Produtosorcamento;
import model.view.Vieworcamentocurso;

/**
 *
 * @author Wolverine
 */
public class OrcamentoCursoController {
    
    OrcamentoCursoFacade orcamentoCursoFacade;
    
    public Orcamentocurso salvar(Orcamentocurso orcamento) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.salvar(orcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Orcamento Curso " + ex);
            return null;
        }
    }
    
    public Orcamentocurso consultar(int idOrcamento) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.consultar(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Orcamento Curso " + ex);
            return null;
        }
    }
    
    public Produtoorcamentocurso salvar(Produtoorcamentocurso produtoOrcamentoCurso) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.salvar(produtoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Orcamento Curso Produto " + ex);
            return null;
        }
    }
    
    public List<Produtoorcamentocurso> listarProdutoOrcamentoCurso(int idOrcamento){
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.listarProdutoOrcamentoCurso(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Produto Orcamento Curso " + ex);
            return null;
        }
    }
    
    public Produtosorcamento consultarProdutoOrcamentoCurso(int idProdutoOrcamentoCurso){
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.consultarProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Produto Orcamento Curso " + ex);
            return null;
        }
    }
    
    public void excluirProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            orcamentoCursoFacade.excluirProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
       } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Produto Orcamento Curso " + ex);
        }
    }
    
    public List<Vieworcamentocurso> listarOrcamentoCurso(String sql) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.listarOrcamentoCurso(sql);
       } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Orcamento Curso " + ex);
            return null;
        }
    }
    
    public Orcamentocurso consultarCliente(int idCliente) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.consultarCliente(idCliente);
       } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Orcamento Curso " + ex);
            return null;
        }
    }
    
    public Produtoorcamentocurso consultarProdutoOrcamentoCuros(int idProdutoOrcamentoCurso) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.consultarProdutoOrcamentoCuros(idProdutoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Consultar Curso Produto " + ex);
            return null;
        }
    }
    
    public void excluirOrcamentoCuros(int idOrcamento) {
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            orcamentoCursoFacade.excluirOrcamentoCuros(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Orçamento " + ex);
        }
    }
    
    public List<Orcamentocurso> listarOrcamentoCurso(){
        orcamentoCursoFacade = new OrcamentoCursoFacade();
        try {
            return orcamentoCursoFacade.listarOrcamentoCurso();
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Consultar Curso Produto " + ex);
            return null;
        }
    }
    
    
}
