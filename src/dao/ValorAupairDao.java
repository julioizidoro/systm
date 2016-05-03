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
import model.Valoresaupair;
import model.view.Viewconsultavaloresaupair;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ValorAupairDao {
    
    private EntityManager manager;
    
    public Valoresaupair salvar(Valoresaupair valor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        valor = manager.merge(valor);
        //fechando uma transação
        manager.getTransaction().commit();
        return valor;
    }
    
    public Valoresaupair consultar(int idvalor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
       manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valoresaupair  v where v.idvaloresAupair=" + idvalor);
        //fechando uma transação
        manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return (Valoresaupair) q.getResultList().get(0);
        }else return null;
    }
    
    public List<Valoresaupair> listar(int idFornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from ValoresAupair  v where v.fornecedor=" + idFornecedor);
        //fechando uma transação
       manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Viewconsultavaloresaupair> listarConsulta(int idFornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Viewconsultavaloresaupair  v where v.fornecedorcidadeIdfornecedorcidade=" + idFornecedor);
        //fechando uma transação
      manager.getTransaction().commit();
        return q.getResultList();
    }
    
}
