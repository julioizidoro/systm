/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.PaisDao;
import java.sql.SQLException;
import java.util.List;
import model.Pais;

/**
 *
 * @author Wolverine
 */
public class PaisFacade {
    
    PaisDao paisDao;
    
    public Pais salvar(Pais pais) throws SQLException{
        paisDao = new PaisDao();
        return paisDao.salvar(pais);
    }
    
    public List<Pais> listar(String nome) throws SQLException{
        paisDao = new PaisDao();
        return paisDao.listar(nome);
    }
    
    public Pais consultar(int idPais) throws SQLException{
        paisDao = new PaisDao();
        return paisDao.consultar(idPais);
    }
    
}
