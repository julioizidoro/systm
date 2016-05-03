/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.UsuarioFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pincambio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public class UsuarioController {
    
    private UsuarioFacade usuarioFacade;
    
    
    public Usuario salvar(Usuario usuario) {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.salvar(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro salvar usuario " + ex);
            return null;
        }
    }
    
    public Usuario consultar(int idUsuario) {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.consultar(idUsuario);
       } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar usuario " + ex);
            return null;
        }
    }
    
    public Usuario consultar(String login, String senha) {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.consultar(login, senha);
       } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro validar usuario " + ex);
            return null;
        }
    }
    
    public List<Usuario> listaUsuario() {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.listaUsuario();
         } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro listar usuario " + ex);
            return null;
        }
    }
    
    public List<Usuario> listaUsuarioUnidade(int idUnidade) {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.listaUsuarioUnidade(idUnidade);
         } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro listar usuario " + ex);
            return null;
        }
    }
    
    public List<Usuario> listaUsuario(String nome){
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.listaUsuario(nome);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro listar usuario " + ex);
            return null;
        }
    }
    
   
    public Pincambio salvar(Pincambio pincambio) {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.salvar(pincambio);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro salvar PIN " + ex);
            return null;
        }
    }
    
    public Pincambio consultar(String pin, int idUsuario) {
        usuarioFacade = new UsuarioFacade();
        try {
            return usuarioFacade.consultar(pin, idUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar PIN " + ex);
            return null;
        }
    }
    
}
