/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.BancoDao;
import java.sql.SQLException;
import java.util.List;
import model.Banco;

/**
 *
 * @author Wolverine
 */
public class BancoFacade {
    
    BancoDao bancoDao;
    
    public List<Banco> listar()throws SQLException {
        bancoDao = new BancoDao();
        return bancoDao.listar();
    }    
}
