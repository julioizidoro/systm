/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FtpDadosDao;
import java.sql.SQLException;
import model.Ftpdados;

/**
 *
 * @author Wolverine
 */
public class FtpDadosFacade {
    
    FtpDadosDao ftpDadosDao;
    
    public Ftpdados getFTPDados()throws SQLException{
        ftpDadosDao = new FtpDadosDao();
        return ftpDadosDao.getFTPDados();
        
    }
    
}
