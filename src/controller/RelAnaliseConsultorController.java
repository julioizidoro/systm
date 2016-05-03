/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.RelAnaliseConsultorFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Relanaliseconsultor;

/**
 *
 * @author Wolverine
 */
public class RelAnaliseConsultorController {
    
    RelAnaliseConsultorFacade relAnaliseConsultorFacade;
    
    public Relanaliseconsultor salvar(Relanaliseconsultor relanaliseconsultor) {
        relAnaliseConsultorFacade = new RelAnaliseConsultorFacade();
        try {
            return relAnaliseConsultorFacade.salvar(relanaliseconsultor);
        } catch (SQLException ex) {
            Logger.getLogger(RelAnaliseConsultorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Relatorio Análise Consultor " + ex);
            return null;
        }
    }
    
    public void apagar(String local, String porta, String senha, String banco, String usuario)  {
        relAnaliseConsultorFacade = new RelAnaliseConsultorFacade();
        try {
            relAnaliseConsultorFacade.apagar(local, porta, senha, banco, usuario);
        } catch (Exception ex) {
            Logger.getLogger(RelAnaliseConsultorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Apagar Relatorio Análise Consultor " + ex);
        }
    }
    
    public void criar(String local, String porta, String senha, String banco, String usuario)  {
        relAnaliseConsultorFacade = new RelAnaliseConsultorFacade();
        try {
            relAnaliseConsultorFacade.crair(local, porta, senha, banco, usuario);
        } catch (Exception ex) {
            Logger.getLogger(RelAnaliseConsultorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Criar Relatorio Análise Consultor " + ex);
        }
    }
    
}
