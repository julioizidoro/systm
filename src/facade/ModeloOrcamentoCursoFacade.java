/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ModeloOrcamentoCursoDao;
import java.sql.SQLException;
import java.util.List;
import model.Modeloorcamentocurso;
import model.Modeloorcamentocursoforma;
import model.Modeloprodutoorcamentocurso;
import model.Produtosorcamento;
import model.view.Viewmodeloorcamento;
import model.view.Vieworcamentocurso;

/**
 *
 * @author Wolverine
 */
public class ModeloOrcamentoCursoFacade {
    
    ModeloOrcamentoCursoDao modeloOrcamentoCursoDao;
    
    public Modeloorcamentocurso salvar(Modeloorcamentocurso orcamento) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.salvar(orcamento);
    }
    
    public Modeloorcamentocurso consultar(int idOrcamento) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.consultar(idOrcamento);
    }
    
    public Modeloprodutoorcamentocurso salvar(Modeloprodutoorcamentocurso modeloProdutoOrcamentoCurso) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.salvar(modeloProdutoOrcamentoCurso);
    }
    
    public List<Modeloprodutoorcamentocurso> listarProdutoOrcamentoCurso(int idOrcamento) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.listarProdutoOrcamentoCurso(idOrcamento);
    }
    
    public Produtosorcamento consultarProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.consultarProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
    }
    
    public void excluirModleoProdutoOrcamentoCurso(int idProdutoOrcamentoCurso) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        modeloOrcamentoCursoDao.excluirModleoProdutoOrcamentoCurso(idProdutoOrcamentoCurso);
    }
    
    public List<Vieworcamentocurso> listarOrcamentoCurso(String sql) throws SQLException{
        //nada
        return null;
    }
    
    
    public Modeloprodutoorcamentocurso consultarProdutoOrcamentoCuros(int idProdutoOrcamentoCurso) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.consultarProdutoOrcamentoCuros(idProdutoOrcamentoCurso);
    }
    
    public Modeloorcamentocursoforma salvar(Modeloorcamentocursoforma modeloForma) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.salvar(modeloForma);
    }
     
     public Modeloorcamentocursoforma consultarFormaPagamento(int idOrcamento) throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.consultarFormaPagamento(idOrcamento);
    }
     
    public List<Viewmodeloorcamento> listarModeloOrcamentoCurso(String sql) throws SQLException{
         modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
         return modeloOrcamentoCursoDao.listarModeloOrcamentoCurso(sql);
    }
    
    public List<Modeloorcamentocurso> listarModeloOrcamentoCurso() throws SQLException{
        modeloOrcamentoCursoDao = new ModeloOrcamentoCursoDao();
        return modeloOrcamentoCursoDao.listarModeloOrcamentoCurso();
    }
    
}
