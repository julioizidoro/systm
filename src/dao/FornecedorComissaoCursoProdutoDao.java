/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Fornecedorcomissaocursoproduto;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FornecedorComissaoCursoProdutoDao {
    
    private EntityManager manager;
    
    public Fornecedorcomissaocursoproduto salvar(Fornecedorcomissaocursoproduto fornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        fornecedor = manager.merge(fornecedor);
        //fechando uma transação
        manager.getTransaction().commit();
        return fornecedor;
    }
    
    public Fornecedorcomissaocursoproduto consultar(int idFornecedorcomissaocurso, int idprodutoorcamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Fornecedorcomissaocursoproduto f where f.fornecedorcomissaocurso.idfornecedorcomissaocurso=" + idFornecedorcomissaocurso + " and f.Produtosorcamento.idprodutocomissao=" + idprodutoorcamento);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return   (Fornecedorcomissaocursoproduto) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
}
