/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Usuarios;

import model.Acesso;
import model.Grupoacesso;
import model.Parametrosprodutos;
import model.Unidadenegocio;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public class UsuarioLogadoBean {
    
    private Usuario usuario;
    private Acesso acesso;
    private Grupoacesso grupoAcesso;
    private Unidadenegocio unidadeNegocio;
    private Parametrosprodutos parametrosprodutos;

    public UsuarioLogadoBean() {
        this.usuario = new Usuario();
        this.acesso = new Acesso();
        this.grupoAcesso = new Grupoacesso();
        this.unidadeNegocio = new Unidadenegocio();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

    public Unidadenegocio getUnidadeNegocio() {
        return unidadeNegocio;
    }

    public void setUnidadeNegocio(Unidadenegocio unidadeNegocio) {
        this.unidadeNegocio = unidadeNegocio;
    }

    public Grupoacesso getGrupoAcesso() {
        return grupoAcesso;
    }

    public void setGrupoAcesso(Grupoacesso grupoAcesso) {
        this.grupoAcesso = grupoAcesso;
    }

    public Parametrosprodutos getParametrosprodutos() {
        return parametrosprodutos;
    }

    public void setParametrosprodutos(Parametrosprodutos parametrosprodutos) {
        this.parametrosprodutos = parametrosprodutos;
    }
    
    
    
}
