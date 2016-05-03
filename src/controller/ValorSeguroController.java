/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ValorSeguroFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Valoresseguro;

/**
 *
 * @author Wolverine
 */
public class ValorSeguroController {

            private  ValorSeguroFacade valorSeguroFacade;
    
    public Valoresseguro salvar(Valoresseguro valor) {
        valorSeguroFacade = new ValorSeguroFacade();
        try {
            return valorSeguroFacade.salvar(valor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorSeguroController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Valor " + ex);
            return null;
        }
    }
    public Valoresseguro consultar(int idvalor)  {
        valorSeguroFacade = new ValorSeguroFacade();
        try {
            return valorSeguroFacade.consultar(idvalor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorSeguroController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Valor " + ex);
            return null;
        }
    }
    
    public List<Valoresseguro> listar(int idFornecedor) {
        valorSeguroFacade = new ValorSeguroFacade();
        try {
            return valorSeguroFacade.listar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorSeguroController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
}
