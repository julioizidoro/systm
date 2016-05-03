/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.OrcamentoCursoDao;
import java.sql.SQLException;
import java.util.List;
import model.Orcamentocurso;
import model.Produtoorcamentocurso;
import model.Produtosorcamento;
import model.view.Vieworcamentocurso;

/**
 *
 * @author Wolverine
 */
public class OrcamentoCursoFacade {
    
    OrcamentoCursoDao orcamentoCursoDao;
    
    public Orcamentocurso salvar(Orcamentocurso orcamento) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.salvar(orcamento);
    }
    
    public Orcamentocurso consultar(int idOrcamento) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.consultar(idOrcamento);
    }
    
    public Produtoorcamentocurso salvar(Produtoorcamentocurso produtoOrcamentoCurso) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.salvar(produtoOrcamentoCurso);
    }
    
    public List<Produtoorcamentocurso> listarProdutoOrcamentoCurso(int idOrcamento) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.listarProdutoOrcamentoCurso(idOrcamento);
    }
    
    public Produtosorcamento consultarProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.consultarProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
    }
    
    public void excluirProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        orcamentoCursoDao.excluirProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
    }
    
    public List<Vieworcamentocurso> listarOrcamentoCurso(String sql) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.listarOrcamentoCurso(sql);
    }
    
    public Orcamentocurso consultarCliente(int idCliente) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.consultarCliente(idCliente);
    }
    
    public Produtoorcamentocurso consultarProdutoOrcamentoCuros(int idProdutoOrcamentoCurso) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.consultarProdutoOrcamentoCuros(idProdutoOrcamentoCurso);
    }
    
    public void excluirOrcamentoCuros(int idOrcamento) throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        orcamentoCursoDao.excluirOrcamentoCuros(idOrcamento);
    }
    
    public List<Orcamentocurso> listarOrcamentoCurso() throws SQLException{
        orcamentoCursoDao = new OrcamentoCursoDao();
        return orcamentoCursoDao.listarOrcamentoCurso();
    }
    
    
    
}
