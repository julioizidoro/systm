/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ArquivosFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Arquivos;
import model.Tipoarquivo;
import model.Tipoarquivousuario;
import model.view.Viewconsultaarquivo;
import model.view.Viewtipoarquivousuario;

/**
 *
 * @author Wolverine
 */
public class ArquivosController {
    
    ArquivosFacade arquivosFacade;
    
    public Arquivos salvar(Arquivos arquivo) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.salvar(arquivo);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Salvar Arquivo "  + ex);
            return null;
        }
    }
    
    public Arquivos consultar(int idArquivo) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.consultar(idArquivo);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Consultar Arquivo "  + ex);
            return null;
        }
    }
    
    public List<Viewconsultaarquivo> listar(String sql) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Listar Arquivo "  + ex);
            return null;
        }
    }
    
    public void excluir(int idArquivo) {
        arquivosFacade = new ArquivosFacade();
        try {
            arquivosFacade.excluir(idArquivo);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Excluir Arquivo "  + ex);
        }
    }
    
    
    public Tipoarquivo salvar(Tipoarquivo tipo) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.salvar(tipo);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Salvar Tipo Arquivo "  + ex);
            return null;
        }
    }
    
    public List<Tipoarquivo> listarArquivos(String sql) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.listarArquivos(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Listar Tipo Arquivo "  + ex);
            return null;
        }
    }
    
    public Tipoarquivousuario salvar(Tipoarquivousuario tipo) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.salvar(tipo);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Salvar Tipo Arquivo Usuário "  + ex);
            return null;
        }
    }
    
    public List<Viewtipoarquivousuario> listarTipoUsuario(int idTipo) {
        arquivosFacade = new ArquivosFacade();
        try {
            return arquivosFacade.listarTipoUsuario(idTipo);
        } catch (SQLException ex) {
            Logger.getLogger(ArquivosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Listar Tipo Arquivo Usuário "  + ex);
            return null;
        }
    }
}
