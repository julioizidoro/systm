/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Faturafranquias;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FaturaFranquiasDao {
    
    private EntityManager manager;
    
    public Faturafranquias salvar(Faturafranquias faturafranquias) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        faturafranquias = manager.merge(faturafranquias);
        //fechando uma transação
        manager.getTransaction().commit();
        return faturafranquias;
    }
    
    public Faturafranquias getFaturaFranquia(int idVendasComissao)throws SQLException{
         manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select f from Faturafranquias f where f.vendascomissao.idvendascomissao=" + idVendasComissao);
        //fechando uma transação
        Faturafranquias fatura = null;
        if (q.getResultList().size()>0){
            fatura = (Faturafranquias) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        return fatura;
    }
    
    public void excluir(int idFaturaFranquias) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Faturafranquias fatura = manager.find(Faturafranquias.class, idFaturaFranquias);
        manager.remove(fatura);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
}
