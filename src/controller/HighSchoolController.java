/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.HighSchoolDao;
import facade.HighSchoolFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controlehighschool;
import model.Highschool;
import model.view.Viewcontrolehighschool;

/**
 *
 * @author Wolverine
 */
public class HighSchoolController {
    
    HighSchoolFacade highSchoolFacade;
    
    public Highschool salvar(Highschool highSchool){
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.salvar(highSchool);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar High School " + ex);
            return null;
        }
    }
    
    
    
    public Highschool consultarHighschool(int idVenda) {
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.consultarHighschool(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar High School " + ex);
            return null;
        }
    }
    
    public void excluir(int idHighSchool) {
        highSchoolFacade = new HighSchoolFacade();
        try {
            highSchoolFacade.excluir(idHighSchool);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir High School " + ex);
        }
    }
    
    public Controlehighschool salvar(Controlehighschool controle) {
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle High School " + ex);
            return null;
        }
    }
    
    public void excluirControleHighSchool(Controlehighschool controle) {
        highSchoolFacade = new HighSchoolFacade();
        try {
            highSchoolFacade.excluirControleHighSchool(controle);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle High School " + ex);
        }
    }
    
    public Controlehighschool consultarControleHighSchool(int idVendas)  {
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.consultarControleHighSchool(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle High School " + ex);
            return null;
        }
    }
    
    public List<Viewcontrolehighschool> consultaControleHighSchool(String sql) {
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.consultaControleHighSchool(sql);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle High School " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Controle High School " + ex);
            return null;
        }
    }
    
    public List<Controlehighschool> consultarControleCursosList(int idVendas) {
        highSchoolFacade = new HighSchoolFacade();
        try {
            return highSchoolFacade.consultarControleCursosList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Controle High School " + ex);
            return null;
        }
    }
}
