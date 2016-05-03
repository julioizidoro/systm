/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.PaisFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pais;

/**
 *
 * @author Wolverine
 */
public class PaisController {
    
    PaisFacade paisFacade;
    
    public Pais salvar(Pais pais) {
        paisFacade = new PaisFacade();
        try {
            return paisFacade.salvar(pais);
        } catch (SQLException ex) {
            Logger.getLogger(PaisController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar País " + ex);
            return null;
        }
    }
    
    public List<Pais> listar(String nome) {
        paisFacade = new PaisFacade();
        try {
            return paisFacade.listar(nome);
        } catch (SQLException ex) {
            Logger.getLogger(PaisController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar País " + ex);
            return null;
        }
    }
    
    public Pais consultar(int idPais) {
        paisFacade = new PaisFacade();
        try {
            return paisFacade.consultar(idPais);
        } catch (SQLException ex) {
            Logger.getLogger(PaisController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar País " + ex);
            return null;
        }
    }
}
