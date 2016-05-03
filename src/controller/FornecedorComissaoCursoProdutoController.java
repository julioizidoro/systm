/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FornecedorComissaoCursoProdutoFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedorcomissaocursoproduto;

/**
 *
 * @author Wolverine
 */
public class FornecedorComissaoCursoProdutoController {
    
    FornecedorComissaoCursoProdutoFacade fornecedorComissaoCursoProdutoFacade;
    
    public Fornecedorcomissaocursoproduto salvar(Fornecedorcomissaocursoproduto fornecedor) {
        fornecedorComissaoCursoProdutoFacade = new FornecedorComissaoCursoProdutoFacade();
        try {
            return fornecedorComissaoCursoProdutoFacade.salvar(fornecedor);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorComissaoCursoProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor Comissão Curso Produto " + ex);
            return null;
        }
    }
    
    public Fornecedorcomissaocursoproduto consultar(int idFornecedorcomissaocurso, int idprodutoorcamento) {
        fornecedorComissaoCursoProdutoFacade = new FornecedorComissaoCursoProdutoFacade();
        try {
            return fornecedorComissaoCursoProdutoFacade.consultar(idFornecedorcomissaocurso, idprodutoorcamento);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorComissaoCursoProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fornecedor Comissão Curso Produto " + ex);
            return null;
        }
    }
    
}
