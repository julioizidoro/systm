/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FormaPagamentoDao;
import java.sql.SQLException;
import java.util.List;
import model.Formapagamento;

/**
 *
 * @author Wolverine
 */
public class FormaPagamentoFacade {
    
    FormaPagamentoDao formaPagamentoDao;
    
    public Formapagamento salvar(Formapagamento formaPagamento) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        return formaPagamentoDao.salvar(formaPagamento);
    }
    
    public Formapagamento consultar(int idVenda) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        return formaPagamentoDao.consultar(idVenda);
    }
    
    public void excluir(int idFormaPagamento) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        formaPagamentoDao.excluir(idFormaPagamento);
    }
    
    public List<Formapagamento> listar(int idVenda) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        return formaPagamentoDao.listar(idVenda);
    }
}
