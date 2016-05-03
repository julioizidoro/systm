/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FaturaFranquiasFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Faturafranquias;

/**
 *
 * @author Wolverine
 */
public class FaturaFranquiasController {
    
    private FaturaFranquiasFacade faturaFranquiasFacade;
    
    public Faturafranquias salvar(Faturafranquias faturafranquias){
        faturaFranquiasFacade = new FaturaFranquiasFacade();
        try {
            return faturaFranquiasFacade.salvar(faturafranquias);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaFranquiasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fatura Franquia " + ex);
            return null;
        }
    }
    
    public Faturafranquias getFaturaFranquia(int idVendasComissao){
        faturaFranquiasFacade = new FaturaFranquiasFacade();
        try {
            return faturaFranquiasFacade.getFaturaFranquia(idVendasComissao);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaFranquiasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fatura Franquia " + ex);
            return null;
        }
    }
    
    public void excluir(int idFaturaFranquias) {
        faturaFranquiasFacade = new FaturaFranquiasFacade();
        try {
            faturaFranquiasFacade.excluir(idFaturaFranquias);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaFranquiasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Fatura Franquia " + ex);
        }
    }
    
    
}
