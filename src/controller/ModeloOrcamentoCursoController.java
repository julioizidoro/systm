/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ModeloOrcamentoCursoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Modeloorcamentocurso;
import model.Modeloorcamentocursoforma;
import model.Modeloprodutoorcamentocurso;
import model.Produtosorcamento;
import model.view.Viewmodeloorcamento;
import model.view.Vieworcamentocurso;

/**
 *
 * @author Wolverine
 */
public class ModeloOrcamentoCursoController {
    
    ModeloOrcamentoCursoFacade modeloOrcamentoCursoFacade;
    
    public Modeloorcamentocurso salvar(Modeloorcamentocurso orcamento) {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.salvar(orcamento);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Modelo de Orçamento Curso " + ex);
            return null;
        }
    }
    
    public Modeloorcamentocurso consultar(int idOrcamento)  {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.consultar(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Modelo de Orçamento Curso " + ex);
            return null;
        }
    }
    
    public Modeloprodutoorcamentocurso salvar(Modeloprodutoorcamentocurso modeloProdutoOrcamentoCurso){
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.salvar(modeloProdutoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Produto Modelo de Orçamento Curso " + ex);
            return null;
        }
        
    }
    
    public List<Modeloprodutoorcamentocurso> listarProdutoOrcamentoCurso(int idOrcamento) {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.listarProdutoOrcamentoCurso(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Produtos Modelo de Orçamento Curso " + ex);
            return null;
        }
    }
    
    public Produtosorcamento consultarProdutoOrcamentoCurso(int idProdutoOrcamentoCurso){
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.consultarProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Produto Modelo de Orçamento Curso " + ex);
            return null;
        }
        
    }
    
    public void excluirModleoProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            modeloOrcamentoCursoFacade.excluirModleoProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Produto Modelo de Orçamento Curso " + ex);
        }
        
    }
    
    public List<Vieworcamentocurso> listarOrcamentoCurso(String sql) throws SQLException{
        //nada
        return null;
    }
    
    
    public Modeloprodutoorcamentocurso consultarProdutoOrcamentoCuros(int idProdutoOrcamentoCurso){
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.consultarProdutoOrcamentoCuros(idProdutoOrcamentoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Produto Modelo de Orçamento Curso " + ex);
            return null;
        }
    }
    
    public Modeloorcamentocursoforma salvar(Modeloorcamentocursoforma modeloForma) {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.salvar(modeloForma);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar modelo Forma de Pagamento " + ex);
            return null;
        }
    }
     
     public Modeloorcamentocursoforma consultarFormaPagamento(int idOrcamento) {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.consultarFormaPagamento(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar modelo Forma de Pagamento " + ex);
            return null;
        }
    }
     
    public List<Viewmodeloorcamento> listarModeloOrcamentoCurso(String sql) {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.listarModeloOrcamentoCurso(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Modelo Orçamento Curso " + ex);
            return null;
        }
    }
    
    public List<Modeloorcamentocurso> listarModeloOrcamentoCurso() {
        modeloOrcamentoCursoFacade = new ModeloOrcamentoCursoFacade();
        try {
            return modeloOrcamentoCursoFacade.listarModeloOrcamentoCurso();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloOrcamentoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Modelo Orçamento Curso " + ex);
            return null;
        }
    }
    
}
