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
import model.Contasreceber;
import Singleton.ConexaoSingleton;


/**
 *
 * @author Wolverine
 */
public class ContasReceberDao {
    
    private EntityManager manager;
    
    public Contasreceber salvar(Contasreceber conta) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        conta = manager.merge(conta);
        manager.getTransaction().commit();
        return conta;
    }
    
    public Contasreceber consultar(int idConta) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Contasreceber conta = manager.find(Contasreceber.class, idConta);
        manager.getTransaction().commit();
        return conta;
    }
    
    public void excluir(int idConta) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Contasreceber conta = manager.find(Contasreceber.class, idConta);
        manager.remove(conta);
        manager.getTransaction().commit();
    }
    
    public List<Contasreceber> listar(int idVendas)throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("Select c From Contasreceber c where c.vendas.idvendas=" + idVendas);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Contasreceber> listar(String sql)throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
}
