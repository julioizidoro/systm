/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.CoeficienteJurosDao;
import java.sql.SQLException;
import java.util.List;
import model.Coeficientejuros;

/**
 *
 * @author Wolverine
 */
public class CoeficienteJurosFacade {
    
    CoeficienteJurosDao coeficienteJurosDao;
    
    public Coeficientejuros salvar(Coeficientejuros coeficientejuros) throws SQLException{
        coeficienteJurosDao = new CoeficienteJurosDao();
        return coeficienteJurosDao.salvar(coeficientejuros);
    }
    
    public Coeficientejuros consultar(int numeroParcelas) throws SQLException{
        coeficienteJurosDao = new CoeficienteJurosDao();
        return coeficienteJurosDao.consultar(numeroParcelas);
    }
    
    public List<Coeficientejuros> listar() throws SQLException{
        coeficienteJurosDao = new CoeficienteJurosDao();
        return coeficienteJurosDao.listar();
    }
    
}
