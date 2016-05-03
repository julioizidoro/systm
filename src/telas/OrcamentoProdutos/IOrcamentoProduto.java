/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoProdutos;

import model.Fornecedor;

/**
 *
 * @author Wolverine
 */
public interface IOrcamentoProduto {
    
    void setFornecedor(Fornecedor fornecedor, String descricao, float valorMoedaEstrangeira);
}
