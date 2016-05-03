/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FornecedorCidadeDao;
import java.sql.SQLException;
import java.util.List;
import model.Fornecedorcidade;

/**
 *
 * @author Wolverine
 */
public class FornecedorCidadeFacade {
    
    FornecedorCidadeDao fornecedorCidadeDao;
    
    public Fornecedorcidade salvar(Fornecedorcidade fornecedorcidade) throws SQLException{
        fornecedorCidadeDao = new FornecedorCidadeDao();
        return fornecedorCidadeDao.salvar(fornecedorcidade);
    }
    
    public List<Fornecedorcidade> listar(String sql) throws SQLException{
        fornecedorCidadeDao = new FornecedorCidadeDao();
        return fornecedorCidadeDao.listar(sql);
    }
    
    public Fornecedorcidade getFonecedorCidade(int idFornecedor, int idCidade)throws SQLException{
        fornecedorCidadeDao = new FornecedorCidadeDao();
        return fornecedorCidadeDao.getFonecedorCidade(idFornecedor, idCidade);
    }
    
    public Fornecedorcidade getFornecedorCidade(int idFornecedorCidade) throws SQLException{
        fornecedorCidadeDao = new FornecedorCidadeDao();
        return fornecedorCidadeDao.getFornecedorCidade(idFornecedorCidade);
    }
    
    public Fornecedorcidade getFonecedorCidade(int idCodigo) throws SQLException{
        fornecedorCidadeDao = new FornecedorCidadeDao();
        return fornecedorCidadeDao.getFonecedorCidade(idCodigo);
    }
    
}
