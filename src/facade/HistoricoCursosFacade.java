/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.HistoricoCursosDao;
import java.sql.SQLException;
import java.util.List;
import model.Historicocursos;

/**
 *
 * @author Julio
 */
public class HistoricoCursosFacade {
    HistoricoCursosDao historicoCursosDao;
    
    public Historicocursos salvar(Historicocursos historicocursos) throws SQLException{
        historicoCursosDao = new HistoricoCursosDao();
        return historicoCursosDao.salvar(historicocursos);
    }
    
    public Historicocursos consultarCursos(int idVenda) throws SQLException {
        historicoCursosDao = new HistoricoCursosDao();
        return historicoCursosDao.consultarHistoricoCursos(idVenda);
    }
    
    
    public List<Historicocursos> listar(String sql) throws SQLException{
        historicoCursosDao = new HistoricoCursosDao();
        return historicoCursosDao.listar(sql);
    }
}
