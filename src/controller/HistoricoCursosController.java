/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.HistoricoCursosFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Historicocursos;

/**
 *
 * @author Julio
 */
public class HistoricoCursosController {
    HistoricoCursosFacade historicoCursosFacade;
    
    public Historicocursos salvar(Historicocursos historicocursos){
        historicoCursosFacade = new HistoricoCursosFacade();
        try {
            return historicoCursosFacade.salvar(historicocursos);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoCursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cursos " + ex);
            return null;
        }
    }
    
    
    
    public Historicocursos consultarHistoricoCursos(int idVenda) {
        historicoCursosFacade = new HistoricoCursosFacade();
        try {
            return historicoCursosFacade.consultarCursos(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoCursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Curso " + ex);
            return null;
        }
    }
    
    
    public List<Historicocursos> listar(String sql) {
        historicoCursosFacade = new HistoricoCursosFacade();
        try {
            return historicoCursosFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Históricos de Cursos " + ex);
            return null;
        }
    }
}
