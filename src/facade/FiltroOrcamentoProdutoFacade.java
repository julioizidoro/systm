/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FiltroOrcamentoProdutoDao;
import java.sql.SQLException;
import java.util.List;
import model.Filtroorcamentoproduto;

/**
 *
 * @author Wolverine
 */
public class FiltroOrcamentoProdutoFacade {
    
    FiltroOrcamentoProdutoDao filtroOrcamentoProdutoDao;
    
    public Filtroorcamentoproduto salvar(Filtroorcamentoproduto filtro) throws SQLException{
        filtroOrcamentoProdutoDao = new FiltroOrcamentoProdutoDao();
        return filtroOrcamentoProdutoDao.salvar(filtro);
    }
    
    public void excluir(int idFiltro) throws SQLException{
        filtroOrcamentoProdutoDao = new FiltroOrcamentoProdutoDao();
        filtroOrcamentoProdutoDao.excluir(idFiltro);
    }
    
    public Filtroorcamentoproduto pesquisar(int idProduto, int idProdutoOrcamento) throws SQLException{
        filtroOrcamentoProdutoDao = new FiltroOrcamentoProdutoDao();
        return filtroOrcamentoProdutoDao.pesquisar(idProduto, idProdutoOrcamento);
    }
    
    public List<Filtroorcamentoproduto> pesquisar(int idProduto) throws SQLException{
        filtroOrcamentoProdutoDao = new FiltroOrcamentoProdutoDao();
        return filtroOrcamentoProdutoDao.pesquisar(idProduto);
    }
    
}
