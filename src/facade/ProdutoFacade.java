/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.List;
import model.Produtos;

/**
 *
 * @author Wolverine
 */
public class ProdutoFacade {
    
    private ProdutoDao produtoDao;
    
    public Produtos salvar(Produtos produto) throws SQLException{
        produtoDao = new ProdutoDao();
        return produtoDao.salvar(produto);
    }
    
    public List<Produtos> listarProdutos(String descricao) throws SQLException{
        produtoDao = new ProdutoDao();
        return produtoDao.listarProdutos(descricao);
    }
    
    public Produtos consultar(int idProduto) throws SQLException{
        produtoDao = new ProdutoDao();
        return produtoDao.consultar(idProduto);
    }
    
}
