/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.HighSchool;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;
import telas.Cursos.*;

/**
 *
 * @author Wolverine
 */
public interface IConsultaHighSchool {
    
    void setModel();
    void setImpressao(boolean ficha, boolean contrato, boolean recibo, boolean visto);
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao);
}
