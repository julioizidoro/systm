/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Singleton.ConexaoSingleton;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Pincambio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public class UsuarioDao {
    
    private EntityManager manager;
    
    public Usuario salvar(Usuario usuario) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        usuario = manager.merge(usuario);
        //fechando uma transação
        manager.getTransaction().commit();
        return usuario;
    }
    
    public Usuario consultar(int idUsuario) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Usuario usuario = manager.find(Usuario.class, idUsuario);
        //fechando uma transação
        manager.getTransaction().commit();
        return usuario;
    }
    
    public Usuario consultar(String login, String senha) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select u from Usuario u where u.login='" + login + "' and u.senha='" + senha + "'  order by u.nome");
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Usuario) q.getResultList().get(0);
        }
        return null;
    }
    
    public List<Usuario> listaUsuario() throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select u from Usuario u where u.situacao='Ativo' order by u.nome");
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return q.getResultList();
        }
        return null;
    }
    
    public List<Usuario> listaUsuarioUnidade(int idUnidade) throws SQLException {
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select u from Usuario u where u.unidadenegocio=" + idUnidade + " and u.situacao='Ativo' order by u.nome");
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return q.getResultList();
        }
        return null;
    }
    
   
    
    public List<Usuario> listaUsuario(String nome) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select u from Usuario u where u.nome like '%" + nome + "%' order by u.nome" );
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Pincambio salvar(Pincambio pincambio) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        pincambio = manager.merge(pincambio);
        //fechando uma transação
        manager.getTransaction().commit();
        return pincambio;
    }
    
    public Pincambio consultar(String pin, int idUsuario) throws SQLException{
        manager = ConexaoSingleton.getConexao();
       manager.getTransaction().begin();
        Query q = manager.createQuery("select p from Pincambio p where p.numero='" + pin + "' and p.consultor=" + idUsuario +
                " and utilizado='N'");
       manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Pincambio) q.getResultList().get(0);
        }
        return null;
    }
    
}
