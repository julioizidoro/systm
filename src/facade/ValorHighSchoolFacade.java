/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ValorHighSchoolDao;
import java.sql.SQLException;
import java.util.List;
import model.Valoreshighschool;
import model.view.Viewconsultavaloreshighschool;

/**
 *
 * @author Wolverine
 */
public class ValorHighSchoolFacade {

    private ValorHighSchoolDao valorHighSchoolDao;

    
    public Valoreshighschool salvar(Valoreshighschool valor) throws SQLException{
        valorHighSchoolDao = new ValorHighSchoolDao();
        return valorHighSchoolDao.salvar(valor);
    }
    public Valoreshighschool consultar(int idvalor) throws SQLException{
        valorHighSchoolDao = new ValorHighSchoolDao();
        return valorHighSchoolDao.consultar(idvalor);
    }
    
    public List<Valoreshighschool> listar(int idFornecedor) throws SQLException{
        valorHighSchoolDao = new ValorHighSchoolDao();
        return valorHighSchoolDao.listar(idFornecedor);
    }
    
    public List<Viewconsultavaloreshighschool> listarConsulta(int idFornecedorCidade) throws SQLException{
        valorHighSchoolDao = new ValorHighSchoolDao();
        return valorHighSchoolDao.listarConsulta(idFornecedorCidade);
    }
    
}
