/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Invoice.Relatorio;

import java.util.List;

/**
 *
 * @author Julio
 */
public class InvoicesFactory {
    private static List<InvoicesBean> invoicesBeans;

    public static List<InvoicesBean> getInvoicesBeans() {
        return invoicesBeans;
    }

    public static void setInvoicesBeans(List<InvoicesBean> invoicesBeans) {
        InvoicesFactory.invoicesBeans = invoicesBeans;
    }
    
    public static List<InvoicesBean> listar(){
        return getInvoicesBeans();
    }
}