/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cotacaopacotes;
import model.view.Viewconsultacotacaopacote;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class CotacaoPacotesDao {
    
    private EntityManager manager;
    
    public Cotacaopacotes salvar(Cotacaopacotes cotacaoPacotes) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        cotacaoPacotes = manager.merge(cotacaoPacotes);
        //fechando uma transação
        manager.getTransaction().commit();
        return cotacaoPacotes;
    }
    
    public Cotacaopacotes consultar(int idCotacaopacotes) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Cotacaopacotes contacaoPacotes = manager.find(Cotacaopacotes.class, idCotacaopacotes);
        //fechando uma transação
        manager.getTransaction().commit();
        return contacaoPacotes;
    }
    
    public List<Viewconsultacotacaopacote> lista(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
}
