/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;
import model.view.Viewcliente;

/**
 *
 * @author Wolverine
 */
public class ClienteFacade {
    
    ClienteDao clienteDao;
    
    public Cliente salvar(Cliente cliente) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.salvar(cliente);
    }
    
    public List<Viewcliente> listar(String sql) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.listar(sql);
    }
    
    public Cliente consultar(int idCliente) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.consultar(idCliente);
    }
    
    public Cliente consultarEmail(String email) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.consultarEmail(email);
    }
    
}
