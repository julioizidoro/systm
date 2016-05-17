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
import model.Valoreshighschool;
import model.view.Viewconsultavaloreshighschool;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ValorHighSchoolDao {
    
    private EntityManager manager;
    
    public Valoreshighschool salvar(Valoreshighschool valor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        valor = manager.merge(valor);
        manager.getTransaction().commit();
        return valor;
    }
    
    public Valoreshighschool consultar(int idvalor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valoreshighschool  v where v.idvaloresHighSchool=" + idvalor);
        //fechando uma transação
         manager.getTransaction().commit();
        if(q.getResultList().size()>0){
            return (Valoreshighschool) q.getResultList().get(0);
        }else return null;
    }
    
    public List<Valoreshighschool> listar(int idFornecedor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valoreshighschool  v where v.fornecedor=" + idFornecedor);
        //fechando uma transação
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Viewconsultavaloreshighschool> listarConsulta(int idFornecedorCidade) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Viewconsultavaloreshighschool  v where v.fornecedorcidadeIdfornecedorcidade=" + idFornecedorCidade);
        //fechando uma transação
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
}
