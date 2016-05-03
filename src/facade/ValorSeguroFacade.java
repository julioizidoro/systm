/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ValorSeguroDao;
import java.sql.SQLException;
import java.util.List;
import model.Valoresseguro;

/**
 *
 * @author Wolverine
 */
public class ValorSeguroFacade {

    private ValorSeguroDao valorSeguroDao;

    
    public Valoresseguro salvar(Valoresseguro valor) throws SQLException{
        valorSeguroDao= new ValorSeguroDao();
        return valorSeguroDao.salvar(valor);
    }
    public Valoresseguro consultar(int idvalor) throws SQLException{
        valorSeguroDao= new ValorSeguroDao();
        return valorSeguroDao.consultar(idvalor);
    }
    
    public List<Valoresseguro> listar(int idFornecedor) throws SQLException{
        valorSeguroDao= new ValorSeguroDao();
        return valorSeguroDao.listar(idFornecedor);
    }
}
