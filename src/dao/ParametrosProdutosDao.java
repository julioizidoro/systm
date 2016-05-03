/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Parametrosprodutos;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ParametrosProdutosDao {
    
    private EntityManager manager;
    
    public Parametrosprodutos salvar(Parametrosprodutos parametrosprodutos) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        parametrosprodutos = manager.merge(parametrosprodutos);
        //fechando uma transação
        manager.getTransaction().commit();
        return parametrosprodutos;
    }
    
    public Parametrosprodutos consultar() throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
         manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Parametrosprodutos  p");
        //fechando uma transação
         manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Parametrosprodutos) q.getSingleResult();
        }
        return null;
    }
}
