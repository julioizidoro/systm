/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Followup;
import model.view.Viewcosultafollowup;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FollowupDao {
    
    private EntityManager manager;
    
    public Followup salvar(Followup followup) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        followup = manager.merge(followup);
        //fechando uma transação
        manager.getTransaction().commit();
        return followup;
    }
    
    public Followup consuiltar(int idFollowup) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Followup followup = manager.find(Followup.class, idFollowup);
        //fechando uma transação
        manager.getTransaction().commit();
        return followup;
    }
    
    public List<Viewcosultafollowup> listaFollowup(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
           manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Followup consultar(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Followup f where f.cliente=" + idCliente + " and f.situacao<>'Fechou' and "
                + "f.situacao<>'Desistiu' and f.situacao<>'Concorrência'");
        Followup followup = new Followup();
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            followup = (Followup) q.getResultList().get(0);
        }
        return followup;
    }
    
}
