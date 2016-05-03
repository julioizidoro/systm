/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.SeguroViagem;

import model.Cliente;
import model.Fornecedorcidade;
import model.Valoresseguro;

/**
 *
 * @author Wolverine
 */
public interface ISeguro {
    
    void getCliente(Cliente cliente);
    void setValorJuros(Float valorJuros);
    void setValores(Valoresseguro valores);
}
