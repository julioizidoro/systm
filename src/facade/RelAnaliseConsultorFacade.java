/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.RelAnaliseConsultorDao;
import java.io.IOException;
import java.sql.SQLException;
import model.Relanaliseconsultor;

/**
 *
 * @author Wolverine
 */
public class RelAnaliseConsultorFacade {
    
    RelAnaliseConsultorDao relAnaliseConsultorDao;
    
    public Relanaliseconsultor salvar(Relanaliseconsultor relanaliseconsultor) throws SQLException{
        relAnaliseConsultorDao = new RelAnaliseConsultorDao();
        return relAnaliseConsultorDao.salvar(relanaliseconsultor);
    }
    
    public void apagar(String local, String porta, String senha, String banco, String usuario) throws IOException {
        relAnaliseConsultorDao = new RelAnaliseConsultorDao();
        relAnaliseConsultorDao.apagar(local, porta, senha, banco, usuario);
    }
    
    public void crair(String local, String porta, String senha, String banco, String usuario) throws IOException {
        relAnaliseConsultorDao = new RelAnaliseConsultorDao();
        relAnaliseConsultorDao.crair(local, porta, senha, banco, usuario);
    }
    
}
