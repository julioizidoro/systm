/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Modeloorcamentocurso;
import model.Modeloorcamentocursoforma;
import model.Modeloprodutoorcamentocurso;
import model.Orcamentocursoformapagamento;
import model.Produtosorcamento;
import model.view.Viewmodeloorcamento;
import model.view.Vieworcamentocurso;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ModeloOrcamentoCursoDao {
    
    private EntityManager manager;
    
    public Modeloorcamentocurso salvar(Modeloorcamentocurso orcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        orcamento = manager.merge(orcamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return orcamento;
    }
    
    public Modeloorcamentocurso consultar(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Modeloorcamentocurso o where o.idorcamentoCurso=" + idOrcamento);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Modeloorcamentocurso) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public Modeloprodutoorcamentocurso salvar(Modeloprodutoorcamentocurso modeloProdutoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        modeloProdutoOrcamentoCurso = manager.merge(modeloProdutoOrcamentoCurso);
        //fechando uma transação
        manager.getTransaction().commit();
        return modeloProdutoOrcamentoCurso;
    }
    
    public List<Modeloprodutoorcamentocurso> listarProdutoOrcamentoCurso(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Modeloprodutoorcamentocurso o where o.modeloOrcamentoCurso=" + idOrcamento);
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
    
    public void excluirModleoProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Modeloprodutoorcamentocurso produtoorcamentocurso = manager.find(Modeloprodutoorcamentocurso.class, idProdutoOrcamentoCurso);
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
    
    
    public Modeloprodutoorcamentocurso consultarProdutoOrcamentoCuros(int idProdutoOrcamentoCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Modeloprodutoorcamentocurso produtoOrcamentoCurso = manager.find(Modeloprodutoorcamentocurso.class, idProdutoOrcamentoCurso);
        //fechando uma transação
        manager.getTransaction().commit();
        return produtoOrcamentoCurso;
    }
    
    public Modeloorcamentocursoforma salvar(Modeloorcamentocursoforma modeloForma) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        modeloForma = manager.merge(modeloForma);
        //fechando uma transação
        manager.getTransaction().commit();
        return modeloForma;
    }
     
     public Modeloorcamentocursoforma consultarFormaPagamento(int idOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select o from Modeloorcamentocursoforma o where o.modeloOrcamentoCurso=" + idOrcamento);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Modeloorcamentocursoforma) q.getResultList().get(0);
        } else {
            return null;
        }
    }
     
    public List<Viewmodeloorcamento> listarModeloOrcamentoCurso(String sql) throws SQLException{
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
    
    public List<Modeloorcamentocurso> listarModeloOrcamentoCurso() throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select m from Modeloorcamentocurso m where m.fornecedorcidade.idfornecedorcidade=1");
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
}
