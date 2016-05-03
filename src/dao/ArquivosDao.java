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
import model.Arquivos;
import model.Tipoarquivo;
import model.Tipoarquivousuario;
import model.view.Viewconsultaarquivo;
import model.view.Viewtipoarquivousuario;


/**
 *
 * @author Wolverine
 */
public class ArquivosDao {
    
    private EntityManager manager;
    
    public Arquivos salvar(Arquivos arquivo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        arquivo = manager.merge(arquivo);
        //fechando uma transação
        manager.getTransaction().commit();
        return arquivo;
    }
    
    public Arquivos consultar(int idArquivo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Arquivos arquivo = manager.find(Arquivos.class, idArquivo);
        //fechando uma transação
        manager.getTransaction().commit();
        return arquivo;
    }
    
    public List<Viewconsultaarquivo> listar(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public void excluir(int idArquivo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Arquivos arquivo = manager.find(Arquivos.class, idArquivo);
        manager.remove(arquivo);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    //Tipo Arquivo
    
    public List<Tipoarquivo> listarArquivos(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
          manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Tipoarquivo salvar(Tipoarquivo tipo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        tipo = manager.merge(tipo);
        //fechando uma transação
        manager.getTransaction().commit();
        return tipo;
    }
    
    public Tipoarquivousuario salvar(Tipoarquivousuario tipo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        tipo = manager.merge(tipo);
        //fechando uma transação
        manager.getTransaction().commit();
        return tipo;
    }
    
    public List<Viewtipoarquivousuario> listarTipoUsuario(int idTipo) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select t from Viewtipoarquivousuario t where t.tipoArquivoidtipoArquivo=" + idTipo +" order by t.nome");
          manager.getTransaction().commit();
        return q.getResultList();
    }
    
    
    
   
}
