/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NotificacaoEmailDao;
import facade.NotificacaoEmailFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Notificacaoemail;
import model.view.Viewnotificacaoemail;

/**
 *
 * @author Wolverine
 */
public class NotificacaoEmailController {
    
    private NotificacaoEmailFacade notificacaoEmailFacade;
    
    public Notificacaoemail salvar(Notificacaoemail notificacao){
        notificacaoEmailFacade = new NotificacaoEmailFacade();
        try {
            return notificacaoEmailFacade.salvar(notificacao);
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoEmailController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Notificação de Email " + ex);
            return null;
        }
    }
    
    public void excluir(int idNotificacao) {
        notificacaoEmailFacade = new NotificacaoEmailFacade();
        try {
            notificacaoEmailFacade.excluir(idNotificacao);
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoEmailController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Notificação de Email " + ex);
        }
    }
    
    public List<Viewnotificacaoemail> listar(int idProduto, String tipoAviso){
        notificacaoEmailFacade = new NotificacaoEmailFacade();
        try {
            return notificacaoEmailFacade.listar(idProduto, tipoAviso);
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoEmailController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Notificação de Email " + ex);
            return null;
        }
    }
            
            
    
}
