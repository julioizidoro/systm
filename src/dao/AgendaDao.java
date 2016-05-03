/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Singleton.ConexaoSingleton;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Agenda;
import model.view.Viewconusltaagenda;


/**
 *
 * @author Wolverine
 */
public class AgendaDao {
    
    private EntityManager manager;
    
    public Agenda salvar(Agenda agenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        agenda = manager.merge(agenda);
        //fechando uma transação
        manager.getTransaction().commit();
        return agenda;
    }
    
    public void excluir(int idAgenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Agenda agenda = manager.find(Agenda.class, idAgenda);
        manager.remove(agenda);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Agenda consultar(int idAgenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Agenda agenda = manager.find(Agenda.class, idAgenda);
        //fechando uma transação
        manager.getTransaction().commit();
        return agenda;
    }
    
   public List<Viewconusltaagenda> listaViewAgenda(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
          manager.getTransaction().commit();
        return q.getResultList();
    }
   
   public Agenda consultarControle(int idControleLoja) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("Select a from Agenda a where a.idControleLoja=" + idControleLoja);
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Agenda) q.getResultList().get(0);
        }else return null;
    }
    
}
