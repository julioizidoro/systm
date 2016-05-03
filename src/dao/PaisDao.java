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
import model.Pais;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class PaisDao {
    
    private EntityManager manager;
    
    public Pais salvar(Pais pais) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        pais = manager.merge(pais);
        //fechando uma transação
        manager.getTransaction().commit();
        return pais;
    }
    
    public List<Pais> listar(String nome) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Pais p where p.nome like '%" + nome + "%' order by p.nome");
        List<Pais> listaPais = q.getResultList();
        manager.getTransaction().commit();
        return listaPais;
    }
    
    public Pais consultar(int idPais) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Pais p where p.idpais=" + idPais);
        Pais pais = (Pais) q.getResultList().get(0);
        manager.getTransaction().commit();
        return pais;
    }
}
