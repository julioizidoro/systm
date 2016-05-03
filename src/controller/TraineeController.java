/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import facade.TraineeFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Controletrainee;
import model.Trainee;
import model.view.Viewcontroletrainee;


/**
 *
 * @author Wolverine
 */
public class TraineeController {
    
    TraineeFacade traineeFacade;
    
    public Trainee salvar(Trainee voluntariado) {
        traineeFacade=new TraineeFacade();
        try {
            return traineeFacade.salvar(voluntariado);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Ficha de  Trainee " + ex);
            return null;
        }
    }
    
    public Trainee consultar(int idVenda)  {
        traineeFacade = new TraineeFacade();
        try {
            return traineeFacade.consultar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Ficha de  Trainee " + ex);
            return null;
        }
    }
    
    public void excluir(int idTrainee) {
        traineeFacade = new TraineeFacade();
        try {
            traineeFacade.excluir(idTrainee);
       } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Ficha de  Trainee " + ex);
        }
    }
    
    public Controletrainee salvar(Controletrainee controle) {
        traineeFacade = new TraineeFacade();
        try {
            return traineeFacade.salvar(controle);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Controle Trainee " + ex);
            return null;
        }
    }
    
    public void excluirControleTrainee(Controletrainee controle) {
        traineeFacade = new TraineeFacade();
        try {
            traineeFacade.excluirControleTrainee(controle);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Controle Trainee " + ex);
        }
    }
    
    public Controletrainee consultarControleTrainee(int idVendas, int idControle)  {
        traineeFacade = new TraineeFacade();
        try {
            return traineeFacade.consultarControleTrainee(idVendas, idControle);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Trainee " + ex);
            return null;
        }
    }
    
    public List<Controletrainee> consultarControleTraineeList(int idVendas)  {
        traineeFacade = new TraineeFacade();
        try {
            return traineeFacade.consultarControleTraineeList(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Trainee " + ex);
            return null;
        }
    }
    
    public List<Viewcontroletrainee> consultaControleTrainee(String sql) {
        traineeFacade = new TraineeFacade();
        try {
            return traineeFacade.consultaControleTrainee(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Controle Trainee " + ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) {
        traineeFacade = new TraineeFacade();
        try {
            return traineeFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (Exception ex) {
            Logger.getLogger(TraineeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Controle Trainee " + ex);
            return null;
        }
    }
}
