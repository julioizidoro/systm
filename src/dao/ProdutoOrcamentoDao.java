/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Produtosorcamento;
import model.view.Viewprodutosfiltro;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ProdutoOrcamentoDao {
    
    private EntityManager manager;
    
    public Produtosorcamento salvar(Produtosorcamento produto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        produto = manager.merge(produto);
        //fechando uma transação
        manager.getTransaction().commit();
        return produto;
    }
    
    public List<Produtosorcamento> listarProdutosOrcamento(String descricao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Produtosorcamento p  where p.descricao like '" + descricao + "%' order by p.descricao" );
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Produtosorcamento consultar(int idProdutoOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Produtosorcamento p where p.idprodutosOrcamento=" + idProdutoOrcamento + " order by p.descricao" );
         manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Produtosorcamento) q.getResultList().get(0);
        }
        return null;
    }
    
    public List<Viewprodutosfiltro> listarFiltroProdutosOrcamento(int idProduto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Viewprodutosfiltro f  where f.idprodutos=" + idProduto + " order by f.descricaoProdutosOrcamento");
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Viewprodutosfiltro consultarFiltro(int idProduto, int idProdutoOrcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Viewprodutosfiltro f  where f.idprodutos=" + idProduto + " and f.idProdutosOrcamento=" + idProdutoOrcamento);
         manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Viewprodutosfiltro) q.getResultList().get(0);
        }
        return null;
    }
    
}
