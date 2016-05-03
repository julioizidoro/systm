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
import model.Valorestrainee;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ValorTraineeDao {
    
    private EntityManager manager;
    
    public Valorestrainee salvar(Valorestrainee valor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        valor = manager.merge(valor);
        //fechando uma transação
        manager.getTransaction().commit();
        return valor;
    }
    
    public Valorestrainee consultar(int idvalor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valorestrainee  v where v.idvalorestrainee=" + idvalor);
        //fechando uma transação
         manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return (Valorestrainee) q.getResultList().get(0);
        }else return null;
    }
    
    public List<Valorestrainee> listar(int idFornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valorestrainee  v where v.fornecedorcidade.fornecedor.idfornecedor=" + idFornecedor);
        //fechando uma transação
         manager.getTransaction().commit();
        return q.getResultList();
    }
}
