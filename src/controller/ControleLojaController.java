/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ControleLojaFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controleloja;
import model.view.Viewconsultacontroleloja;

/**
 *
 * @author Wolverine
 */
public class ControleLojaController {
    
    ControleLojaFacade controleLojaFacade;
    
    public Controleloja salvar(Controleloja controleLoja) {
        controleLojaFacade = new ControleLojaFacade();
        try {
            return controleLojaFacade.salvar(controleLoja);
        } catch (SQLException ex) {
            Logger.getLogger(ControleLojaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Histórico " + ex);
            return null;
        }
    }
    
    public Controleloja consuiltar(int idControleLoja) {
        controleLojaFacade = new ControleLojaFacade();
        try {
            return controleLojaFacade.consuiltar(idControleLoja);
        } catch (SQLException ex) {
            Logger.getLogger(ControleLojaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Histórico " + ex);
            return null;
        }
    }
    
    public List<Viewconsultacontroleloja> listaFollowup(String sql){
        controleLojaFacade = new ControleLojaFacade();
        try {
            return controleLojaFacade.listaFollowup(sql);
       } catch (SQLException ex) {
            Logger.getLogger(ControleLojaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Histórico " + ex);
            return null;
        }
    }
    
    public Controleloja consultar(int idFlollowUp) {
        controleLojaFacade = new ControleLojaFacade();
        try {
            return controleLojaFacade.consultar(idFlollowUp);
       } catch (SQLException ex) {
            Logger.getLogger(ControleLojaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Histórico " + ex);
            return null;
        }
    }
    
}
