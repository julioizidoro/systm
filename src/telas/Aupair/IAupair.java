/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Aupair;

import model.Acesso;
import model.Cliente;
import model.Fornecedorcidade;
import model.Valoresaupair;
import model.Valoresseguro;

/**
 *
 * @author Wolverine
 */
public interface IAupair {
    
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setValorJuros(Float valorJuros);
    void setValores(Valoresaupair valorAupair);
    void setValores(Valoresseguro valores);
}
