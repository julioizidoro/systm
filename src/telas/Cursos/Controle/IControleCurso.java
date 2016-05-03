/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos.Controle;

import java.util.Date;
import model.Cliente;
import model.Fornecedor;
import model.Fornecedorcidade;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface IControleCurso {
    void setCliente(Cliente cliente);
    void setEscola(Fornecedorcidade fornecedorcidade);
    void setFiltrarControleCurso(Cliente cliente, Fornecedorcidade fornecedorcidade, String pais, Date dataEmbarqueInicial, Date dataEmbarqueFinal,
            Date dataPosicaoInicial, Date dataPosicaoFinal, String situacao, int idConsultor, Unidadenegocio unidadeNegocio);
    void cancelarFiltroCurso();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    void setDocAnexado(String tipoArquivo, int idVenda, int idControle);
}
