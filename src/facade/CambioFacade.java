/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CambioDao;
import java.sql.SQLException;
import java.util.List;
import model.Cambio;
import model.Moedas;


/**
 *
 * @author Wolverine
 */
public class CambioFacade {
    
    CambioDao cambioDao;
    
    public Cambio salvar(Cambio cambio) throws SQLException{
        cambioDao = new CambioDao();
        return cambioDao.salvar(cambio);
    }
    
    public void excluir(Cambio cambio) throws SQLException{
        cambioDao = new CambioDao();
        cambioDao.excluir(cambio);
    }
    
    public List<Moedas> listaMoedas() throws SQLException{
        cambioDao = new CambioDao();
        return cambioDao.listaMoedas();
    }
    
    public Cambio consultar(int idCambio) throws SQLException{
        cambioDao = new CambioDao();
        return cambioDao.consultar(idCambio);
    }
    
    public Cambio consultarCambioMoeda(String data, int idMoeda) throws SQLException{
        cambioDao = new CambioDao();
        return cambioDao.consultarCambioMoeda(data, idMoeda);
    }
    
    public Moedas consultarMoeda(int idMoeda) throws SQLException{
        cambioDao = new CambioDao();
        return cambioDao.consultarMoeda(idMoeda);
    }
    
    public List<Cambio> listar(String data) throws SQLException{
        cambioDao = new CambioDao();
        return cambioDao.listar(data);
    }
    
}
