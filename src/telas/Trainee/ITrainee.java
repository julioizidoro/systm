/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Trainee;

import model.Acesso;
import model.Cliente;
import model.Fornecedorcidade;
import model.Valorestrainee;

/**
 *
 * @author Wolverine
 */
public interface ITrainee {
    void setCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setValorJuros(Float valorJuros);
    void setFornecedorCidade(Fornecedorcidade fornecedorCidade);
    void setValores(Valorestrainee valorTrainee);
    
}
