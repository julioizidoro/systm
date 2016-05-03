/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FollowupDao;
import java.sql.SQLException;
import java.util.List;
import model.Followup;
import model.view.Viewcosultafollowup;

/**
 *
 * @author Wolverine
 */
public class FollowupFacade {

    FollowupDao followupDao;
    
    public Followup salvar(Followup followup) throws SQLException{
        followupDao = new FollowupDao();
        return followupDao.salvar(followup);
    }
    
    public Followup consuiltar(int idFollowup) throws SQLException{
        followupDao = new FollowupDao();
        return followupDao.consuiltar(idFollowup);
    }
    
    public List<Viewcosultafollowup> listaFollowup(String sql) throws SQLException{
        followupDao = new FollowupDao();
        return followupDao.listaFollowup(sql);
    }
    
    public Followup consultar(int idCliente) throws SQLException{
        followupDao = new FollowupDao();
        return followupDao.consultar(idCliente);
    }
    
}
