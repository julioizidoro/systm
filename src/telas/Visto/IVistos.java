/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Visto;

import model.Cliente;
import model.Valoresvistos;

/**
 *
 * @author Wolverine
 */
public interface IVistos {
    
    void setCliente(Cliente cliente);
    void setValorJuros(Float valorJuros);
    void setValores(Valoresvistos valoresVistos);
}
