/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.GrupoAcessoDao;
import java.sql.SQLException;
import java.util.List;
import model.Grupoacesso;

/**
 *
 * @author Wolverine
 */
public class GrupoAcessoFacade {
    
    GrupoAcessoDao grupoAcessoDao;
    
    public Grupoacesso salvar(Grupoacesso grupo) throws SQLException{
        grupoAcessoDao = new GrupoAcessoDao();
        return grupoAcessoDao.salvar(grupo);
    }
    
    public Grupoacesso consultar(int idgrupo) throws SQLException{
        grupoAcessoDao = new GrupoAcessoDao();
        return grupoAcessoDao.consultar(idgrupo);
    }
    
    public List<Grupoacesso> listar() throws SQLException{
        grupoAcessoDao = new GrupoAcessoDao();
        return grupoAcessoDao.listar();
    }
    
}
