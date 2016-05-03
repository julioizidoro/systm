/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProdutosOrcamento;

import model.Produtos;

/**
 *
 * @author Wolverine
 */
public interface IProdutoOrcamento {
    void setModel();
    void setProdutoOrcamento(Produtos produto);
    void produtoExcluir(Produtos produto);
}
