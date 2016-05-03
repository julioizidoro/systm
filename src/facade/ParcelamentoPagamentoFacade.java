/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ParcelamentoPagamentoDao;
import java.sql.SQLException;
import java.util.List;
import model.Parcelamentopagamento;

/**
 *
 * @author Wolverine
 */
public class ParcelamentoPagamentoFacade {
    
    ParcelamentoPagamentoDao parcelamentoPagamentoDao;
    
    public Parcelamentopagamento salvar(Parcelamentopagamento parcelamento) throws SQLException{
        parcelamentoPagamentoDao = new ParcelamentoPagamentoDao();
        return parcelamentoPagamentoDao.salvar(parcelamento);
    }
    
    public List<Parcelamentopagamento> listar(int idFormaPagamento) throws SQLException{
        parcelamentoPagamentoDao = new ParcelamentoPagamentoDao();
        return parcelamentoPagamentoDao.listar(idFormaPagamento);
    }
    
    public void excluir(int idParcelamento) throws SQLException{
        parcelamentoPagamentoDao = new ParcelamentoPagamentoDao();
        parcelamentoPagamentoDao.excluir(idParcelamento);
    }
    
    
    
}
