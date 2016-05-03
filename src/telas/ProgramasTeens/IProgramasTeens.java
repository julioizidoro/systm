/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProgramasTeens;

import model.Acesso;
import model.Cliente;
import model.Fornecedor;
import model.Valoresprogramasteens;

/**
 *
 * @author Wolverine
 */
public interface IProgramasTeens {
    
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setForneceodr(Fornecedor fornecedor);
    void setValores(Valoresprogramasteens valores);
    
}
