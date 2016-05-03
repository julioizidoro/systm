/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.InvoicesFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Invoices;
import model.view.Viewconsultainvoice;

/**
 *
 * @author Wolverine
 */
public class InvoicesController {
    
    InvoicesFacade invoicesFacade;
    
    public Invoices salvar(Invoices invoice) {
        invoicesFacade = new InvoicesFacade();
        try {
            return invoicesFacade.salvar(invoice);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Invoice " +  ex);
            return null;
        }
    }
    
    public List<Viewconsultainvoice> listar(String sql) {
        invoicesFacade = new InvoicesFacade();
        try {
            return invoicesFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Invoices " +  ex);
            return null;
        }
    }
    
    public Invoices consultarVenda(int idVenda, int idProduto, int idControle) {
        invoicesFacade = new InvoicesFacade();
        try {
            return invoicesFacade.consultarVenda(idVenda, idProduto, idControle);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Invoices " +  ex);
            return null;
        }
    }
    
    public Invoices consultarVenda(int idVenda) {
        invoicesFacade = new InvoicesFacade();
        try {
            return invoicesFacade.consultarVenda(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Invoices " +  ex);
            return null;
        }
    }
    
    public Invoices consultar(int idInvoice)  {
        invoicesFacade = new InvoicesFacade();
        try {
            return invoicesFacade.consultar(idInvoice);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Consultar Invoice " +  ex);
            return null;
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade)  {
        invoicesFacade = new InvoicesFacade();
        try {
            return invoicesFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
        } catch (IOException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Exportar Invoices");
            return null;
        }
    }
    
}
