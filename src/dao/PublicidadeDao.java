/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Acesso;
import model.Publicidade;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class PublicidadeDao {
    
    private EntityManager manager;
    
    public Publicidade salvar(Publicidade publicidade) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        publicidade = manager.merge(publicidade);
        //fechando uma transação
        manager.getTransaction().commit();
        return publicidade;
    }
    
    public Publicidade consultar(int idPublicidade) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Publicidade publicidade = manager.find(Publicidade.class, idPublicidade);
        //fechando uma transação
        manager.getTransaction().commit();
        return publicidade;
    }
    
    public List<Publicidade> listar() throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
         manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Publicidade  p order by p.descricao");
        //fechando uma transação
        manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return q.getResultList();
        }else return null;
    }
    
}
