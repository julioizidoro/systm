/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ValorTraineeDao;
import java.sql.SQLException;
import java.util.List;
import model.Valorestrainee;

/**
 *
 * @author Wolverine
 */
public class ValorTraineeFacade {

    private ValorTraineeDao valorTraineeDao;

    
    public Valorestrainee salvar(Valorestrainee valor) throws SQLException{
        valorTraineeDao= new ValorTraineeDao();
        return valorTraineeDao.salvar(valor);
    }
    public Valorestrainee consultar(int idvalor) throws SQLException{
        valorTraineeDao= new ValorTraineeDao();
        return valorTraineeDao.consultar(idvalor);
    }
    
    public List<Valorestrainee> listar(int idFornecedor) throws SQLException{
        valorTraineeDao= new ValorTraineeDao();
        return valorTraineeDao.listar(idFornecedor);
    }
}
