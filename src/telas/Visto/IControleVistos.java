/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Visto;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleVistos {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleVistos(Cliente cliente, Unidadenegocio unidadeNegocio, String paisDestino, Date dataInicio, Date dataFinal, String situacao);
    void cancelarFiltroVistos();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
}
