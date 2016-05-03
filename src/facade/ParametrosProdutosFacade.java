/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ParametrosProdutosDao;
import java.sql.SQLException;
import model.Parametrosprodutos;

/**
 *
 * @author Wolverine
 */
public class ParametrosProdutosFacade {
    
    ParametrosProdutosDao parametrosProdutosDao;
    
    public Parametrosprodutos salvar(Parametrosprodutos parametrosprodutos) throws SQLException{
        parametrosProdutosDao = new ParametrosProdutosDao();
        return parametrosProdutosDao.salvar(parametrosprodutos);
    }
    
    public Parametrosprodutos consultar() throws SQLException{
        parametrosProdutosDao = new ParametrosProdutosDao();
        return parametrosProdutosDao.consultar();
    }
    
}
