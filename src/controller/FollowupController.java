/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FollowupFacade;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Followup;
import model.view.Viewcosultafollowup;

/**
 *
 * @author Wolverine
 */
public class FollowupController {
    
    FollowupFacade followupFacade;
    
    public Followup salvar(Followup followup) {
        followupFacade = new FollowupFacade();
        try {
            return followupFacade.salvar(followup);
        } catch (SQLException ex) {
            Logger.getLogger(FollowupController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Followup " + ex);
            return null;
        }
    }
    
    public Followup consuiltar(int idFollowup) {
        followupFacade = new FollowupFacade();
        try {
            return followupFacade.consuiltar(idFollowup);
         } catch (SQLException ex) {
            Logger.getLogger(FollowupController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Followup " + ex);
            return null;
        }
    }
    
    public List<Viewcosultafollowup> listaFollowup(String sql){
        followupFacade = new FollowupFacade();
        try {
            return followupFacade.listaFollowup(sql);
        } catch (SQLException ex) {
            Logger.getLogger(FollowupController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar FollowUp" + ex);
            return null;
        }
    }
    
    public Followup consultar(int idCliente) {
        followupFacade = new FollowupFacade();
        try {
            return followupFacade.consultar(idCliente);
         } catch (SQLException ex) {
            Logger.getLogger(FollowupController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar FollowUp Cliente" + ex);
            return null;
        }
    }
    
    public void fecharFollowUpCliente(int idCliente){
        Followup followup = consultar(idCliente);
        if (followup!=null){
            if (followup.getIdfollowup()!=null){
                followup.setSituacao("Fechou");
                followup.setDataFechamneto(new Date());
                followup.setFechou("Sim");
                followup = salvar(followup);
            }
        }
    }
    
}
