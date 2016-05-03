/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.AupairDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Aupair;
import model.Controleaupair;
import model.view.Viewcontroleaupair;
import model.view.Viewvendasaupair;


/**
 *
 * @author Wolverine
 */
public class AupairFacade {
    
    AupairDao aupairDao;
    
    public Aupair salvar(Aupair aupair) throws SQLException{
        aupairDao = new AupairDao();
        return aupairDao.salvar(aupair);
    }
    
   
    public Aupair consultarAupair(int idVenda) throws SQLException {
        aupairDao = new AupairDao();
        return aupairDao.consultarAupair(idVenda);
    }
    
    public void excluir(int idCurso) throws SQLException{
        aupairDao= new AupairDao();
        aupairDao.excluir(idCurso);
    }
    
    public List<Viewvendasaupair> listaViewVendasAupair(String sql) throws SQLException{
        aupairDao = new AupairDao();
        return aupairDao.listaViewVendasAupair(sql);
    }
    
    public Controleaupair salvar(Controleaupair controle) throws SQLException{
        aupairDao = new AupairDao();
        return aupairDao.salvar(controle);
    }
    
    public void excluirControleAupair(Controleaupair controle) throws SQLException{
        aupairDao = new AupairDao();
        aupairDao.excluirControleAupair(controle);
    }
    
    public Controleaupair consultarControleAupair(int idVendas) throws SQLException {
        aupairDao = new AupairDao();
        return aupairDao.consultarControleAupair(idVendas);
    }
    
    public List<Viewcontroleaupair> consultaControleAupair(String sql) throws SQLException{
        aupairDao = new AupairDao();
        return aupairDao.consultaControleAupair(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        aupairDao = new AupairDao();
        return aupairDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controleaupair> consultarControleAupairList(int idVendas) throws SQLException {
        aupairDao = new AupairDao();
        return aupairDao.consultarControleAupairList(idVendas);
    }
    
}
