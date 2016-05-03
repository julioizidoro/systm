/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Formapagamento;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FormaPagamentoDao {
    
    private EntityManager manager;
    
    public Formapagamento salvar(Formapagamento formaPagamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        formaPagamento = manager.merge(formaPagamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return formaPagamento;
    }
    
    public Formapagamento consultar(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Formapagamento f where f.vendas=" + idVenda);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Formapagamento) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idFormaPagamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Formapagamento formaPagamento = manager.find(Formapagamento.class, idFormaPagamento);
        //fechando uma transação
        manager.remove(formaPagamento);
        manager.getTransaction().commit();
    }
    
    public List<Formapagamento> listar(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Formapagamento f where f.vendas=" + idVenda);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
}
