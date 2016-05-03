/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.CoeficienteJurosFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Coeficientejuros;

/**
 *
 * @author Wolverine
 */
public class CoeficienteJurosController {
    
    CoeficienteJurosFacade coeficienteJurosFacade;
    
    public Coeficientejuros salvar(Coeficientejuros coeficientejuros) {
        coeficienteJurosFacade = new CoeficienteJurosFacade();
        try {
            return coeficienteJurosFacade.salvar(coeficientejuros);
        } catch (SQLException ex) {
            Logger.getLogger(CoeficienteJurosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Coeficiente de Juros " + ex);
            return null;
        }
    }
    
    public Coeficientejuros consultar(int numeroParcelas) {
        coeficienteJurosFacade = new CoeficienteJurosFacade();
        try {
            return coeficienteJurosFacade.consultar(numeroParcelas);
        } catch (SQLException ex) {
            Logger.getLogger(CoeficienteJurosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Coeficiente de Juros " + ex);
            return null;
        }
    }
    
    public List<Coeficientejuros> listar() {
        coeficienteJurosFacade = new CoeficienteJurosFacade();
        try {
            return coeficienteJurosFacade.listar();
        } catch (SQLException ex) {
            Logger.getLogger(CoeficienteJurosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Coeficiente de Juros " + ex);
            return null;
        }
    }
    
}
