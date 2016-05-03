/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.CursosFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controlecursos;
import model.Cursos;
import model.view.Viewcontrolecursos;

/**
 *
 * @author Wolverine
 */
public class CursosController {
    
    CursosFacade cursosFacade;
    
    public Cursos salvar(Cursos curso){
        cursosFacade = new CursosFacade();
        try {
            return cursosFacade.salvar(curso);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cursos " + ex);
            return null;
        }
    }
    
    
    
    public Cursos consultarCursos(int idVenda) {
        cursosFacade = new CursosFacade();
        try {
            return cursosFacade.consultarCursos(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Curso " + ex);
            return null;
        }
    }
    
    public void excluir(int idCurso) {
        cursosFacade = new CursosFacade();
        try {
            cursosFacade.excluir(idCurso);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Curso " + ex);
        }
    }
    
    public Controlecursos salvar(Controlecursos controle){
        cursosFacade = new CursosFacade();
        try {
            return cursosFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Curso " + ex);
            return null;
        }
    }
    
    public Controlecursos consultarControleCursos(int idVendas, int idControle)  {
        cursosFacade= new CursosFacade();
        try {
            return cursosFacade.consultarControleCursos(idVendas, idControle);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Curso " + ex);
            return null;
        }
    }
    
    public List<Controlecursos> consultarControleCursosList(int idVendas)  {
        cursosFacade= new CursosFacade();
        try {
            return cursosFacade.consultarControleCursosList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Controle Curso " + ex);
            return null;
        }
    }
    
    public List<Viewcontrolecursos> consultaControleCursos(String sql) {
        cursosFacade = new CursosFacade();
        try {
            return cursosFacade.consultaControleCursos(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Curso " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        cursosFacade = new CursosFacade();
        try {
            return cursosFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Excel " + ex);
            return null;
        }
    }
    
    public void excluirControleCurso(Controlecursos controle) {
        cursosFacade = new CursosFacade();
        try {
            cursosFacade.excluirControleCurso(controle);
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle de Curso " + ex);
        }
    }
    
    public void gerarSitaucaoEmbarcado() {
        cursosFacade = new CursosFacade();
        try {
            cursosFacade.gerarSitaucaoEmbarcado();
        } catch (SQLException ex) {
            Logger.getLogger(CursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro Gerar Embarcados " +  ex);
        }
    }
}
