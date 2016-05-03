/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.PublicidadeDao;
import java.sql.SQLException;
import java.util.List;
import model.Publicidade;

/**
 *
 * @author Wolverine
 */
public class PublicidadeFacade {
    
    PublicidadeDao publicidadeDao;
    
    public Publicidade salvar(Publicidade publicidade) throws SQLException{
        publicidadeDao = new PublicidadeDao();
        return publicidadeDao.salvar(publicidade);
    }
    
    public Publicidade consultar(int idPublicidade) throws SQLException{
        publicidadeDao = new PublicidadeDao();
        return publicidadeDao.consultar(idPublicidade);
    }
    
    public List<Publicidade> listar() throws SQLException{
        publicidadeDao = new PublicidadeDao();
        return publicidadeDao.listar();
    }
    
}
