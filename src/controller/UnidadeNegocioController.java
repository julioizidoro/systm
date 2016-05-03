/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.UnidadeNegocioFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public class UnidadeNegocioController {
    
    UnidadeNegocioFacade unidadeNegocioFacade;
    
    public Unidadenegocio salvar(Unidadenegocio unidadeNegocio) {
        unidadeNegocioFacade = new UnidadeNegocioFacade();
        try {
            return unidadeNegocioFacade.salvar(unidadeNegocio);
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeNegocioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Unidade de Negocio " + ex);
            return null;
        }
    }
    
    public Unidadenegocio consultar(int idUnidadeNegocio) {
        unidadeNegocioFacade = new UnidadeNegocioFacade();
        try {
            return unidadeNegocioFacade.consultar(idUnidadeNegocio);
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeNegocioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Unidade de Negocio " + ex);
            return null;
        }
    }
    
    public List<Unidadenegocio> listar() {
        unidadeNegocioFacade = new UnidadeNegocioFacade();
        try {
            return unidadeNegocioFacade.listar();
        } catch (Exception ex) {
            Logger.getLogger(UnidadeNegocioController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Listar de Negocio " + ex);
            return null;
        }
    }
    
}
