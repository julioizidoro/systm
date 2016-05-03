/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ItensAlteradosCursosDao;
import java.sql.SQLException;
import model.Itensalteradoscurso;

/**
 *
 * @author Julio
 */
public class ItensAlteradosCursosFacade {
    ItensAlteradosCursosDao itensAlteradosCursosDao;
    
    public Itensalteradoscurso salvar(Itensalteradoscurso itensalteradoscurso) throws SQLException{
        itensAlteradosCursosDao = new ItensAlteradosCursosDao();
        return itensAlteradosCursosDao.salvar(itensalteradoscurso);
    }
    
    public Itensalteradoscurso consultarCursos(int idHistoricoCursos) throws SQLException {
        itensAlteradosCursosDao = new ItensAlteradosCursosDao();
        return itensAlteradosCursosDao.consultarItensAlteradosCursos(idHistoricoCursos);
    }
}
