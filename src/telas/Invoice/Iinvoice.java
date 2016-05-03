/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Invoice;

import java.util.Date;
import model.Cliente;
import model.Fornecedor;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public interface Iinvoice {
    
    void setCliente(Cliente cliente);
    void setUnidade(Unidadenegocio unidade);
    void setEscola(Fornecedor fornecedor);
    void setFiltrarControleCurso(Cliente cliente, Fornecedor fornecedor, Unidadenegocio unidade, Date dataPrevistaInicial, Date dataPrevistaFinal,
            Date dataPagtoInicial, Date dataPagtoFinal);
    void cancelarFiltroCurso();
    void exportarExcel(String caminho, String nomeArquivo);
    void setModel();
    void setNumeroColuna(int numero);
    
}
