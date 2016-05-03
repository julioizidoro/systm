/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CotacaoPacotesDao;
import java.sql.SQLException;
import java.util.List;
import model.Cotacaopacotes;
import model.view.Viewconsultacotacaopacote;

/**
 *
 * @author Wolverine
 */
public class CotacaoPacotesFacade {
    
    CotacaoPacotesDao cotacaoPacotesDao;
    
    public Cotacaopacotes salvar(Cotacaopacotes cotacaoPacotes) throws SQLException{
        cotacaoPacotesDao = new CotacaoPacotesDao();
        return cotacaoPacotesDao.salvar(cotacaoPacotes);
    }
    
    public Cotacaopacotes consultar(int idCotacaopacotes) throws SQLException{
        cotacaoPacotesDao = new CotacaoPacotesDao();
        return cotacaoPacotesDao.consultar(idCotacaopacotes);
    }
    
    public List<Viewconsultacotacaopacote> lista(String sql) throws SQLException{
        cotacaoPacotesDao = new CotacaoPacotesDao();
        return cotacaoPacotesDao.lista(sql);
    }
    
}
