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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "controlepacotes")
public class Controlepacotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrolePacotes")
    private Integer idcontrolePacotes;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "finalizado")
    private String finalizado;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Controlepacotes() {
    }

    public Controlepacotes(Integer idcontrolePacotes) {
        this.idcontrolePacotes = idcontrolePacotes;
    }

    public Integer getIdcontrolePacotes() {
        return idcontrolePacotes;
    }

    public void setIdcontrolePacotes(Integer idcontrolePacotes) {
        this.idcontrolePacotes = idcontrolePacotes;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrolePacotes != null ? idcontrolePacotes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controlepacotes)) {
            return false;
        }
        Controlepacotes other = (Controlepacotes) object;
        if ((this.idcontrolePacotes == null && other.idcontrolePacotes != null) || (this.idcontrolePacotes != null && !this.idcontrolePacotes.equals(other.idcontrolePacotes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Controlepacotes[ idcontrolePacotes=" + idcontrolePacotes + " ]";
    }
    
}
