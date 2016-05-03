/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.VoluntariadoDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controlevoluntariado;
import model.Voluntariado;
import model.view.Viewcontrolevoluntariado;

/**
 *
 * @author Wolverine
 */
public class VoluntariadoFacade {
    
    VoluntariadoDao voluntariadoDao;
    
    public Voluntariado salvar(Voluntariado voluntariado) throws SQLException{
        voluntariadoDao=new VoluntariadoDao();
        return voluntariadoDao.salvar(voluntariado);
    }
    
    public Voluntariado consultar(int idVenda) throws SQLException {
        voluntariadoDao = new VoluntariadoDao();
        return voluntariadoDao.consultar(idVenda);
    }
    
    public void excluir(int idVoluntariado) throws SQLException{
        voluntariadoDao = new VoluntariadoDao();
        voluntariadoDao.excluir(idVoluntariado);
    }
    
    public List<Viewcontrolevoluntariado> consultarControleVoluntariado(String sql) throws SQLException {
        voluntariadoDao = new VoluntariadoDao();
        return voluntariadoDao.consultarControleVoluntariado(sql);
    }
    
    public Controlevoluntariado salvar(Controlevoluntariado controlevoluntariado) throws SQLException{
        voluntariadoDao = new VoluntariadoDao();
        return voluntariadoDao.salvar(controlevoluntariado);
    }
    
    public Controlevoluntariado consultarControleVoluntariado(int idVendas, int idControle) throws SQLException {
        voluntariadoDao = new VoluntariadoDao();
        return voluntariadoDao.consultarControleVoluntariado(idVendas, idControle);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        voluntariadoDao = new VoluntariadoDao();
        return voluntariadoDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controlevoluntariado> consultarControleVoluntariado(int idVendas) throws SQLException {
        voluntariadoDao = new VoluntariadoDao();
        return voluntariadoDao.consultarControleVoluntariado(idVendas);
    }
    
}
