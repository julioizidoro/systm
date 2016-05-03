/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "tipoarquivousuario")
public class Tipoarquivousuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoArquivoUsuario")
    private Integer idtipoArquivoUsuario;
    @Column(name = "tipoArquivo_idtipoArquivo")
    private Integer tipoArquivo;
    @Column(name = "usuario_idusuario")
    private Integer usuario;
    
    
            

    public Tipoarquivousuario() {
    }

    public Tipoarquivousuario(Integer idtipoArquivoUsuario) {
        this.idtipoArquivoUsuario = idtipoArquivoUsuario;
    }

    public Integer getIdtipoArquivoUsuario() {
        return idtipoArquivoUsuario;
    }

    public Integer getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(Integer tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public void setIdtipoArquivoUsuario(Integer idtipoArquivoUsuario) {
        this.idtipoArquivoUsuario = idtipoArquivoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoArquivoUsuario != null ? idtipoArquivoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoarquivousuario)) {
            return false;
        }
        Tipoarquivousuario other = (Tipoarquivousuario) object;
        if ((this.idtipoArquivoUsuario == null && other.idtipoArquivoUsuario != null) || (this.idtipoArquivoUsuario != null && !this.idtipoArquivoUsuario.equals(other.idtipoArquivoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tipoarquivousuario[ idtipoArquivoUsuario=" + idtipoArquivoUsuario + " ]";
    }
    
}
