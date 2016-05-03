/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ItensAlteradosCursosFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Itensalteradoscurso;

/**
 *
 * @author Julio
 */
public class ItensAlteradosCursosController {
    ItensAlteradosCursosFacade itensAlteradosCursosFacade;
    
    public Itensalteradoscurso salvar(Itensalteradoscurso itensalteradoscurso){
        itensAlteradosCursosFacade = new ItensAlteradosCursosFacade();
        try {
            return itensAlteradosCursosFacade.salvar(itensalteradoscurso);
        } catch (SQLException ex) {
            Logger.getLogger(ItensAlteradosCursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Cursos " + ex);
            return null;
        }
    }
    
    
    
    public Itensalteradoscurso consultarCursos(int idHistoricoCurso) {
        itensAlteradosCursosFacade = new ItensAlteradosCursosFacade();
        try {
            return itensAlteradosCursosFacade.consultarCursos(idHistoricoCurso);
        } catch (SQLException ex) {
            Logger.getLogger(ItensAlteradosCursosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro consultar Curso " + ex);
            return null;
        }
    }
}
