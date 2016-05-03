/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.WorkTravelDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controlework;
import model.Worktravel;
import model.view.Viewcontrolework;
import model.view.Viewvendasworktravel;



/**
 *
 * @author Wolverine
 */
public class WorkTravelFacade {
    
    WorkTravelDao workTravelDao;
    
    public Worktravel salvar(Worktravel work) throws SQLException{
        workTravelDao = new WorkTravelDao();
        return workTravelDao.salvar(work);
    }
    
   
    public Worktravel consultarWork(int idVenda) throws SQLException {
        workTravelDao = new WorkTravelDao();
        return workTravelDao.consultarWork(idVenda);
    }
    
    public void excluir(int idCurso) throws SQLException{
        workTravelDao= new WorkTravelDao();
        workTravelDao.excluir(idCurso);
    }
    
    public List<Viewvendasworktravel> listaViewVendasWork(String sql) throws SQLException{
        workTravelDao = new WorkTravelDao();
        return workTravelDao.listaViewVendasWork(sql);
    }
    
    public Controlework salvar(Controlework controle) throws SQLException{
        workTravelDao = new WorkTravelDao();
        return workTravelDao.salvar(controle);
    }
    
    public Controlework consultarControleWork(int idVendas) throws SQLException {
        workTravelDao = new WorkTravelDao();
        return workTravelDao.consultarControleWork(idVendas);
    }
    
    public List<Viewcontrolework> consultaControleWork(String sql) throws SQLException{
        workTravelDao = new WorkTravelDao();
        return workTravelDao.consultaControleWork(sql);
    }
    
    public void excluirControleWork(Controlework controle) throws SQLException{
        workTravelDao = new WorkTravelDao();
        workTravelDao.excluirControleWork(controle);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        workTravelDao = new WorkTravelDao();
        return workTravelDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controlework> consultarControleCursosList(int idVendas) throws SQLException {
        workTravelDao = new WorkTravelDao();
        return workTravelDao.consultarControleCursosList(idVendas);
    }
    
}
