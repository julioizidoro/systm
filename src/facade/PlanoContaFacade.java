/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;


import dao.PlanoContaDao;
import java.sql.SQLException;
import model.Planoconta;

/**
 *
 * @author Wolverine
 */
public class PlanoContaFacade {
    
    PlanoContaDao planoContaDao;
    
    
    public Planoconta consultar(int idPlanoConta) throws SQLException{
        planoContaDao = new PlanoContaDao();
        return planoContaDao.consultar(idPlanoConta);
    }
}
