/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoCurso;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;
import telas.Cursos.*;

/**
 *
 * @author Wolverine
 */
public interface IConsultaOrcamento {
    
    void setModel();
    void setImpressao(boolean ficha, boolean contrato, boolean recibo);
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal);
}
