/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FormaPagamentoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Formapagamento;

/**
 *
 * @author Wolverine
 */
public class FormaPagamentoController {
    
    FormaPagamentoFacade formaPagamentoFacade;
    
    public Formapagamento salvar(Formapagamento formaPagamento){
        formaPagamentoFacade = new FormaPagamentoFacade();
        try {
            return formaPagamentoFacade.salvar(formaPagamento);
        } catch (SQLException ex) {
            Logger.getLogger(FormaPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Forma de Pagameto " + ex);
            return null;
        }
    }
    
    public Formapagamento consultar(int idVenda) {
        formaPagamentoFacade = new FormaPagamentoFacade();
        try {
            return formaPagamentoFacade.consultar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(FormaPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Forma de Pagameto " + ex);
            return null;
        }
    }
    
    public void excluir(int idFormaPagamento) {
        formaPagamentoFacade = new FormaPagamentoFacade();
        try {
            formaPagamentoFacade.excluir(idFormaPagamento);
        } catch (SQLException ex) {
            Logger.getLogger(FormaPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Forma de pagamento "  + ex);
        }
    }
    
    public List<Formapagamento> listar(int idVenda) {
        formaPagamentoFacade = new FormaPagamentoFacade();
        try {
            return formaPagamentoFacade.listar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(FormaPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Lsitar Forma de Pagameto " + ex);
            return null;
        }
    }
}
