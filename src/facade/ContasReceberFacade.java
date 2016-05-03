/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ContasReceberDao;
import java.sql.SQLException;
import java.util.List;
import model.Contasreceber;

/**
 *
 * @author Wolverine
 */
public class ContasReceberFacade {
    
    ContasReceberDao contasReceberDao;
    
    public Contasreceber salvar(Contasreceber conta) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.salvar(conta);
    }
    
    
    public Contasreceber consultar(int idConta) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.consultar(idConta);
    }
    
    public void excluir(int idConta) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        contasReceberDao.excluir(idConta);
    }
    
    public List<Contasreceber> listar(int idVendas)throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.listar(idVendas);
    }
    
    public List<Contasreceber> listar(String sql)throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.listar(sql);
    }
}
