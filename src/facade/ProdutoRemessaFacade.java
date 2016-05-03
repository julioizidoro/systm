/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ProdutoRemessaDao;
import java.util.List;
import model.Produtoremessa;

/**
 *
 * @author Wolverine
 */
public class ProdutoRemessaFacade {
    
    private ProdutoRemessaDao produtoRemessaDao;
    
    public List<Produtoremessa> listar(int idProduto) throws Exception{
        produtoRemessaDao = new ProdutoRemessaDao();
        return produtoRemessaDao.listar(idProduto);
    }
    
    public Produtoremessa salvar(Produtoremessa produtoRemessa) throws Exception{
        produtoRemessaDao = new ProdutoRemessaDao();
        return produtoRemessaDao.salvar(produtoRemessa);
    }
    
    public void excluir(int idProdutoRemessa) throws Exception{
        produtoRemessaDao = new ProdutoRemessaDao();
        produtoRemessaDao.excluir(idProdutoRemessa);
    }
    
}
