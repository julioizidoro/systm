/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FornecedorComissaoCursoDao;
import java.sql.SQLException;
import model.Fornecedorcomissaocurso;

/**
 *
 * @author Wolverine
 */
public class FornecedorComissaoCursoFacade {
    
    FornecedorComissaoCursoDao fornecedorComissaoCursoDao;
    
    public Fornecedorcomissaocurso salvar(Fornecedorcomissaocurso fornecedorcomissaocurso) throws SQLException{
        fornecedorComissaoCursoDao = new FornecedorComissaoCursoDao();
        return fornecedorComissaoCursoDao.salvar(fornecedorcomissaocurso);
    }
    
    public Fornecedorcomissaocurso getFonecedorComissaoCurso(int idFornecedor, int idPais) throws SQLException{
        fornecedorComissaoCursoDao = new FornecedorComissaoCursoDao();
        return fornecedorComissaoCursoDao.getFonecedorComissaoCurso(idFornecedor, idPais);
    }
    
}
