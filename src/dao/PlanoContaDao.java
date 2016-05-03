/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import model.Planoconta;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class PlanoContaDao {
    
   private EntityManager manager;
   
    public Planoconta consultar(int idPlanoConta) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Planoconta plano = manager.find(Planoconta.class, idPlanoConta);
        manager.getTransaction().commit();
        return plano;
    }
    
}
