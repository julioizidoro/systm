/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Produtosorcamento;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class OrcamentoDao {
    
    private EntityManager manager;
    
    public Orcamento salvar(Orcamento orcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        orcamento = manager.merge(orcamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return orcamento;
    }
    
    public Orcamento consultar(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Orcamento o where o.vendas=" + idVenda);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Orcamento) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public Orcamentoprodutosorcamento salvar(Orcamentoprodutosorcamento orcamentoprodutosorcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        orcamentoprodutosorcamento = manager.merge(orcamentoprodutosorcamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return orcamentoprodutosorcamento;
    }
    
    public List<Orcamentoprodutosorcamento> listarOrcamentoProdutoOrcamento(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Orcamentoprodutosorcamento o where o.orcamento=" + idOrcamento);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public Produtosorcamento consultarProdutoOrcamento(int idProdutoOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Produtosorcamento p where p.idprodutosOrcamento=" + idProdutoOrcamento);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Produtosorcamento) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluirOrcamentoProdutoOrcamento(int idOrcamentoprodutosorcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Orcamentoprodutosorcamento orcamentoprodutosorcamento = manager.find(Orcamentoprodutosorcamento.class, idOrcamentoprodutosorcamento);
        manager.remove(orcamentoprodutosorcamento);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public void excluirOrcamento(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Orcamento orcamento = manager.find(Orcamento.class, idOrcamento);
        manager.remove(orcamento);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Orcamentoprodutosorcamento consultarOrcamentoProdutoOrcamento(int idIrcamentoProdutosOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Orcamentoprodutosorcamento orcamentoprodutosorcamento = manager.find(Orcamentoprodutosorcamento.class, idIrcamentoProdutosOrcamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return orcamentoprodutosorcamento;
    }
    
}
