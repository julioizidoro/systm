/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CidadeDao;
import java.sql.SQLException;
import java.util.List;
import model.Cidade;

/**
 *
 * @author Wolverine
 */
public class CidadeFacade {
    
    CidadeDao cidadeDao;
    
    public Cidade salvar(Cidade cidade) throws SQLException{
        cidadeDao = new CidadeDao();
        return cidadeDao.salvar(cidade);
    }
    
    public List<Cidade> listar(String nome) throws SQLException{
        cidadeDao = new CidadeDao();
        return cidadeDao.listar(nome);
    }
    
}
