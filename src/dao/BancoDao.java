/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Singleton.ConexaoSingleton;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Banco;

/**
 *
 * @author Wolverine
 */
public class BancoDao {
    
    private EntityManager manager;
    
    public List<Banco> listar() throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select b from Banco b order by b.nome");
        if (q.getResultList().size()>0){
            manager.getTransaction().commit();
            return q.getResultList();
        }
        manager.getTransaction().commit();
        return null;
    }
    
}
