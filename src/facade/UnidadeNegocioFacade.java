/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.UnidadeNegocioDao;
import java.sql.SQLException;
import java.util.List;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public class UnidadeNegocioFacade {
    
    UnidadeNegocioDao unidadeNegocioDao;
    
    public Unidadenegocio salvar(Unidadenegocio unidadeNegocio) throws SQLException{
        unidadeNegocioDao = new UnidadeNegocioDao();
        return unidadeNegocioDao.salvar(unidadeNegocio);
    }
    
    public Unidadenegocio consultar(int idUnidadeNegocio) throws SQLException{
        unidadeNegocioDao = new UnidadeNegocioDao();
        return unidadeNegocioDao.consultar(idUnidadeNegocio);
    }
    
    public List<Unidadenegocio> listar() throws Exception{
        unidadeNegocioDao = new UnidadeNegocioDao();
        return unidadeNegocioDao.listar();
    }
    
}
