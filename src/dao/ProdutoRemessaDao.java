/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Singleton.ConexaoSingleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Produtoremessa;

/**
 *
 * @author Wolverine
 */
public class ProdutoRemessaDao {
    
    private EntityManager manager;
    
    public List<Produtoremessa> listar(int idProduto) throws Exception{
        manager = ConexaoSingleton.getConexao();
        List<Produtoremessa> listaProdutos = null;
        Query q = manager.createQuery("select p from Produtoremessa p where p.produtos.idprodutos=" + idProduto);
        listaProdutos = q.getResultList();
        return listaProdutos;
    }
    
    public Produtoremessa salvar(Produtoremessa produtoRemessa) throws Exception{
         manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        produtoRemessa = manager.merge(produtoRemessa);
        manager.getTransaction().commit();
        return produtoRemessa;
    }

    public void excluir(int idProdutoRemessa) throws Exception{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Produtoremessa produtoRemessa = manager.find(Produtoremessa.class, idProdutoRemessa);
        manager.remove(produtoRemessa);
        manager.getTransaction().commit();
    }
    
}
