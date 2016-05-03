/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Ftpdados;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FtpDadosDao {
    
    private EntityManager manager;
    
    public Ftpdados getFTPDados()throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select f from Ftpdados f");
        Ftpdados ftpDados = (Ftpdados) q.getSingleResult();
        manager.getTransaction().commit();
        return ftpDados;
    }
    
}
