/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Aupair;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface IConsultaAupair {
    
    void setModel();
    void setImpressao(boolean ficha, boolean contrato, boolean recibo, boolean visto);
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao);
    void setNumeroColuna(int numero);
    
}
