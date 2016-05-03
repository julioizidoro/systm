/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.AupairFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aupair;
import model.Controleaupair;
import model.view.Viewcontroleaupair;
import model.view.Viewvendasaupair;

/**
 *
 * @author Wolverine
 */
public class AupairController {
    
    AupairFacade aupairFacade;
    
    public Aupair salvar(Aupair curso){
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.salvar(curso);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Aupair " + ex);
            return null;
        }
    }
    
    
    
    public Aupair consultarAupair(int idVenda) {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.consultarAupair(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Aupair " + ex);
            return null;
        }
    }
    
    public void excluir(int idCurso) {
        aupairFacade = new AupairFacade();
        try {
            aupairFacade.excluir(idCurso);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Aupair " + ex);
        }
    }
    
    public List<Viewvendasaupair> listaViewVendasAupair(String sql) {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.listaViewVendasAupair(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Aupair " + ex);
            return null;
        }
    }
    
    public Controleaupair salvar(Controleaupair controle) {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Aupair " + ex);
            return null;
        }
    }
    
    public void excluirControleAupair(Controleaupair controle) {
        aupairFacade = new AupairFacade();
        try {
            aupairFacade.excluirControleAupair(controle);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle Aupair " + ex);
        }
    }
    
    public Controleaupair consultarControleAupair(int idVendas)  {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.consultarControleAupair(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Aupair " + ex);
            return null;
        }
    }
    
    public List<Viewcontroleaupair> consultaControleAupair(String sql) {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.consultaControleAupair(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Aupair " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar  Controle Aupair " + ex);
            return null;
        }
    }
    
    public List<Controleaupair> consultarControleAupairList(int idVendas) {
        aupairFacade = new AupairFacade();
        try {
            return aupairFacade.consultarControleAupairList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(AupairController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Controle Aupair " + ex);
            return null;
        }
    }
}
