/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.ProdutoRemessaFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produtoremessa;

/**
 *
 * @author Wolverine
 */
public class ProdutoRemessaController {
    
    private ProdutoRemessaFacade produtoRemessaFacade;
    
    public List<Produtoremessa> listar(int idProduto) {
        produtoRemessaFacade = new ProdutoRemessaFacade();
        try {
            return produtoRemessaFacade.listar(idProduto);
        } catch (Exception ex) {
            Logger.getLogger(ProdutoRemessaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro listar produto remessa " + ex);
            return null;
        }
    }
    
    public Produtoremessa salvar(Produtoremessa produtoRemessa) {
        produtoRemessaFacade = new ProdutoRemessaFacade();
        try {
            return produtoRemessaFacade.salvar(produtoRemessa);
        } catch (Exception ex) {
            Logger.getLogger(ProdutoRemessaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro salvar produto remessa " + ex);
            return null;
        }
    }
    
    public void excluir(int idProdutoRemessa) {
        produtoRemessaFacade = new ProdutoRemessaFacade();
        try {
            produtoRemessaFacade.excluir(idProdutoRemessa);
        } catch (Exception ex) {
            Logger.getLogger(ProdutoRemessaController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro excluir produto remessa " + ex);
        }
    }
    
}
