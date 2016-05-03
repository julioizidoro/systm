/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Aupair.Controle;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleAupair {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleAupair(Cliente cliente, Unidadenegocio unidadeNegocio, Date dataInicioPrevista, Date dataTerminoPrevista, String situacao, int idConsultor);
    void cancelarFiltroCurso();
    void exportarExcel(String caminho, String nomeArquivo);
    public void setNumeroColuna(int numero);
    public void setModel();
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
