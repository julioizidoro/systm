/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.LadiesDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controleladies;
import model.Ladies;
import model.view.Viewcontroleladies;
import model.view.Viewvendasladies;


/**
 *
 * @author Wolverine
 */
public class LadiesFacade {
    
    LadiesDao ladiesDao;
    
    public Ladies salvar(Ladies ladies) throws SQLException{
        ladiesDao = new LadiesDao();
        return ladiesDao.salvar(ladies);
    }
    
   
    public Ladies consultarLadies(int idVenda) throws SQLException {
        ladiesDao = new LadiesDao();
        return ladiesDao.consultarLadies(idVenda);
    }
    
    public void excluir(int idCurso) throws SQLException{
        ladiesDao= new LadiesDao();
        ladiesDao.excluir(idCurso);
    }
    
    public List<Viewvendasladies> listaViewVendasLadies(String sql) throws SQLException{
        ladiesDao = new LadiesDao();
        return ladiesDao.listaViewVendasLadies(sql);
    }
    
    public Controleladies salvar(Controleladies controle) throws SQLException{
        ladiesDao = new LadiesDao();
        return ladiesDao.salvar(controle);
    }
    
    public void excluirControleLadies(Controleladies controle) throws SQLException{
        ladiesDao = new LadiesDao();
        ladiesDao.excluirControleLadies(controle);
    }
    
    public Controleladies consultarControleLadies(int idVendas) throws SQLException {
        ladiesDao = new LadiesDao();
        return ladiesDao.consultarControleLadies(idVendas);
    }
    
    public List<Viewcontroleladies> consultaControleLadies(String sql) throws SQLException{
        ladiesDao = new LadiesDao();
        return ladiesDao.consultaControleLadies(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        ladiesDao = new LadiesDao();
        return ladiesDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
}
