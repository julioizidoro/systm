/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.NotificacaoEmailDao;
import java.sql.SQLException;
import java.util.List;
import model.Notificacaoemail;
import model.view.Viewnotificacaoemail;

/**
 *
 * @author Wolverine
 */
public class NotificacaoEmailFacade {
    
    private NotificacaoEmailDao notificacaoEmailDao;
    
    public Notificacaoemail salvar(Notificacaoemail notificacao) throws SQLException{
        notificacaoEmailDao = new NotificacaoEmailDao();
        return notificacaoEmailDao.salvar(notificacao);
    }
    
    public void excluir(int idNotificacao) throws SQLException{
        notificacaoEmailDao = new NotificacaoEmailDao();
        notificacaoEmailDao.excluir(idNotificacao);
    }
    
    public List<Viewnotificacaoemail> listar(int idProduto, String tipoAviso) throws SQLException{
        notificacaoEmailDao = new NotificacaoEmailDao();
        return notificacaoEmailDao.listar(idProduto, tipoAviso);
    }
    
}
