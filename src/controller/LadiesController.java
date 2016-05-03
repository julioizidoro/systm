/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LadiesDao;
import facade.LadiesFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controleladies;
import model.Ladies;
import model.view.Viewcontroleladies;
import model.view.Viewvendasladies;

/**
 *
 * @author Wolverine
 */
public class LadiesController {
    
    LadiesFacade ladiesFacade;
    
    public Ladies salvar(Ladies curso){
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.salvar(curso);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Ladies " + ex);
            return null;
        }
    }
    
    
    
    public Ladies consultarLadies(int idVenda) {
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.consultarLadies(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Ladies " + ex);
            return null;
        }
    }
    
    public void excluir(int idCurso) {
        ladiesFacade = new LadiesFacade();
        try {
            ladiesFacade.excluir(idCurso);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Ladies " + ex);
        }
    }
    
    public List<Viewvendasladies> listaViewVendasLadies(String sql) {
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.listaViewVendasLadies(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Vendas Ladies " + ex);
            return null;
        }
    }
    
    public Controleladies salvar(Controleladies controle) {
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Ladies " + ex);
            return null;
        }
    }
    
    public void excluirControleLadies(Controleladies controle) {
        ladiesFacade = new LadiesFacade();
        try {
            ladiesFacade.excluirControleLadies(controle);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle Ladies " + ex);
        }
    }
    
    public Controleladies consultarControleLadies(int idVendas) {
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.consultarControleLadies(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Ladies " + ex);
            return null;
        }
    }
    
    public List<Viewcontroleladies> consultaControleLadies(String sql) {
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.consultaControleLadies(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Ladies " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        ladiesFacade = new LadiesFacade();
        try {
            return ladiesFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(LadiesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Controle Ladies " + ex);
            return null;
        }
    }
}
