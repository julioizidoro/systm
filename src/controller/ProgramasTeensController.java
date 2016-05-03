/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ProgramasTeensFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controleprogramasteens;
import model.Programasteens;
import model.view.Viewcontroleprogramasteens;

/**
 *
 * @author Wolverine
 */
public class ProgramasTeensController {
    
    ProgramasTeensFacade programasTeensFacade;
    
    public Programasteens salvar(Programasteens programasTeens){
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.salvar(programasTeens);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Programas Teens " + ex);
            return null;
        }
    }
    
    
    
    public Programasteens consultarProgramasteens(int idVenda) {
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.consultarProgramasteens(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Programas Teens " + ex);
            return null;
        }
    }
    
    public void excluir(int idProgramasTeens) {
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            programasTeensFacade.excluir(idProgramasTeens);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Programas Teens " + ex);
        }
    }
    
    public Controleprogramasteens salvar(Controleprogramasteens controle) {
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Programas Teens " + ex);
            return null;
        }
    }
    
    public void excluirControleProgramasTeens(Controleprogramasteens controle) {
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            programasTeensFacade.excluirControleProgramasTeens(controle);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle Programas Teens " + ex);
        }
    }
    
    public Controleprogramasteens consultarControleProgramasTeens(int idVendas)  {
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.consultarControleProgramasTeens(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Programas Teens " + ex);
            return null;
        }
    }
    
    public List<Viewcontroleprogramasteens> consultaControleProgramasTeens(String sql) {
        programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.consultaControleProgramasTeens(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Programas Teens " + ex);
            return null;
        }
    }
    
     public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
         programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Controle Programas Teens " + ex);
            return null;
        }
     }
     
     public List<Controleprogramasteens> consultarControleProgramasTeensList(int idVendas)  {
         programasTeensFacade = new ProgramasTeensFacade();
        try {
            return programasTeensFacade.consultarControleProgramasTeensList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramasTeensController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Controle Programas Teens " + ex);
            return null;
        }
     }
}
