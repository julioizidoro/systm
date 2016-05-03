/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.CancelamentoFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cancelamento;

/**
 *
 * @author Wolverine
 */
public class CancelamentoController {
    
    private CancelamentoFacade cancelamentoFacade;
    
    public Cancelamento salvar(Cancelamento cancelamento) {
        cancelamentoFacade = new CancelamentoFacade();
        try {
            return cancelamentoFacade.salvar(cancelamento);
        } catch (SQLException ex) {
            Logger.getLogger(CancelamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cancelamento " + ex);
            return null;
        }
    }
    
    public Cancelamento cunsultar(int idVenda) {
        cancelamentoFacade = new CancelamentoFacade();
        try {
            return cancelamentoFacade.cunsultar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(CancelamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Cancelamento " + ex);
            return null;
        }
    }
    
}
