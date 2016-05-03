/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ControleLojaDao;
import java.sql.SQLException;
import java.util.List;
import model.Controleloja;
import model.view.Viewconsultacontroleloja;

/**
 *
 * @author Wolverine
 */
public class ControleLojaFacade {
    
    ControleLojaDao controleLojaDao;
    
    public Controleloja salvar(Controleloja controleLoja) throws SQLException{
        controleLojaDao = new ControleLojaDao();
        return  controleLojaDao.salvar(controleLoja);
    }
    
    public Controleloja consuiltar(int idControleLoja) throws SQLException{
        controleLojaDao = new ControleLojaDao();
        return controleLojaDao.consuiltar(idControleLoja);
    }
    
    public List<Viewconsultacontroleloja> listaFollowup(String sql) throws SQLException{
        controleLojaDao = new ControleLojaDao();
        return controleLojaDao.listaFollowup(sql);
    }
    
    public Controleloja consultar(int idFlollowUp) throws SQLException{
        controleLojaDao = new ControleLojaDao();
        return controleLojaDao.consultar(idFlollowUp);
    }
    
}
