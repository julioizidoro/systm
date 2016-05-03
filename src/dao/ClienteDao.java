/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;
import model.view.Viewcliente;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ClienteDao {
    
    private EntityManager manager;
    
    public Cliente salvar(Cliente cliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        cliente = manager.merge(cliente);
        //fechando uma transação
        manager.getTransaction().commit();
        return cliente;
    }
    
    public List<Viewcliente> listar(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        List<Viewcliente> listaClientes = q.getResultList();
         manager.getTransaction().commit();
        return listaClientes;
    }
    
    public Cliente consultar(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Cliente cliente = manager.find(Cliente.class, idCliente);
        //fechando uma transação
        manager.getTransaction().commit();
        return cliente;
    }
    
    public Cliente consultarEmail(String email) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Cliente c where c.email='" + email + "'" );
          manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Cliente) q.getSingleResult();
        } 
        return null;
    }
    
}
