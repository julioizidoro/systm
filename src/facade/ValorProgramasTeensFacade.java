/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ValorProgramasTeensDao;
import java.sql.SQLException;
import java.util.List;
import model.Valoresprogramasteens;

/**
 *
 * @author Wolverine
 */
public class ValorProgramasTeensFacade {

    private ValorProgramasTeensDao valorprogramasTeensDao;

    
    public Valoresprogramasteens salvar(Valoresprogramasteens valor) throws SQLException{
        valorprogramasTeensDao= new ValorProgramasTeensDao();
        return valorprogramasTeensDao.salvar(valor);
    }
    public Valoresprogramasteens consultar(int idvalor) throws SQLException{
        valorprogramasTeensDao= new ValorProgramasTeensDao();
        return valorprogramasTeensDao.consultar(idvalor);
    }
    
    public List<Valoresprogramasteens> listar(int idFornecedor) throws SQLException{
        valorprogramasTeensDao= new ValorProgramasTeensDao();
        return valorprogramasTeensDao.listar(idFornecedor);
    }
}
