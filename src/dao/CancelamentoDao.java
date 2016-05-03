/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Singleton.ConexaoSingleton;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cancelamento;

/**
 *
 * @author Wolverine
 */
public class CancelamentoDao {
    
    private EntityManager manager;
    
    public Cancelamento salvar(Cancelamento cancelamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        cancelamento = manager.merge(cancelamento);
        manager.getTransaction().commit();
        return cancelamento;
    }
    
    public Cancelamento cunsultar(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Cancelamento c where c.vendas=" + idVenda);
        Cancelamento cancelamento = null;
        if (q.getResultList().size()>0){
            cancelamento = (Cancelamento) q.getResultList().get(0);
            manager.getTransaction().commit();
        }
        manager.getTransaction().commit();
        return cancelamento;
    }
    
}
