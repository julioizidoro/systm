/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.HighSchool.Controle;

import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleHighSchool {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleHighSchool(Cliente cliente, Unidadenegocio unidadeNegocio, String paisDestino, String situacao, String inicio, int idConsultor);
    void cancelarFiltroHighSchool();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
