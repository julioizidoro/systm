/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.HighSchool;

import model.Acesso;
import model.Cliente;
import model.Fornecedorcidade;
import model.Valoreshighschool;

/**
 *
 * @author Wolverine
 */
public interface IHighSchool {
    
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setFornecedorCidade(Fornecedorcidade fornecedorCidade);
    void setValorJuros(Float valorJuros);
    void setValores(Valoreshighschool valoreshighschool);
}
