/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Trainee;

import java.util.Date;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface IConsultaTrainee {
    
    void setModel();
    void setImpressao(boolean ficha, boolean contrato, boolean recibo, boolean visto);
    void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao);
    
}
