/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Fornecedorcomissaocurso;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FornecedorComissaoCursoDao {
    
    private EntityManager manager;
    
    public Fornecedorcomissaocurso salvar(Fornecedorcomissaocurso fornecedorcomissaocurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        fornecedorcomissaocurso = manager.merge(fornecedorcomissaocurso);
        //fechando uma transação
        manager.getTransaction().commit();
        return fornecedorcomissaocurso;
    }
    
    public Fornecedorcomissaocurso getFonecedorComissaoCurso(int idFornecedor, int idPais) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select f from Fornecedorcomissaocurso f where f.fornecedor.idfornecedor=" + idFornecedor + " and f.pais.idpais=" + idPais);
        Fornecedorcomissaocurso fornecedorcomissaocurso = null;
        if (q.getResultList().size()>0){
            fornecedorcomissaocurso =  (Fornecedorcomissaocurso) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        return fornecedorcomissaocurso;
    }
    
}
