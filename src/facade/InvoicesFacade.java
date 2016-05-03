/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.InvoicesDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Invoices;
import model.view.Viewconsultainvoice;

/**
 *
 * @author Wolverine
 */
public class InvoicesFacade {
    
    InvoicesDao invoicesDao;
    
    public Invoices salvar(Invoices invoice) throws SQLException{
        invoicesDao = new InvoicesDao();
        return invoicesDao.salvar(invoice);
    }
    
    public List<Viewconsultainvoice> listar(String sql) throws SQLException{
        invoicesDao = new InvoicesDao();
        return invoicesDao.listar(sql);
    }
    
    public Invoices consultarVenda(int idVenda, int idProduto, int idControle) throws SQLException{
        invoicesDao = new InvoicesDao();
        return invoicesDao.consultarVenda(idVenda, idProduto, idControle);
    }
    
    public Invoices consultarVenda(int idVenda) throws SQLException{
        invoicesDao = new InvoicesDao();
        return invoicesDao.consultarVenda(idVenda);
    }
    
    public Invoices consultar(int idInvoice) throws SQLException{
        invoicesDao = new InvoicesDao();
        return invoicesDao.consultar(idInvoice);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        invoicesDao = new InvoicesDao();
        return invoicesDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
}
