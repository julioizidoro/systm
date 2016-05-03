/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FornecedorProdutoDao;
import java.sql.SQLException;
import java.util.List;
import model.Fornecedorproduto;
import model.view.Viewfornecedorproduto;

/**
 *
 * @author Wolverine
 */
public class FornecedorProdutoFacade {
    
    FornecedorProdutoDao fornecedorProdutoDao;
    
    public Fornecedorproduto salvar(Fornecedorproduto fornecedorProduto) throws SQLException{
        fornecedorProdutoDao = new FornecedorProdutoDao();
        return fornecedorProdutoDao.salvar(fornecedorProduto);
    }
    
    public void Excluir(int idFornecedorProduto) throws SQLException{
        fornecedorProdutoDao = new FornecedorProdutoDao();
        fornecedorProdutoDao.Excluir(idFornecedorProduto);
    }
    
    public List<Viewfornecedorproduto> listaFornecedorProduto(int idProduto) throws SQLException{
        fornecedorProdutoDao = new FornecedorProdutoDao();
        return fornecedorProdutoDao.listaFornecedorProduto(idProduto);
    }
}
