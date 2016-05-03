/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.VendasFacade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Vendas;
import model.view.Viewvendascurso;
import model.view.Viewvendashighschool;
import model.view.Viewvendasprogramasteens;
import model.view.Viewvendastrainee;
import model.view.Viewvendasvoluntariado;


/**
 *
 * @author Wolverine
 */
public class VendasController {
    
    VendasFacade vendasFacade;
    
    public Vendas salvar(Vendas venda) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.salvar(venda);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Venda");
            return null;
        }
    }
    
    public Vendas consultarVendas(int idVenda) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.consultarVendas(idVenda);
       } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Venda");
            return null;
        }
    }
    
    public List<Viewvendascurso> listaViewVendasCrusos(String sql) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.listaViewVendasCursos(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Cursos " + ex);
            return null;
        }
    }
    
    public List<Viewvendashighschool> listaViewVendasHighSchool(String sql) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.listaViewVendasHighSchool(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas High School " + ex);
            return null;
        }
    }
    
    public List<Viewvendasprogramasteens> listaViewVendasProgramasTeens(String sql) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.listaViewVendasProgramasTeens(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas High School " + ex);
            return null;
        }
    }
    
    public void excluir(int idVenda) {
        vendasFacade = new VendasFacade();
        try {
            vendasFacade.excluir(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Vendas " +ex);
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql)  {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
       } catch (Exception ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Excel " +ex);
            return null;
        }
    }
    
    public List<Viewvendasvoluntariado> listaViewVendasVoluntariado(String sql) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.listaViewVendasVoluntariado(sql);
        } catch (Exception ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Voluntariado " +ex);
            return null;
        }
    }
    
    public List<Viewvendastrainee> listaViewVendasTrainee(String sql) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.listaViewVendasTrainee(sql);
        } catch (Exception ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Trainee " +ex);
            return null;
        }
    }
    
    public List<Vendas> lista() {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.lista();
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas " +ex);
            return null;
        }
    }
    
}
