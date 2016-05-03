/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Singleton.ConexaoSingleton;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Itensalteradoscurso;

/**
 *
 * @author Julio
 */
public class ItensAlteradosCursosDao {
    private EntityManager manager;
    
    public Itensalteradoscurso salvar(Itensalteradoscurso itensalteradoscurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        itensalteradoscurso = manager.merge(itensalteradoscurso);
        //fechando uma transação
        manager.getTransaction().commit();
        return itensalteradoscurso;
    }
    
    public Itensalteradoscurso consultarItensAlteradosCursos(int idHistoricocurso) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select i from Itensalteradoscurso i where i.historicocurso=" + idHistoricocurso);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Itensalteradoscurso) q.getResultList().get(0);
        } else {
            return null;
        }
    }
}
