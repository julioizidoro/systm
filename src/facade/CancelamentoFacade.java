/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CancelamentoDao;
import java.sql.SQLException;
import model.Cancelamento;

/**
 *
 * @author Wolverine
 */
public class CancelamentoFacade {
    
    private CancelamentoDao cancelamentoDao;
    
    public Cancelamento salvar(Cancelamento cancelamento) throws SQLException{
        cancelamentoDao = new CancelamentoDao();
        return cancelamentoDao.salvar(cancelamento);
    }
    
    public Cancelamento cunsultar(int idVenda) throws SQLException{
        cancelamentoDao = new CancelamentoDao();
        return cancelamentoDao.cunsultar(idVenda);
    }
    
}
