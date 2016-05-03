/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.AcessoDao;
import java.sql.SQLException;
import model.Acesso;

/**
 *
 * @author Wolverine
 */
public class AcessoFacade {
    
    AcessoDao acessoDao;
    
    public Acesso salvar(Acesso acesso) throws SQLException{
        acessoDao = new AcessoDao();
        return acessoDao.salvar(acesso);
    }
    
    public Acesso consultar(int idAcesso) throws SQLException{
        acessoDao = new AcessoDao();
        return acessoDao.consultar(idAcesso);
    }
    
}
