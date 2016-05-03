/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Vendascomissao;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class VendasComissaoDao {
    
    private EntityManager manager;
    
    public Vendascomissao salvar(Vendascomissao vendasComissao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        vendasComissao = manager.merge(vendasComissao);
        //fechando uma transação
        manager.getTransaction().commit();
        return vendasComissao;
    }
    
    public Vendascomissao getVendaComissao(int idVenda, int idProdutos)throws SQLException{
         manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select v from Vendascomissao v where v.vendas.idvendas=" + idVenda + " and v.produtos.idprodutos=" + idProdutos);
        //fechando uma transação
        Vendascomissao vendascomissao = null;
        if (q.getResultList().size()>0){
            vendascomissao = (Vendascomissao) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        return vendascomissao;
    }
    
    public void excluir(int idVendaComissao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Vendascomissao vendasComissao = manager.find(Vendascomissao.class, idVendaComissao);
        manager.remove(vendasComissao);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
}
