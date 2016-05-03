/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.UsuarioDao;
import java.sql.SQLException;
import java.util.List;
import model.Pincambio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public class UsuarioFacade {
    
    UsuarioDao usuarioDao;
    
    public Usuario salvar(Usuario usuario) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.salvar(usuario);
    }
    
    public Usuario consultar(int idUsuario) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.consultar(idUsuario);
    }
    
    public Usuario consultar(String login, String senha) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.consultar(login, senha);
    }
    public List<Usuario> listaUsuario() throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.listaUsuario();
    }
    
    public List<Usuario> listaUsuarioUnidade(int idUnidade) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.listaUsuarioUnidade(idUnidade);
    }
    
    public List<Usuario> listaUsuario(String nome) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.listaUsuario(nome);
    }
    
  
    
    public Pincambio salvar(Pincambio pincambio) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.salvar(pincambio);
    }
    
    public Pincambio consultar(String pin, int idUsuario) throws SQLException{
        usuarioDao = new UsuarioDao();
        return usuarioDao.consultar(pin, idUsuario);
    }
    
}
