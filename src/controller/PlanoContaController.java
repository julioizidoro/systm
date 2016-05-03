/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import facade.PlanoContaFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Planoconta;

/**
 *
 * @author Wolverine
 */
public class PlanoContaController {
    
    PlanoContaFacade planoContaFacade;
    
    
    public Planoconta consultar(int idPlanoConta) {
        planoContaFacade = new PlanoContaFacade();
        try {
            return planoContaFacade.consultar(idPlanoConta);
        } catch (SQLException ex) {
            Logger.getLogger(PlanoContaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Plano de Contas "+ ex);
            return null;
        }
    }
}
