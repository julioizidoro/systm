/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.VistosFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controlevistos;
import model.Valoresvistos;
import model.Vistos;
import model.view.Viewcontrolevistos;
import model.view.Viewvendasvisto;

/**
 *
 * @author Wolverine
 */
public class VistosController {
    
    VistosFacade vistosFacade;
    
    public Vistos salvar(Vistos visto) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.salvar(visto);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Vistos " + ex);
            return null;
        }
    }
    
    public Vistos consultarVistos(int idVenda) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.consultarVistos(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Vistos " + ex);
            return null;
        }
    }
    
    public void excluir(int idVisto) {
        vistosFacade = new VistosFacade();
        try {
            vistosFacade.excluir(idVisto);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Vistos " + ex);
        }
    }
    
    public List<Viewvendasvisto> listar(String sql) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Lsitar Vendas Vistos " +  ex);
            return null;
        }
    }
    
    public Controlevistos salvar(Controlevistos controle) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Salvar Controle Vistos " +  ex);
            return null;
        }
    }
    
    public void excluirControleVistos(Controlevistos controle) {
        vistosFacade = new VistosFacade();
        try {
            vistosFacade.excluirControleVistos(controle);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Excluir Controle Vistos " +  ex);
        }
    }
    
    public Controlevistos consultarControleVistos(int idVendas) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.consultarControleVistos(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Consultar Controle Vistos " +  ex);
            return null;
        }
    }
    
    public List<Viewcontrolevistos> consultaControleVistos(String sql) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.consultaControleVistos(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Consultar Controle Vistos " +  ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Exportar Controle Vistos " +  ex);
            return null;
        }
    }
    
    public List<Controlevistos> consultarControleVistosList(int idVendas) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.consultarControleVistosList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Listar Controle Vistos " +  ex);
            return null;
        }
    }
    
    public Valoresvistos salvar(Valoresvistos valoresVisto) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.salvar(valoresVisto);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Salvar Valores Vistos " +  ex);
            return null;
        }
    }
    
    public List<Valoresvistos> listar(){
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.listar();
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Listar Valores Vistos " +  ex);
            return null;
        }
    }
    
    public Valoresvistos consultar(int idvaloresVistos) {
        vistosFacade = new VistosFacade();
        try {
            return vistosFacade.consultar(idvaloresVistos);
        } catch (SQLException ex) {
            Logger.getLogger(VistosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Consultar Valores Vistos " +  ex);
            return null;
        }
    }
    
}
