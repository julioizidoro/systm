/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Ladies;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface IConsultaLadies {
    void setModel();
    void setImpressao(boolean ficha, boolean contrato, boolean recibo, boolean visto);
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao);
}
