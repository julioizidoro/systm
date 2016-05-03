/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.VistosDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controlevistos;
import model.Valoresvistos;
import model.Vistos;
import model.view.Viewcontrolevistos;
import model.view.Viewvendasvisto;

/**
 *
 * @author Wolverine
 */
public class VistosFacade {
    
    VistosDao vistosDao;
    
    public Vistos salvar(Vistos visto) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.salvar(visto);
    }
    
    public Vistos consultarVistos(int idVenda) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.consultarVistos(idVenda);
    }
    
    public void excluir(int idVisto) throws SQLException{
        vistosDao = new VistosDao();
        vistosDao.excluir(idVisto);
    }
    
    public List<Viewvendasvisto> listar(String sql) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.listar(sql);
    }
    
    public Controlevistos salvar(Controlevistos controle) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.salvar(controle);
    }
    
    public void excluirControleVistos(Controlevistos controle) throws SQLException{
        vistosDao = new VistosDao();
        vistosDao.excluirControleVistos(controle);
    }
    
    public Controlevistos consultarControleVistos(int idVendas) throws SQLException {
        vistosDao = new VistosDao();
        return vistosDao.consultarControleVistos(idVendas);
    }
    
    public List<Viewcontrolevistos> consultaControleVistos(String sql) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.consultaControleVistos(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        vistosDao = new VistosDao();
        return vistosDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controlevistos> consultarControleVistosList(int idVendas) throws SQLException {
        vistosDao = new VistosDao();
        return vistosDao.consultarControleVistosList(idVendas);
    }
    
    public Valoresvistos salvar(Valoresvistos valoresVisto) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.salvar(valoresVisto);
    }
    
    public List<Valoresvistos> listar()throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.listar();
    }
    
    public Valoresvistos consultar(int idvaloresVistos) throws SQLException{
        vistosDao = new VistosDao();
        return vistosDao.consultar(idvaloresVistos);
    }
}
