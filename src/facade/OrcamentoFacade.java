/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.OrcamentoDao;
import java.sql.SQLException;
import java.util.List;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Produtosorcamento;

/**
 *
 * @author Wolverine
 */
public class OrcamentoFacade {
    
    OrcamentoDao orcamentoDao;
    
    public Orcamento salvar(Orcamento orcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        return orcamentoDao.salvar(orcamento);
    }
    
    public Orcamento consultar(int idVenda) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        return orcamentoDao.consultar(idVenda);
    }
    
    public Orcamentoprodutosorcamento salvar(Orcamentoprodutosorcamento orcamentoprodutosorcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        return orcamentoDao.salvar(orcamentoprodutosorcamento);
    }
    
    public List<Orcamentoprodutosorcamento> listarOrcamentoProdutoOrcamento(int idOrcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        return orcamentoDao.listarOrcamentoProdutoOrcamento(idOrcamento);
    }
    
    public Produtosorcamento consultarProdutoOrcamento(int idProdutoOrcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        return orcamentoDao.consultarProdutoOrcamento(idProdutoOrcamento);
    }
    
    public void excluirOrcamentoProdutoOrcamento(int idOrcamentoprodutosorcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        orcamentoDao.excluirOrcamentoProdutoOrcamento(idOrcamentoprodutosorcamento);
    }
    
    public void excluirOrcamento(int idOrcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        orcamentoDao.excluirOrcamento(idOrcamento);
    }
    
    public Orcamentoprodutosorcamento consultarOrcamentoProdutoOrcamento(int idIrcamentoProdutosOrcamento) throws SQLException{
        orcamentoDao = new OrcamentoDao();
        return orcamentoDao.consultarOrcamentoProdutoOrcamento(idIrcamentoProdutosOrcamento);
    }
    
}
