/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Fornecedor;
import model.view.Viewfornecedor;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FornecedorDao {
    
    private EntityManager manager;
    
    public Fornecedor salvar(Fornecedor fornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        fornecedor = manager.merge(fornecedor);
        //fechando uma transação
        manager.getTransaction().commit();
        return fornecedor;
    }
    
    public Fornecedor consultar(int idFornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Fornecedor f where f.idfornecedor=" + idFornecedor);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return   (Fornecedor) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Viewfornecedor> listaFornecedor(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
           manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Fornecedor> listaFornecedorCadastro(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery(sql);
        return q.getResultList();
    }
    
    
    
}
