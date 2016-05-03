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
import model.Valoreswork;
import model.view.Viewconsultavaloreswork;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ValorWorkDao {
    
    private EntityManager manager;
    
    public Valoreswork salvar(Valoreswork valor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        valor = manager.merge(valor);
        //fechando uma transação
        manager.getTransaction().commit();
        return valor;
    }
    
    public Valoreswork consultar(int idvalor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valoreswork  v where v.idvaloresWork=" + idvalor);
        //fechando uma transação
         manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return (Valoreswork) q.getResultList().get(0);
        }else return null;
    }
    
    public List<Valoreswork> listar(int idFornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valoreswork  v where v.fornecedor=" + idFornecedor);
        //fechando uma transação
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Viewconsultavaloreswork> listarConsulta(int idFornecedorcidade) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Viewconsultavaloreswork  v where v.fornecedorcidadeIdfornecedorcidade=" + idFornecedorcidade);
        //fechando uma transação
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
}
