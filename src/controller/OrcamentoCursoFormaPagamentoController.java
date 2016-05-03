/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.OrcamentoCursoFormaPagamentoFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Orcamentocursoformapagamento;

/**
 *
 * @author Wolverine
 */
public class OrcamentoCursoFormaPagamentoController {
    
    OrcamentoCursoFormaPagamentoFacade orcamentoCursoFormaPagamentoFacade;
    
    public Orcamentocursoformapagamento salvar(Orcamentocursoformapagamento orcamento) {
        orcamentoCursoFormaPagamentoFacade = new OrcamentoCursoFormaPagamentoFacade();
        try {
            return orcamentoCursoFormaPagamentoFacade.salvar(orcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoFormaPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar forma de pagamento " + ex);
            return null;
        }
    }
    
    public Orcamentocursoformapagamento consultar(int idOrcamento) {
        orcamentoCursoFormaPagamentoFacade = new OrcamentoCursoFormaPagamentoFacade();
        try {
            return orcamentoCursoFormaPagamentoFacade.consultar(idOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoCursoFormaPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar forma de pagamento " + ex);
            return null;
        }
    }
    
}
