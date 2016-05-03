/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ValorProgramasTeensFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Valoresprogramasteens;

/**
 *
 * @author Wolverine
 */
public class ValorProgramasTeensController {

            private  ValorProgramasTeensFacade valorProgramasTeensFacade;
    
    public Valoresprogramasteens salvar(Valoresprogramasteens valor) {
        valorProgramasTeensFacade = new ValorProgramasTeensFacade();
        try {
            return valorProgramasTeensFacade.salvar(valor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Valor " + ex);
            return null;
        }
    }
    public Valoresprogramasteens consultar(int idvalor)  {
        valorProgramasTeensFacade = new ValorProgramasTeensFacade();
        try {
            return valorProgramasTeensFacade.consultar(idvalor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Valor " + ex);
            return null;
        }
    }
    
    public List<Valoresprogramasteens> listar(int idFornecedor) {
        valorProgramasTeensFacade = new ValorProgramasTeensFacade();
        try {
            return valorProgramasTeensFacade.listar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
}
