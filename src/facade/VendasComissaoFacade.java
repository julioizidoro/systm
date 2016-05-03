/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.VendasComissaoDao;
import java.sql.SQLException;
import model.Vendascomissao;

/**
 *
 * @author Wolverine
 */
public class VendasComissaoFacade {
    
    VendasComissaoDao vendasComissaoDao;
    
    public Vendascomissao salvar(Vendascomissao vendasComissao) throws SQLException{
        vendasComissaoDao = new VendasComissaoDao();
        return vendasComissaoDao.salvar(vendasComissao);
    }
    
    public Vendascomissao getVendaComissao(int idVenda, int idProdutos)throws SQLException{
        vendasComissaoDao = new VendasComissaoDao();
        return vendasComissaoDao.getVendaComissao(idVenda, idProdutos);
    }
    
    public void excluir(int idVendaComissao) throws SQLException{
        vendasComissaoDao = new VendasComissaoDao();
        vendasComissaoDao.excluir(idVendaComissao);
    }
    
}
