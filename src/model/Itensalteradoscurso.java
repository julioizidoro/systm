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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "itensalteradoscurso")
public class Itensalteradoscurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditensalteradoscurso")
    private Integer iditensalteradoscurso;
    @Size(max = 50)
    @Column(name = "campo")
    private String campo;
    @Size(max = 100)
    @Column(name = "anterior")
    private String anterior;
    @Size(max = 100)
    @Column(name = "atual")
    private String atual;
    @JoinColumn(name = "historicocursos_idhistoricocursos", referencedColumnName = "idhistoricocursos")
    @ManyToOne(optional = false)
    private Historicocursos historicocursos;

    public Itensalteradoscurso() {
    }

    public Itensalteradoscurso(Integer iditensalteradoscurso) {
        this.iditensalteradoscurso = iditensalteradoscurso;
    }

    public Integer getIditensalteradoscurso() {
        return iditensalteradoscurso;
    }

    public void setIditensalteradoscurso(Integer iditensalteradoscurso) {
        this.iditensalteradoscurso = iditensalteradoscurso;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getAnterior() {
        return anterior;
    }

    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }

    public String getAtual() {
        return atual;
    }

    public void setAtual(String atual) {
        this.atual = atual;
    }

    public Historicocursos getHistoricocursos() {
        return historicocursos;
    }

    public void setHistoricocursos(Historicocursos historicocursos) {
        this.historicocursos = historicocursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditensalteradoscurso != null ? iditensalteradoscurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itensalteradoscurso)) {
            return false;
        }
        Itensalteradoscurso other = (Itensalteradoscurso) object;
        if ((this.iditensalteradoscurso == null && other.iditensalteradoscurso != null) || (this.iditensalteradoscurso != null && !this.iditensalteradoscurso.equals(other.iditensalteradoscurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Itensalteradoscurso[ iditensalteradoscurso=" + iditensalteradoscurso + " ]";
    }
    
}
