/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ProdutoOrcamentoDao;
import java.sql.SQLException;
import java.util.List;
import model.Produtosorcamento;
import model.view.Viewprodutosfiltro;

/**
 *
 * @author Wolverine
 */
public class ProdutoOrcamentoFacade {
    
    ProdutoOrcamentoDao produtoOrcamentoDao;
    
    public Produtosorcamento salvar(Produtosorcamento produto) throws SQLException{
        produtoOrcamentoDao = new ProdutoOrcamentoDao();
        return produtoOrcamentoDao.salvar(produto);
        
    }
    
    public List<Produtosorcamento> listarProdutosOrcamento(String descricao) throws SQLException{
        produtoOrcamentoDao = new ProdutoOrcamentoDao();
        return produtoOrcamentoDao.listarProdutosOrcamento(descricao);
    }
    
    public Produtosorcamento consultar(int idProdutoOrcamento) throws SQLException{
        produtoOrcamentoDao = new ProdutoOrcamentoDao();
        return produtoOrcamentoDao.consultar(idProdutoOrcamento);
    }
    
    public List<Viewprodutosfiltro> listarFiltroProdutosOrcamento(int idProduto) throws SQLException{
        produtoOrcamentoDao = new ProdutoOrcamentoDao();
        return produtoOrcamentoDao.listarFiltroProdutosOrcamento(idProduto);
    }
    
    public Viewprodutosfiltro consultarFiltro(int idProduto, int idProdutoOrcamento) throws SQLException{
         produtoOrcamentoDao = new ProdutoOrcamentoDao();
         return produtoOrcamentoDao.consultarFiltro(idProduto, idProdutoOrcamento);
    }
    
}
