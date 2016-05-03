/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.ValorTraineeFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Valorestrainee;
import model.view.Viewconsultavaloreswork;

/**
 *
 * @author Wolverine
 */
public class ValorTraineeController {

            private  ValorTraineeFacade valorTraineeFacade;
    
    public Valorestrainee salvar(Valorestrainee valor) {
        valorTraineeFacade = new ValorTraineeFacade();
        try {
            return valorTraineeFacade.salvar(valor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorTraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Valor " + ex);
            return null;
        }
    }
    public Valorestrainee consultar(int idvalor)  {
        valorTraineeFacade = new ValorTraineeFacade();
        try {
            return valorTraineeFacade.consultar(idvalor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorTraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Valor " + ex);
            return null;
        }
    }
    
    public List<Valorestrainee> listar(int idFornecedor) {
        valorTraineeFacade = new ValorTraineeFacade();
        try {
            return valorTraineeFacade.listar(idFornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(ValorTraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Valores " + ex);
            return null;
        }
    }
}
