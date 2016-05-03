/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FornecedorDao;
import java.sql.SQLException;
import java.util.List;
import model.Fornecedor;
import model.view.Viewfornecedor;

/**
 *
 * @author Wolverine
 */
public class FornecedorFacade {
    
    FornecedorDao fornecedorDao;
    
    public Fornecedor salvar(Fornecedor fornecedor) throws SQLException{
        fornecedorDao = new FornecedorDao();
        return fornecedorDao.salvar(fornecedor);
    }
    
    public Fornecedor consultar(int idFornecedor) throws SQLException{
        fornecedorDao = new FornecedorDao();
        return fornecedorDao.consultar(idFornecedor);
    }
    
    public List<Viewfornecedor> listaFornecedor(String sql) throws SQLException{
        fornecedorDao = new FornecedorDao();
        return fornecedorDao.listaFornecedor(sql);
    }
    
    public List<Fornecedor> listaFornecedorCadastro(String sql) throws SQLException{
        fornecedorDao = new FornecedorDao();
        return fornecedorDao.listaFornecedorCadastro(sql);
    }
    
}
