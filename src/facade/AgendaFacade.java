/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.AgendaDao;
import java.sql.SQLException;
import java.util.List;
import model.Agenda;
import model.view.Viewconusltaagenda;

/**
 *
 * @author Wolverine
 */
public class AgendaFacade {
    
    AgendaDao agendaDao;
    
    public Agenda salvar(Agenda agenda) throws SQLException{
        agendaDao = new AgendaDao();
        return agendaDao.salvar(agenda);
    }
    
    public void excluir(int idAgenda) throws SQLException{
        agendaDao = new AgendaDao();
        agendaDao.excluir(idAgenda);
    }
    
    public Agenda consultar(int idAgenda) throws SQLException{
        agendaDao = new AgendaDao();
        return agendaDao.consultar(idAgenda);
    }
    
    public List<Viewconusltaagenda> listaViewAgenda(String sql) throws SQLException{
        agendaDao = new AgendaDao();
        return agendaDao.listaViewAgenda(sql);
    }
    
    public Agenda consultarControle(int idControleLoja) throws SQLException{
        agendaDao = new AgendaDao();
        return agendaDao.consultarControle(idControleLoja);
    }
    
}
