/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Voluntariado.Controle;

import telas.Work.*;
import java.util.Date;
import model.Cliente;
import model.Fornecedor;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleVoluntariado {
    void setCliente(Cliente cliente);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    public void setFiltrarControle(Cliente cliente, Unidadenegocio unidadeNegocio, int pais, String projeto, String situacao, int idConsultor);
    void cancelarFiltroCurso();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
