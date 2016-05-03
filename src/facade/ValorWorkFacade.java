/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ValorWorkDao;
import java.sql.SQLException;
import java.util.List;
import model.Valoreswork;
import model.view.Viewconsultavaloreswork;

/**
 *
 * @author Wolverine
 */
public class ValorWorkFacade {

    private ValorWorkDao valorWorkDao;

    
    public Valoreswork salvar(Valoreswork valor) throws SQLException{
        valorWorkDao = new ValorWorkDao();
        return valorWorkDao.salvar(valor);
    }
    public Valoreswork consultar(int idvalor) throws SQLException{
        valorWorkDao = new ValorWorkDao();
        return valorWorkDao.consultar(idvalor);
    }
    
    public List<Valoreswork> listar(int idFornecedor) throws SQLException{
        valorWorkDao = new ValorWorkDao();
        return valorWorkDao.listar(idFornecedor);
    }
    
    public List<Viewconsultavaloreswork> listarConsulta(int idFornecedorcidade) throws SQLException{
        valorWorkDao = new ValorWorkDao();
        return valorWorkDao.listarConsulta(idFornecedorcidade);
    }
    
}
