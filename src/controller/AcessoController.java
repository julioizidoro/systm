/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.AcessoFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Acesso;

/**
 *
 * @author Wolverine
 */
public class AcessoController {
    
    AcessoFacade acessoFacade;
    
    public Acesso salvar(Acesso acesso){
        acessoFacade = new AcessoFacade();
        try {
            return acessoFacade.salvar(acesso);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro salvar acesso");
            return null;
        }
    }
    
    public Acesso consultar(int idAcesso) {
        acessoFacade = new AcessoFacade();
        try {
            return acessoFacade.consultar(idAcesso);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar acesso");
            return null;
        }
    }
    
}
