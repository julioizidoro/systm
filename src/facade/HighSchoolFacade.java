/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.HighSchoolDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controlehighschool;
import model.Highschool;
import model.view.Viewcontrolehighschool;


/**
 *
 * @author Wolverine
 */
public class HighSchoolFacade {
    
    HighSchoolDao highSchoolDao;
    
    public Highschool salvar(Highschool highSchool) throws SQLException{
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.salvar(highSchool);
    }
    
   
    public Highschool consultarHighschool(int idVenda) throws SQLException {
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.consultarHighschool(idVenda);
    }
    
    public void excluir(int idHighSchool) throws SQLException{
        highSchoolDao= new HighSchoolDao();
        highSchoolDao.excluir(idHighSchool);
    }
    
    public Controlehighschool salvar(Controlehighschool controle) throws SQLException{
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.salvar(controle);
    }
    
    public void excluirControleHighSchool(Controlehighschool controle) throws SQLException{
        highSchoolDao = new HighSchoolDao();
        highSchoolDao.excluirControleHighSchool(controle);
    }
    
    public Controlehighschool consultarControleHighSchool(int idVendas) throws SQLException {
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.consultarControleHighSchool(idVendas);
    }
    
    public List<Viewcontrolehighschool> consultaControleHighSchool(String sql) throws SQLException{
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.consultaControleHighSchool(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controlehighschool> consultarControleCursosList(int idVendas) throws SQLException {
        highSchoolDao = new HighSchoolDao();
        return highSchoolDao.consultarControleCursosList(idVendas);
    }
    
}
