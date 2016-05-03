/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ValorAupairDao;
import java.sql.SQLException;
import java.util.List;
import model.Valoresaupair;
import model.view.Viewconsultavaloresaupair;

/**
 *
 * @author Wolverine
 */
public class ValorAupairFacade {

    private ValorAupairDao valorAupairDao;

    
    public Valoresaupair salvar(Valoresaupair valor) throws SQLException{
        valorAupairDao = new ValorAupairDao();
        return valorAupairDao.salvar(valor);
    }
    public Valoresaupair consultar(int idvalor) throws SQLException{
        valorAupairDao = new ValorAupairDao();
        return valorAupairDao.consultar(idvalor);
    }
    
    public List<Valoresaupair> listar(int idFornecedor) throws SQLException{
        valorAupairDao = new ValorAupairDao();
        return valorAupairDao.listar(idFornecedor);
    }
    
    public List<Viewconsultavaloresaupair> listarConsulta(int idFornecedor) throws SQLException{
        valorAupairDao = new ValorAupairDao();
        return valorAupairDao.listarConsulta(idFornecedor);
    }
    
}
