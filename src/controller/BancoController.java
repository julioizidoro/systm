/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.BancoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Banco;

/**
 *
 * @author Wolverine
 */
public class BancoController {
    
    BancoFacade bancoFacade;
    
    public List<Banco> listar() {
        bancoFacade = new BancoFacade();
        try {
            return bancoFacade.listar();
        } catch (SQLException ex) {
            Logger.getLogger(BancoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Bancos " + ex);
            return null;
        }
    }
    
}
