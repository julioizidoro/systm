/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.PesquisaProdutos;

import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface IPesquisaProdutos {
    
    void setCliente(Cliente cliente);
    void setUnidade(Unidadenegocio unidade);
    void setConsultor(Usuario usuario);
    
}
