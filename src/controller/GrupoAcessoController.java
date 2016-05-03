/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.GrupoAcessoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Grupoacesso;

/**
 *
 * @author Wolverine
 */
public class GrupoAcessoController {
    
    GrupoAcessoFacade grupoAcessoFacade;
    
    public Grupoacesso salvar(Grupoacesso grupo) {
        grupoAcessoFacade = new GrupoAcessoFacade();
        try {
            return grupoAcessoFacade.salvar(grupo);
        } catch (SQLException ex) {
            Logger.getLogger(GrupoAcessoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Grupo Acesso " + ex);
            return null;
        }
    }
    
    public Grupoacesso consultar(int idgrupo) {
        grupoAcessoFacade = new GrupoAcessoFacade();
        try {
            return grupoAcessoFacade.consultar(idgrupo);
        } catch (SQLException ex) {
            Logger.getLogger(GrupoAcessoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Grupo Acesso " + ex);
            return null;
        }
    }
    
    public List<Grupoacesso> listar() {
        grupoAcessoFacade= new GrupoAcessoFacade();
        try {
            return grupoAcessoFacade.listar();
        } catch (SQLException ex) {
            Logger.getLogger(GrupoAcessoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Grupo Acesso " + ex);
            return null;
        }
    }
    
}
