/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.PublicidadeFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Publicidade;

/**
 *
 * @author Wolverine
 */
public class PublicidadeController {
    
    PublicidadeFacade publicidadeFacade;
    
    public Publicidade salvar(Publicidade publicidade) {
        publicidadeFacade = new PublicidadeFacade();
        try {
            return publicidadeFacade.salvar(publicidade);
        } catch (SQLException ex) {
            Logger.getLogger(PublicidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Publicidade " + ex);
            return null;
        }
    }
    
    public Publicidade consultar(int idPublicidade) {
        publicidadeFacade = new PublicidadeFacade();
        try {
            return publicidadeFacade.consultar(idPublicidade);
        } catch (SQLException ex) {
            Logger.getLogger(PublicidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Publicidade " + ex);
            return null;
        }
    }
    
    public List<Publicidade> listar() {
        publicidadeFacade = new PublicidadeFacade();
        try {
            return publicidadeFacade.listar();
        } catch (SQLException ex) {
            Logger.getLogger(PublicidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Publicidade " + ex);
            return null;
        }
    }
    
}
