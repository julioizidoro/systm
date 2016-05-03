/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.FornecedorComissaoCursoFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedorcomissaocurso;

/**
 *
 * @author Wolverine
 */
public class FornecedorComissaoCursoController {
    
    FornecedorComissaoCursoFacade fornecedorComissaoCursoFacade;
    
    public Fornecedorcomissaocurso salvar(Fornecedorcomissaocurso fornecedorcomissaocurso) {
        fornecedorComissaoCursoFacade = new FornecedorComissaoCursoFacade();
        try {
            return fornecedorComissaoCursoFacade.salvar(fornecedorcomissaocurso);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorComissaoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Fornecedor Comissão Curso " + ex);
            return null;
        }
    }
    
    public Fornecedorcomissaocurso getFonecedorComissaoCurso(int idFornecedor, int idPais) {
        fornecedorComissaoCursoFacade = new FornecedorComissaoCursoFacade();
        try {
            return fornecedorComissaoCursoFacade.getFonecedorComissaoCurso(idFornecedor, idPais);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorComissaoCursoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Fornecedor Comissão Curso " + ex);
            return null;
        }
    }
    
}
