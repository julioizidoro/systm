/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import facade.VoluntariadoFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controlevoluntariado;
import model.Voluntariado;
import model.view.Viewcontrolevoluntariado;

/**
 *
 * @author Wolverine
 */
public class VoluntariadoController {
    
    VoluntariadoFacade voluntariadoFacade;
    
    public Voluntariado salvar(Voluntariado voluntariado) {
        voluntariadoFacade=new VoluntariadoFacade();
        try {
            return voluntariadoFacade.salvar(voluntariado);
        } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Ficha de  Voluntariado " + ex);
            return null;
        }
    }
    
    public Voluntariado consultar(int idVenda)  {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            return voluntariadoFacade.consultar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Ficha de  Voluntariado " + ex);
            return null;
        }
    }
    
    public void excluir(int idVoluntariado) {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            voluntariadoFacade.excluir(idVoluntariado);
       } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Ficha de  Voluntariado " + ex);
        }
    }
    
    public List<Viewcontrolevoluntariado> consultarControleVoluntariado(String sql) {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            return voluntariadoFacade.consultarControleVoluntariado(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Voluntáriado " + ex);
            return null;
        }
    }
    
    public Controlevoluntariado salvar(Controlevoluntariado controlevoluntariado) {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            return voluntariadoFacade.salvar(controlevoluntariado);
        } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle " + ex);
            return null;
        }
    }
    
    public Controlevoluntariado consultarControleVoluntariado(int idVendas, int idControle) {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            return voluntariadoFacade.consultarControleVoluntariado(idVendas, idControle);
        } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Consultar Controle " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            return voluntariadoFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Excel");
            return null;
        }
    }
    
    public List<Controlevoluntariado> consultarControleVoluntariado(int idVendas) {
        voluntariadoFacade = new VoluntariadoFacade();
        try {
            return voluntariadoFacade.consultarControleVoluntariado(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(VoluntariadoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Listar Controle " + ex);
            return null;
        }
    }
    
}
