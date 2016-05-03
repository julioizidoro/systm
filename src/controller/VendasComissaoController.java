/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.VendasComissaoFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Vendascomissao;

/**
 *
 * @author Wolverine
 */
public class VendasComissaoController {
    
    VendasComissaoFacade vendasComissaoFacade;
    
    public Vendascomissao salvar(Vendascomissao vendasComissao) {
        vendasComissaoFacade = new VendasComissaoFacade();
        try {
            return vendasComissaoFacade.salvar(vendasComissao);
        } catch (SQLException ex) {
            Logger.getLogger(VendasComissaoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Comissão Vendas " + ex);
            return null;
        }
    }
    
    public Vendascomissao getVendaComissao(int idVenda, int idProduto) {
        vendasComissaoFacade = new VendasComissaoFacade();
        try {
            return vendasComissaoFacade.getVendaComissao(idVenda, idProduto);
        } catch (SQLException ex) {
            Logger.getLogger(VendasComissaoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Comissão Vendas " + ex);
            return null;
        }
    }
    
    public void excluir(int idVendaComissao) {
        vendasComissaoFacade = new VendasComissaoFacade();
        try {
            vendasComissaoFacade.excluir(idVendaComissao);
        } catch (SQLException ex) {
            Logger.getLogger(VendasComissaoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Comissão da Venda " + ex);
        }
    }
    
}
