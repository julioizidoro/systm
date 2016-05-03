/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Orcamentocurso;
import model.Produtoorcamentocurso;
import model.Produtosorcamento;
import model.view.Vieworcamentocurso;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class OrcamentoCursoDao {
    
    private EntityManager manager;
    
    public Orcamentocurso salvar(Orcamentocurso orcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        orcamento = manager.merge(orcamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return orcamento;
    }
    
    public Orcamentocurso consultar(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Orcamentocurso o where o.idorcamentoCurso=" + idOrcamento);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Orcamentocurso) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public Produtoorcamentocurso salvar(Produtoorcamentocurso produtoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        produtoOrcamentoCurso = manager.merge(produtoOrcamentoCurso);
        //fechando uma transação
        manager.getTransaction().commit();
        return produtoOrcamentoCurso;
    }
    
    public List<Produtoorcamentocurso> listarProdutoOrcamentoCurso(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Produtoorcamentocurso o where o.orcamentocurso=" + idOrcamento);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public Produtosorcamento consultarProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Produtosorcamento p where p.idprodutosOrcamento=" + idProdutoOrcamentoCurso);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Produtosorcamento) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluirProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Produtoorcamentocurso produtoorcamentocurso = manager.find(Produtoorcamentocurso.class, idProdutoOrcamentoCurso);
        manager.remove(produtoorcamentocurso);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public List<Vieworcamentocurso> listarOrcamentoCurso(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public Orcamentocurso consultarCliente(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Orcamentocurso o where o.cliente=" + idCliente +
                " and o.idCurso=0");
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Orcamentocurso) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public Produtoorcamentocurso consultarProdutoOrcamentoCuros(int idProdutoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Produtoorcamentocurso produtoOrcamentoCurso = manager.find(Produtoorcamentocurso.class, idProdutoOrcamentoCurso);
        //fechando uma transação
        manager.getTransaction().commit();
        return produtoOrcamentoCurso;
    }
    
    public void excluirOrcamentoCuros(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Orcamentocurso orcamento = manager.find(Orcamentocurso.class, idOrcamento);
        manager.remove(orcamento);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public List<Orcamentocurso> listarOrcamentoCurso() throws SQLException{
        ConexaoSingleton.desconectar();
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select o from Orcamentocurso o where o.fornecedorcidade.idfornecedorcidade=1");
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    
}
