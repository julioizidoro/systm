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
import model.Cidade;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class CidadeDao {
    
    private EntityManager manager;
    
    public Cidade salvar(Cidade cidade) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        cidade = manager.merge(cidade);
        //fechando uma transação
        manager.getTransaction().commit();
        return cidade;
    }
    
    public List<Cidade> listar(String nome) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Cidade p where p.nome like '%" + nome + "%' order by p.nome");
        List<Cidade> listaCidade = q.getResultList();
        manager.getTransaction().commit();
        return listaCidade;
    }
}
