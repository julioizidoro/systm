/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FornecedorComissaoCursoProdutoDao;
import java.sql.SQLException;
import model.Fornecedorcomissaocursoproduto;

/**
 *
 * @author Wolverine
 */
public class FornecedorComissaoCursoProdutoFacade {
    
    FornecedorComissaoCursoProdutoDao fornecedorComissaoCursoProdutoDao;
    
    public Fornecedorcomissaocursoproduto salvar(Fornecedorcomissaocursoproduto fornecedor) throws SQLException{
        fornecedorComissaoCursoProdutoDao = new FornecedorComissaoCursoProdutoDao();
        return fornecedorComissaoCursoProdutoDao.salvar(fornecedor);
    }
    
    public Fornecedorcomissaocursoproduto consultar(int idFornecedorcomissaocurso, int idprodutoorcamento) throws SQLException{
        fornecedorComissaoCursoProdutoDao = new FornecedorComissaoCursoProdutoDao();
        return fornecedorComissaoCursoProdutoDao.consultar(idFornecedorcomissaocurso, idprodutoorcamento);
    }
    
}
