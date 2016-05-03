/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Notificacaoemail;
import model.view.Viewnotificacaoemail;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class NotificacaoEmailDao {
    
    private EntityManager manager;
    
    public Notificacaoemail salvar(Notificacaoemail notificacao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        notificacao = manager.merge(notificacao);
        //fechando uma transação
        manager.getTransaction().commit();
        return notificacao;
    }
    
    public void excluir(int idNotificacao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Notificacaoemail notificacao = manager.find(Notificacaoemail.class, idNotificacao);
        manager.remove(notificacao);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public List<Viewnotificacaoemail> listar(int idProduto, String tipoAviso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select n from Viewnotificacaoemail n where n.idprodutos=" + idProduto + " and n.tipoAviso<>'" 
                + tipoAviso + "' order by n.nome" );
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
}
