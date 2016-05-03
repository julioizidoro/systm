/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.WorkTravelDao;
import facade.CursosFacade;
import facade.WorkTravelFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controlework;
import model.Worktravel;
import model.view.Viewcontrolework;
import model.view.Viewvendasworktravel;


/**
 *
 * @author Wolverine
 */
public class WorkTravelController {
    
    WorkTravelFacade workFacade;
    
    public Worktravel salvar(Worktravel work){
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.salvar(work);
        } catch (SQLException ex) {
            Logger.getLogger(WorkTravelController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Work¨& Travel " + ex);
            return null;
        }
    }
    
    
    
    public Worktravel consultarWorktravel(int idVenda) {
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.consultarWork(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(WorkTravelController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Work & Travel " + ex);
            return null;
        }
    }
    
    public void excluir(int idWork) {
        workFacade = new WorkTravelFacade();
        try {
            workFacade.excluir(idWork);
        } catch (SQLException ex) {
            Logger.getLogger(WorkTravelController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Work & Travel " + ex);
        }
    }
    
    public List<Viewvendasworktravel> listaViewVendasWorktravel(String sql) {
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.listaViewVendasWork(sql);
        } catch (SQLException ex) {
            Logger.getLogger(WorkTravelController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Work & Travel " + ex);
            return null;
        }
    }
    
    public Controlework salvar(Controlework controle){
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Work " + ex);
            return null;
        }
    }
    
    public Controlework consultarControleWork(int idVendas)  {
        workFacade= new WorkTravelFacade();
        try {
            return workFacade.consultarControleWork(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Work " + ex);
            return null;
        }
    }
    
    public List<Viewcontrolework> consultaControleWork(String sql) {
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.consultaControleWork(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Work " + ex);
            return null;
        }
    }
    
    public void excluirControleWork(Controlework controle) {
        workFacade = new WorkTravelFacade();
        try {
            workFacade.excluirControleWork(controle);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle de Work " + ex);
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(WorkTravelController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Exporta para Excel " + ex);
            return null;
        }
    }
    
    public List<Controlework> consultarControleCursosList(int idVendas)  {
        workFacade = new WorkTravelFacade();
        try {
            return workFacade.consultarControleCursosList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(WorkTravelController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Listar Controle Work " + ex);
            return null;
        }
    }
}
