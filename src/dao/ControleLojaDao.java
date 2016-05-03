/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Controleloja;
import model.view.Viewconsultacontroleloja;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ControleLojaDao {
    
    private EntityManager manager;
    
    public Controleloja salvar(Controleloja controleLoja) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controleLoja = manager.merge(controleLoja);
        //fechando uma transação
        manager.getTransaction().commit();
        return controleLoja;
    }
    
    public Controleloja consuiltar(int idControleLoja) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controleloja conroleLoja = manager.find(Controleloja.class, idControleLoja);
        //fechando uma transação
        manager.getTransaction().commit();
        return conroleLoja;
    }
    
    public List<Viewconsultacontroleloja> listaFollowup(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Controleloja consultar(int idFlollowUp) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select c from Controleloja c where c.idFloowup=" + idFlollowUp);
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return  (Controleloja) q.getResultList().get(0);
        }
        return null;
    }
    
}
