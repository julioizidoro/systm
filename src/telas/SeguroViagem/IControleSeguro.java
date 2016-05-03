/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.SeguroViagem;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleSeguro {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleSeguro(Cliente cliente, Unidadenegocio unidadeNegocio, Date dataInicio, Date dataFinal, String situacao);
    void cancelarFiltroSeguro();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
}
