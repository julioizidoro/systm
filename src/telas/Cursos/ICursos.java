/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos;

import model.Acesso;
import model.Cliente;
import model.Fornecedor;
import model.Fornecedorcidade;
import model.Orcamentocurso;
import model.Valoresseguro;

/**
 *
 * @author Wolverine
 */
public interface ICursos {
    
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setFornecedor(Fornecedorcidade fornecedorcidade);
    void setValores(Valoresseguro valores);
    void setValorJuros(Float valorJuros);
    void setOrcamentoCurso(Orcamentocurso orcamentoCurso);
}
