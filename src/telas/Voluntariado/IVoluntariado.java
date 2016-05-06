/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Voluntariado;

import model.Acesso;
import model.Cliente;
import model.Fornecedorcidade;


/**
 *
 * @author Wolverine
 */
public interface IVoluntariado {
    void setCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setValorJuros(Float valorJuros);
    void setFornecedor(Fornecedorcidade fornecedorcidade);
}
