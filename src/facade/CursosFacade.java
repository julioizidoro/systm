/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CursosDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controlecursos;
import model.Cursos;
import model.view.Viewcontrolecursos;


/**
 *
 * @author Wolverine
 */
public class CursosFacade {
    
    CursosDao cursosDao;
    
    public Cursos salvar(Cursos curso) throws SQLException{
        cursosDao = new CursosDao();
        return cursosDao.salvar(curso);
    }
    
   
    public Cursos consultarCursos(int idVenda) throws SQLException {
        cursosDao = new CursosDao();
        return cursosDao.consultarCursos(idVenda);
    }
    
    public void excluir(int idCurso) throws SQLException{
        cursosDao= new CursosDao();
        cursosDao.excluir(idCurso);
    }
    
    public Controlecursos salvar(Controlecursos controle) throws SQLException{
        cursosDao = new CursosDao();
        return cursosDao.salvar(controle);
    }
    
    public Controlecursos consultarControleCursos(int idVendas, int idControle) throws SQLException {
        cursosDao = new CursosDao();
        return cursosDao.consultarControleCursos(idVendas, idControle);
    }
    
    public List<Controlecursos> consultarControleCursosList(int idVendas) throws SQLException {
        cursosDao = new CursosDao();
        return cursosDao.consultarControleCursosList(idVendas);
    }
    
    public List<Viewcontrolecursos> consultaControleCursos(String sql) throws SQLException{
        cursosDao = new CursosDao();
        return cursosDao.consultaControleCursos(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        cursosDao = new CursosDao();
        return cursosDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public void excluirControleCurso(Controlecursos controle) throws SQLException{
        cursosDao = new CursosDao();
        cursosDao.excluirControleCurso(controle);
    }
    
    public void gerarSitaucaoEmbarcado() throws SQLException {
        cursosDao = new CursosDao();
        cursosDao.gerarSitaucaoEmbarcado();
    }
    
}
