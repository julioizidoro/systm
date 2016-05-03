/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Visto;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface IVistoConsulta {
    
    void setModel();
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao);
    void setImpressao(boolean termoContratacao, boolean termoCiente, boolean recibo, boolean declaracaoIsencao);
}
