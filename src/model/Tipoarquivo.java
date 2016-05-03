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
@Table(name = "tipoarquivo")
public class Tipoarquivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoArquivo")
    private Integer idtipoArquivo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "unidade")
    private String unidade;

    public Tipoarquivo() {
    }

    public Tipoarquivo(Integer idtipoArquivo) {
        this.idtipoArquivo = idtipoArquivo;
    }

    public Integer getIdtipoArquivo() {
        return idtipoArquivo;
    }

    public void setIdtipoArquivo(Integer idtipoArquivo) {
        this.idtipoArquivo = idtipoArquivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoArquivo != null ? idtipoArquivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoarquivo)) {
            return false;
        }
        Tipoarquivo other = (Tipoarquivo) object;
        if ((this.idtipoArquivo == null && other.idtipoArquivo != null) || (this.idtipoArquivo != null && !this.idtipoArquivo.equals(other.idtipoArquivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
}
