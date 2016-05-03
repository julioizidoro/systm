/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Ladies.Controle;

import telas.HighSchool.*;
import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleLadies {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleLadies(Cliente cliente, Unidadenegocio unidadeNegocio, String paisDestino, String situacao, int idConsultor);
    void cancelarFiltroHighSchool();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
