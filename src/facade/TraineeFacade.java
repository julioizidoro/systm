/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.TraineeDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controletrainee;
import model.Trainee;
import model.view.Viewcontroletrainee;


/**
 *
 * @author Wolverine
 */
public class TraineeFacade {
    
    TraineeDao traineeDao;
    
    public Trainee salvar(Trainee trainee) throws SQLException{
        traineeDao=new TraineeDao();
        return traineeDao.salvar(trainee);
    }
    
    public Trainee consultar(int idVenda) throws SQLException {
        traineeDao = new TraineeDao();
        return traineeDao.consultar(idVenda);
    }
    
    public void excluir(int idTrainee) throws SQLException{
        traineeDao = new TraineeDao();
        traineeDao.excluir(idTrainee);
    }
    
    public Controletrainee salvar(Controletrainee controle) throws SQLException{
        traineeDao = new TraineeDao();
        return traineeDao.salvar(controle);
    }
    
    public void excluirControleTrainee(Controletrainee controle) throws SQLException{
        traineeDao = new TraineeDao();
        traineeDao.excluirControleTrainee(controle);
    }
    
    public Controletrainee consultarControleTrainee(int idVendas, int idControle) throws SQLException {
        traineeDao = new TraineeDao();
        return traineeDao.consultarControleTrainee(idVendas, idControle);
    }
    
    public List<Controletrainee> consultarControleTraineeList(int idVendas) throws SQLException {
        traineeDao = new TraineeDao();
        return traineeDao.consultarControleTraineeList(idVendas);
    }
    
    public List<Viewcontroletrainee> consultaControleTrainee(String sql) throws SQLException{
        traineeDao = new TraineeDao();
        return traineeDao.consultaControleTrainee(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        traineeDao = new TraineeDao();
        return traineeDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
}
