/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Orcamentocursoformapagamento;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class OrcamentoCursoFormaPagamentoDao {
    
    private EntityManager manager;
    
     public Orcamentocursoformapagamento salvar(Orcamentocursoformapagamento orcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        orcamento = manager.merge(orcamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return orcamento;
    }
     
     public Orcamentocursoformapagamento consultar(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Orcamentocursoformapagamento o where o.orcamento=" + idOrcamento);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Orcamentocursoformapagamento) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
}
