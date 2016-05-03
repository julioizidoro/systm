/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Trainee.Controle;

import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleTrainee {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControle(Cliente cliente, Unidadenegocio unidadeNegocio, int pais, String situacao, int idConsultor);
    void cancelarFiltro();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
