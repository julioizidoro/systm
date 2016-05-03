/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ParametrosProdutosFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Parametrosprodutos;


/**
 *
 * @author Wolverine
 */
public class ParametrosProdutosController {
    
    ParametrosProdutosFacade parametrosProdutosFacade;
    
    public Parametrosprodutos salvar(Parametrosprodutos parametrosprodutos) {
        parametrosProdutosFacade = new ParametrosProdutosFacade();
        try {
            return parametrosProdutosFacade.salvar(parametrosprodutos);
        } catch (SQLException ex) {
            Logger.getLogger(ParametrosProdutosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Parametros Produtos " + ex);
            return null;
        }
    }
    
    public Parametrosprodutos consultar() {
        parametrosProdutosFacade = new ParametrosProdutosFacade();
        try {
            return parametrosProdutosFacade.consultar();
        } catch (SQLException ex) {
            Logger.getLogger(ParametrosProdutosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Parametros Produtos " + ex);
            return null;
        }
    }
    
}
