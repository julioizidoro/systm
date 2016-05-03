/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoCurso;

import model.Acesso;
import model.Cliente;
import model.Fornecedorcidade;

/**
 *
 * @author Wolverine
 */
public interface IOrcamentoCurso {
    
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setFornecedorCidade(Fornecedorcidade fornecedorCidade);
    void setModeloOrcamento(int idModelo);
    
}
