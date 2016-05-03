/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.SeguroViagemDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controleseguro;
import model.Seguroviagem;
import model.view.Viewcontroleseguro;
import model.view.Viewvendasseguro;

/**
 *
 * @author Wolverine
 */
public class SeguroViagemFacade {
    
    SeguroViagemDao seguroViagemDao;
    
    public Seguroviagem salvar(Seguroviagem seguroViagem) throws SQLException{
        seguroViagemDao =new SeguroViagemDao();
        return seguroViagemDao.salvar(seguroViagem);
    }
    
    public Seguroviagem consultar(int idVenda) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        return seguroViagemDao.consultar(idVenda);
    }
    
    public void excluir(int idSeguroViagem) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        seguroViagemDao.excluir(idSeguroViagem);
    }
    
    public List<Viewvendasseguro> listar(String sql) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        return seguroViagemDao.listar(sql);
    }
    
    public Controleseguro salvar(Controleseguro controle) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        return seguroViagemDao.salvar(controle);
    }
    
    public void excluirControleSeguro(Controleseguro controle) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        seguroViagemDao.excluirControleSeguro(controle);
    }
    
    public Controleseguro consultaControleSeguro(int idVendas) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        return seguroViagemDao.consultarControleSeguro(idVendas);
    }
    
    public List<Viewcontroleseguro> consultaControleSeguro(String sql) throws SQLException{
        seguroViagemDao = new SeguroViagemDao();
        return seguroViagemDao.consultaControleSeguro(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        seguroViagemDao = new SeguroViagemDao();
        return seguroViagemDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controleseguro> consultarControleSeguroList(int idVendas) throws SQLException {
        seguroViagemDao = new SeguroViagemDao();
        return  seguroViagemDao.consultarControleSeguroList(idVendas);
    }
    
}
