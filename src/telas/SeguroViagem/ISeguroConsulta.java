/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.SeguroViagem;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface ISeguroConsulta {
    
    void setModel();
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao);
}
