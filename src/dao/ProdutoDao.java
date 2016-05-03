/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Produtos;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ProdutoDao {
    
    private EntityManager manager;
    
    public Produtos salvar(Produtos produto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        produto = manager.merge(produto);
        //fechando uma transação
        manager.getTransaction().commit();
        return produto;
    }
    
    public List<Produtos> listarProdutos(String descricao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Produtos p  where p.descricao like '" + descricao + "%' order by p.descricao" );
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Produtos consultar(int idProduto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Produtos produto = manager.find(Produtos.class, idProduto);
        //fechando uma transação
        manager.getTransaction().commit();
        return produto;
    }
    
}
