/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.CotacaoPacotesFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cotacaopacotes;
import model.view.Viewconsultacotacaopacote;

/**
 *
 * @author Wolverine
 */
public class CotacaoPacotesController {
    
    CotacaoPacotesFacade cotacaoPacotesFacade;
    
    public Cotacaopacotes salvar(Cotacaopacotes cotacaoPacotes) {
        cotacaoPacotesFacade = new CotacaoPacotesFacade();
        try {
            return cotacaoPacotesFacade.salvar(cotacaoPacotes);
        } catch (SQLException ex) {
            Logger.getLogger(CotacaoPacotesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cotação Pacote " + ex);
            return null;
        }
    }
    
    public Cotacaopacotes consultar(int idCotacaopacotes) {
        cotacaoPacotesFacade = new CotacaoPacotesFacade();
        try {
            return cotacaoPacotesFacade.consultar(idCotacaopacotes);
        } catch (SQLException ex) {
            Logger.getLogger(CotacaoPacotesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Cotação Pacote " + ex);
            return null;
        }
    }
    
    public List<Viewconsultacotacaopacote> lista(String sql){
        cotacaoPacotesFacade = new CotacaoPacotesFacade();
        try {
            return cotacaoPacotesFacade.lista(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CotacaoPacotesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Cotação Pacote " + ex);
            return null;
        }
    }
    
}
