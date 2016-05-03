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
import model.Historicocursos;

/**
 *
 * @author Julio
 */
public class HistoricoCursosDao {
    
    private EntityManager manager;
    
    public Historicocursos salvar(Historicocursos historicocursos) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        historicocursos = manager.merge(historicocursos);
        //fechando uma transação
        manager.getTransaction().commit();
        return historicocursos;
    }
    
    public Historicocursos consultarHistoricoCursos(int idVenda) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select h from Historicocursos h where h.vendas=" + idVenda);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Historicocursos) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Historicocursos> listar(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        List<Historicocursos> listaPais = q.getResultList();
        manager.getTransaction().commit();
        return listaPais;
    }
    
   
    
}
