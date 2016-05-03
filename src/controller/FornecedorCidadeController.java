/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FornecedorCidadeFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedorcidade;

/**
 *
 * @author Wolverine
 */
public class FornecedorCidadeController {
    
    FornecedorCidadeFacade fornecedorCidadeFacade;
    
    public Fornecedorcidade salvar(Fornecedorcidade fornecedorcidade) {
        fornecedorCidadeFacade = new FornecedorCidadeFacade();
        try {
            return fornecedorCidadeFacade.salvar(fornecedorcidade);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor Cidade " + ex);
            return null;
        }
    }
    
    public List<Fornecedorcidade> listar(String sql) {
        fornecedorCidadeFacade = new FornecedorCidadeFacade();
        try {
            return fornecedorCidadeFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Fornecedor Cidade " + ex);
            return null;
        }
    }
    
    public Fornecedorcidade getFonecedorCidade(int idFornecedor, int idCidade) {
        fornecedorCidadeFacade = new FornecedorCidadeFacade();
        try {
            return fornecedorCidadeFacade.getFonecedorCidade(idFornecedor, idCidade);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fornecedor Cidade " + ex);
            return null;
        }
    }
    
    public Fornecedorcidade getFornecedorCidade(int idFornecedorCidade) {
        fornecedorCidadeFacade = new FornecedorCidadeFacade();
        try {
            return fornecedorCidadeFacade.getFornecedorCidade(idFornecedorCidade);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fornecedor Cidade " + ex);
            return null;
        }
    }
    
    public Fornecedorcidade getFonecedorCidade(int idCodigo) {
        fornecedorCidadeFacade = new FornecedorCidadeFacade();
        try {
            return fornecedorCidadeFacade.getFonecedorCidade(idCodigo);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fornecedor Cidade " + ex);
            return null;
        }
        
    }
    
}
