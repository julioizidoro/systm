/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.OrcamentoCursoFormaPagamentoDao;
import java.sql.SQLException;
import model.Orcamentocursoformapagamento;

/**
 *
 * @author Wolverine
 */
public class OrcamentoCursoFormaPagamentoFacade {
    
    OrcamentoCursoFormaPagamentoDao orcamentoCursoFormaPagamentoDao;
    
    public Orcamentocursoformapagamento salvar(Orcamentocursoformapagamento orcamento) throws SQLException{
        orcamentoCursoFormaPagamentoDao = new OrcamentoCursoFormaPagamentoDao();
        return orcamentoCursoFormaPagamentoDao.salvar(orcamento);
    }
    
    public Orcamentocursoformapagamento consultar(int idOrcamento) throws SQLException{
        orcamentoCursoFormaPagamentoDao = new OrcamentoCursoFormaPagamentoDao();
        return orcamentoCursoFormaPagamentoDao.consultar(idOrcamento);
    }
    
}
