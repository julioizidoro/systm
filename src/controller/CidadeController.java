/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.CidadeFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cidade;

/**
 *
 * @author Wolverine
 */
public class CidadeController {
    
    CidadeFacade cidadeFacade;
    
    public Cidade salvar(Cidade cidade) {
        cidadeFacade = new CidadeFacade();
        try {
            return cidadeFacade.salvar(cidade);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar País " + ex);
            return null;
        }
    }
    
    public List<Cidade> listar(String nome) {
        cidadeFacade = new CidadeFacade();
        try {
            return cidadeFacade.listar(nome);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar País " + ex);
            return null;
        }
    }
    
    
    
}
