/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Work;

import model.Acesso;
import model.Cliente;
import model.Valoreswork;

/**
 *
 * @author Wolverine
 */
public interface IWorkTravel {
    void getCliente(Cliente cliente);
    void setCambio(Float valorCambio);
    void alterarValorCambio(String valor);
    void liberarAltercaoCambio(Acesso acesso);
    void setValorJuros(Float valorJuros);
    void setValores(Valoreswork valoresWork);
}
