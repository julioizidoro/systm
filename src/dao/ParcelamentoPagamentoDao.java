/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Parcelamentopagamento;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ParcelamentoPagamentoDao {
    
    private EntityManager manager;
    
    public Parcelamentopagamento salvar(Parcelamentopagamento parcelamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        parcelamento = manager.merge(parcelamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return parcelamento;
    }
    
    public List<Parcelamentopagamento> listar(int idFormaPagamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Parcelamentopagamento p where p.idformapagamento=" + idFormaPagamento);
           manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public void excluir(int idParcelamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Parcelamentopagamento parcelamentopagamento = manager.find(Parcelamentopagamento.class, idParcelamento);
        //fechando uma transação
        manager.remove(parcelamentopagamento);
        manager.getTransaction().commit();
    }    
}
