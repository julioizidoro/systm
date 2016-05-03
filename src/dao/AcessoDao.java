/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Singleton.ConexaoSingleton;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Acesso;


/**
 *
 * @author Wolverine
 */
public class AcessoDao {
    
    private EntityManager manager;
    
    public Acesso salvar(Acesso acesso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        acesso = manager.merge(acesso);
        //fechando uma transação
        manager.getTransaction().commit();
        return acesso;
    }
    
    public Acesso consultar(int idAcesso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        //abrindo uma transação
        Query q = manager.createQuery("select a from Acesso  a where a.idacesso=" + idAcesso);
        //fechando uma transação
        manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return (Acesso) q.getResultList().get(0);
        }else return null;
    }
    
  
    
}
