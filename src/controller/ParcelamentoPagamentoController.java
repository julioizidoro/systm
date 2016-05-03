/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ParcelamentoPagamentoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Parcelamentopagamento;

/**
 *
 * @author Wolverine
 */
public class ParcelamentoPagamentoController {
    
    ParcelamentoPagamentoFacade parcelamentoPagamentoFacade;
    
    public Parcelamentopagamento salvar(Parcelamentopagamento parcelamento) {
        parcelamentoPagamentoFacade = new ParcelamentoPagamentoFacade();
        try {
            return parcelamentoPagamentoFacade.salvar(parcelamento);
        } catch (SQLException ex) {
            Logger.getLogger(ParcelamentoPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Parcelamento Pagamento " + ex);
            return null;
        }
    }
    
    public List<Parcelamentopagamento> listar(int idFormaPagamento) {
        parcelamentoPagamentoFacade = new ParcelamentoPagamentoFacade();
        try {
            return parcelamentoPagamentoFacade.listar(idFormaPagamento);
        } catch (SQLException ex) {
            Logger.getLogger(ParcelamentoPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Parcelamento Pagamento " + ex);
            return null;
        }
    }
    
    public void excluir(int idParcelamento) {
        parcelamentoPagamentoFacade = new ParcelamentoPagamentoFacade();
        try {
            parcelamentoPagamentoFacade.excluir(idParcelamento);
        } catch (SQLException ex) {
            Logger.getLogger(ParcelamentoPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Parcelamento Pagamento " + ex);
        }
    }
    
}
