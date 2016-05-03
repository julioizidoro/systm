/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.AgendaFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Agenda;
import model.view.Viewconusltaagenda;

/**
 *
 * @author Wolverine
 */
public class AgendaController {
    
    AgendaFacade agendaFacade;
    
    public Agenda salvar(Agenda agenda) {
        agendaFacade = new AgendaFacade();
        try {
            return agendaFacade.salvar(agenda);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Agenda " + ex);
            return null;
        }
    }
    
    public void excluir(int idAgenda) {
        agendaFacade = new AgendaFacade();
        try {
            agendaFacade.excluir(idAgenda);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Agenda " + ex);
        }
    }
    
    public Agenda consultar(int idAgenda) {
        agendaFacade = new AgendaFacade();
        try {
            return agendaFacade.consultar(idAgenda);
         } catch (SQLException ex) {
            Logger.getLogger(AgendaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Agenda " + ex);
            return null;
        }
    }
    
    public List<Viewconusltaagenda> listaViewAgenda(String sql) {
        agendaFacade = new AgendaFacade();
        try {
            return agendaFacade.listaViewAgenda(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Agenda " + ex);
            return null;
        }
    }
    
    public Agenda consultarControle(int idControleLoja) {
        agendaFacade = new AgendaFacade();
        try {
            return agendaFacade.consultarControle(idControleLoja);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Agenda " + ex);
            return null;
        }
    }
    
}
