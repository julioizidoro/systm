/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FiltroOrcamentoProdutoFacade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Filtroorcamentoproduto;

/**
 *
 * @author Wolverine
 */
public class FiltroOrcamentoProdutoController {
    
    FiltroOrcamentoProdutoFacade filtroOrcamentoProdutoFacade;
    
    public Filtroorcamentoproduto salvar(Filtroorcamentoproduto filtro) {
        filtroOrcamentoProdutoFacade = new FiltroOrcamentoProdutoFacade();
        try {
            return filtroOrcamentoProdutoFacade.salvar(filtro);
        } catch (SQLException ex) {
            Logger.getLogger(FiltroOrcamentoProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Filtro Orçamento " + ex);
            return null;
        }
    }
    
    public void excluir(int idFiltro){
        filtroOrcamentoProdutoFacade = new FiltroOrcamentoProdutoFacade();
        try {
            filtroOrcamentoProdutoFacade.excluir(idFiltro);
        } catch (SQLException ex) {
            Logger.getLogger(FiltroOrcamentoProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Filtro Orçamento " + ex);
        }
    }
    
    public Filtroorcamentoproduto pesquisar(int idProduto, int idProdutoOrcamento) {
        filtroOrcamentoProdutoFacade = new FiltroOrcamentoProdutoFacade();
        try {
            return filtroOrcamentoProdutoFacade.pesquisar(idProduto, idProdutoOrcamento);
        } catch (SQLException ex) {
            Logger.getLogger(FiltroOrcamentoProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Pesquisar Filtro Orçamento " + ex);
            return null;
        }
    }
    
    public List<Filtroorcamentoproduto> pesquisar(int idProduto) {
        filtroOrcamentoProdutoFacade = new FiltroOrcamentoProdutoFacade();
        try {
            return filtroOrcamentoProdutoFacade.pesquisar(idProduto);
        } catch (SQLException ex) {
            Logger.getLogger(FiltroOrcamentoProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Pesquisar Filtro Orçamento " + ex);
            return null;
        }
    }
    
}
