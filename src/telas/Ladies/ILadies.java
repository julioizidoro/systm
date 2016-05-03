/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Ladies;

import model.Acesso;
import model.Cliente;
import model.Fornecedorcidade;
import model.Valoresseguro;

/**
 *
 * @author Wolverine
 */
public interface ILadies {
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setFornecedor(Fornecedorcidade fornecedorCidade);
    void setValoresSeguro(Valoresseguro valores);
    void setValorJuros(Float valorJuros);
}
