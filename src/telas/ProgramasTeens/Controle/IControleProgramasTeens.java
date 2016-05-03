/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProgramasTeens.Controle;

import telas.HighSchool.*;
import model.Cliente;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleProgramasTeens {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControleProgramasTeens(Cliente cliente, Unidadenegocio unidadeNegocio, String paisDestino, String situacao);
    void cancelarFiltroHighSchool();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
