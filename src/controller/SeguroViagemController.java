/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.SeguroViagemFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controleseguro;
import model.Seguroviagem;
import model.view.Viewcontroleseguro;
import model.view.Viewvendasseguro;

/**
 *
 * @author Wolverine
 */
public class SeguroViagemController {
    
    SeguroViagemFacade seguroViagemFacade;
    
    public Seguroviagem salvar(Seguroviagem seguroViagem) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.salvar(seguroViagem);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Seguro Viagem " + ex);
            return null;
        }
    }
    
    public Seguroviagem consultar(int idVenda) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.consultar(idVenda);
       } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Seguro Viagem " + ex);
            return null;
        }
    }
    
    public void excluir(int idSeguroViagem) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            seguroViagemFacade.excluir(idSeguroViagem);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Seguro viagem " + ex);
        }
    }
    
    public List<Viewvendasseguro> listar(String sql) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Seguro Viagem " + ex);
            return null;
        }
    }
    
    public Controleseguro salvar(Controleseguro controle) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Seguro Viagem " + ex);
            return null;
        }
    }
    
    public void excluirControleSeguro(Controleseguro controle) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            seguroViagemFacade.excluirControleSeguro(controle);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle Seguro Viagem " + ex);
        }
    }
    
    public Controleseguro consultaControleSeguro(int idVendas) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.consultaControleSeguro(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Seguro Viagem " + ex);
            return null;
        }
    }
    
    public List<Viewcontroleseguro> consultaControleSeguro(String sql) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.consultaControleSeguro(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Seguro Viagem " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Controle Seguro Viagem " + ex);
            return null;
        }
    }
    
    public List<Controleseguro> consultarControleSeguroList(int idVendas) {
        seguroViagemFacade = new SeguroViagemFacade();
        try {
            return seguroViagemFacade.consultarControleSeguroList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(SeguroViagemController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Controle Seguro Viagem " + ex);
            return null;
        }
    }
    
}
