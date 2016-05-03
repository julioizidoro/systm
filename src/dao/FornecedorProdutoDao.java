/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Fornecedorproduto;
import model.view.Viewfornecedorproduto;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FornecedorProdutoDao {
    
    private EntityManager manager;
    
    public Fornecedorproduto salvar(Fornecedorproduto fornecedorProduto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        fornecedorProduto = manager.merge(fornecedorProduto);
        //fechando uma transação
        manager.getTransaction().commit();
        return fornecedorProduto;
    }
    
    public void Excluir(int idFornecedorProduto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Fornecedorproduto fornecedorProduto = manager.find(Fornecedorproduto.class, idFornecedorProduto);
        manager.remove(fornecedorProduto);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public List<Viewfornecedorproduto> listaFornecedorProduto(int idProduto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Viewfornecedorproduto v where v.idprodutos=" + idProduto + " order by v.nome");
        manager.getTransaction().commit();
        return q.getResultList();
        
    }
    
}
