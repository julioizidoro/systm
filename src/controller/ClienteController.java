/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ClienteFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.view.Viewcliente;

/**
 *
 * @author Wolverine
 */
public class ClienteController {
    
    ClienteFacade clienteFacade;
    
    public Cliente salvar(Cliente cliente) {
        clienteFacade = new ClienteFacade();
        try {
            return clienteFacade.salvar(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cliente " + ex);
            return null;
        }
    }
    
    public List<Viewcliente> listar(String sql) {
        clienteFacade = new ClienteFacade();
        try {
            return clienteFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Cliente " + ex);
            return null;
        }
    }
    
    public Cliente consultar(int idCliente) {
        clienteFacade = new ClienteFacade();
        try {
            return clienteFacade.consultar(idCliente);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Cliente " + ex);
            return null;
        }
    }
    
    public Cliente consultarEmail(String email){
        clienteFacade = new ClienteFacade();
        try {
            return clienteFacade.consultarEmail(email);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Cliente por email " + ex);
            return null;
        }
    }
    
}
