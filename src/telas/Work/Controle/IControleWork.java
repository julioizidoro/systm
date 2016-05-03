/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Work.Controle;

import java.util.Date;
import model.Cliente;
import model.Fornecedor;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleWork {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleWork(Cliente cliente, Unidadenegocio unidadeNegocio, Date dataInicioPrevista, Date dataTerminoPrevista, String programa, String situacao, int idConsultor);
    void cancelarFiltroCurso();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
