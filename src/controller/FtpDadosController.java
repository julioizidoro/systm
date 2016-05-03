/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FtpDadosFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ftpdados;

/**
 *
 * @author Wolverine
 */
public class FtpDadosController {
    FtpDadosFacade ftpDadosFacade;
    
    public Ftpdados getFTPDados(){
        ftpDadosFacade = new FtpDadosFacade();
        try {
            return ftpDadosFacade.getFTPDados();
        } catch (SQLException ex) {
            Logger.getLogger(FtpDadosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro consultar dados FTP " +  ex);
            return null;
        }
    }
    
}
