/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoProdutos.Relatorio;

import java.util.List;
import telas.OrcamentoProdutos.OrcamentoProdutoBean;

/**
 *
 * @author Wolverine
 */
public class RelOrcamentoProdutoBean {
    
    private static List<OrcamentoProdutoBean> listaProduto;

    

    public static List<OrcamentoProdutoBean> getListaProduto() {
        return listaProduto;
    }

    public static void setListaProduto(List<OrcamentoProdutoBean> listaProduto) {
        RelOrcamentoProdutoBean.listaProduto = listaProduto;
    }
    
    public static List<OrcamentoProdutoBean> getLista() {
        return listaProduto;
    }
    
    
    
    
    
    
    
}
