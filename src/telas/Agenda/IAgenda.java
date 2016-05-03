/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Agenda;

import model.Cliente;

/**
 *
 * @author Wolverine
 */
public interface IAgenda {
    
    void setCliente(Cliente cliente);
    void setEvento();
    void setFiltro(int consultor, int UnidadeNegocio, String hora);
    
}
