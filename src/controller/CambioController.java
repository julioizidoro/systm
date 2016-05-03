/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.CambioFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cambio;
import model.Moedas;

/**
 *
 * @author Wolverine
 */
public class CambioController {
    
    CambioFacade cambioFacade;
    
    public Cambio salvar(Cambio cambio) {
        cambioFacade = new CambioFacade();
        try {
            return cambioFacade.salvar(cambio);
        } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cambio " + ex);
            return null;
        }
    }
    
    public void excluir(Cambio cambio) {
        cambioFacade = new CambioFacade();
        try {
            cambioFacade.excluir(cambio);
       } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Cambio " + ex);
        }
    }
    
    public List<Moedas> listaMoedas() {
        cambioFacade = new CambioFacade();
        try {
            return cambioFacade.listaMoedas();
        } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Moedas " + ex);
            return null;
        }
    }
    
    public Cambio consultar(int idCambio) {
        cambioFacade = new CambioFacade();
        try {
            return cambioFacade.consultar(idCambio);
        } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Cambio " + ex);
            return null;
        }
    }
    
    public Cambio consultarCambioMoeda(String data, int idMoeda) {
        cambioFacade = new CambioFacade();
        try {
            return cambioFacade.consultarCambioMoeda(data, idMoeda);
        } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Cambio " + ex);
            return null;
        }
    }
    
    public Moedas consultarMoeda(int idMoeda) {
        cambioFacade = new CambioFacade();
        try {
            return cambioFacade.consultarMoeda(idMoeda);
        } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Moedas " + ex);
            return null;
        }
    }
    
    public List<Cambio> listar(String data) {
        cambioFacade = new CambioFacade();
        try {
            return cambioFacade.listar(data);
        } catch (SQLException ex) {
            Logger.getLogger(CambioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Câmbio " + ex);
            return null;
        }
    }
    
}
