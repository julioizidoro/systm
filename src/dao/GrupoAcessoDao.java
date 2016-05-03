/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Grupoacesso;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class GrupoAcessoDao {
    
    private EntityManager manager;
    
    public Grupoacesso salvar(Grupoacesso grupo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        grupo = manager.merge(grupo);
        //fechando uma transação
        manager.getTransaction().commit();
        return grupo;
    }
    
    public Grupoacesso consultar(int idgrupo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
         manager.getTransaction().begin();
        Query q = manager.createQuery("select a from Grupoacesso  a where a.idgrupoAcesso=" + idgrupo);
        //fechando uma transação
        manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return (Grupoacesso) q.getResultList().get(0);
        }else return null;
    }
    
    public List<Grupoacesso> listar() throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
         manager.getTransaction().begin();
        Query q = manager.createQuery("select a from Grupoacesso  a order by a.descricao");
        //fechando uma transação
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
}
