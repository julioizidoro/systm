/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Relatorios.Vendas;

import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public interface IMapaVendas {
    
    void setConsultor(Usuario usuario);
    void setUnidadeNegocio(Unidadenegocio unidadeNegocio);
    void exportarExecel(String caminho, String nomeArquivo);
    
}
