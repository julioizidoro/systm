/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FaturaFranquiasDao;
import java.sql.SQLException;
import model.Faturafranquias;

/**
 *
 * @author Wolverine
 */
public class FaturaFranquiasFacade {
    
    private FaturaFranquiasDao faturaFranquiasDao;
    
    public Faturafranquias salvar(Faturafranquias faturafranquias) throws SQLException{
        faturaFranquiasDao = new FaturaFranquiasDao();
        return faturaFranquiasDao.salvar(faturafranquias);
    }
    
    public Faturafranquias getFaturaFranquia(int idVendasComissao)throws SQLException{
        faturaFranquiasDao = new FaturaFranquiasDao();
        return faturaFranquiasDao.getFaturaFranquia(idVendasComissao);
    }
    
    public void excluir(int idFaturaFranquias) throws SQLException{
        faturaFranquiasDao = new FaturaFranquiasDao();
        faturaFranquiasDao.excluir(idFaturaFranquias);
    }
}
