/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import model.Vendas;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "controlevoluntariado")
public class Controlevoluntariado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrolevoluntariado")
    private Integer idcontrolevoluntariado;
    @Size(max = 3)
    @Column(name = "processoenviado")
    private String processoenviado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valornet")
    private Float valornet;
    @Column(name = "valorgross")
    private Float valorgross;
    @Size(max = 50)
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "dataembarque")
    @Temporal(TemporalType.DATE)
    private Date dataembarque;
    @Column(name = "docanexado")
    private String docanexado;
    @JoinColumn(name = "vendas_idvendas", referencedColumnName = "idvendas")
    @ManyToOne(optional = false)
    private Vendas vendas;

    public Controlevoluntariado() {
    }

    public Controlevoluntariado(Integer idcontrolevoluntariado) {
        this.idcontrolevoluntariado = idcontrolevoluntariado;
    }

    public Integer getIdcontrolevoluntariado() {
        return idcontrolevoluntariado;
    }

    public void setIdcontrolevoluntariado(Integer idcontrolevoluntariado) {
        this.idcontrolevoluntariado = idcontrolevoluntariado;
    }

    public String getProcessoenviado() {
        return processoenviado;
    }

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    public void setProcessoenviado(String processoenviado) {
        this.processoenviado = processoenviado;
    }

    public Float getValornet() {
        return valornet;
    }

    public void setValornet(Float valornet) {
        this.valornet = valornet;
    }

    public Float getValorgross() {
        return valorgross;
    }

    public void setValorgross(Float valorgross) {
        this.valorgross = valorgross;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Date getDataembarque() {
        return dataembarque;
    }

    public void setDataembarque(Date dataembarque) {
        this.dataembarque = dataembarque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrolevoluntariado != null ? idcontrolevoluntariado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controlevoluntariado)) {
            return false;
        }
        Controlevoluntariado other = (Controlevoluntariado) object;
        if ((this.idcontrolevoluntariado == null && other.idcontrolevoluntariado != null) || (this.idcontrolevoluntariado != null && !this.idcontrolevoluntariado.equals(other.idcontrolevoluntariado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.view.Controlevoluntariado[ idcontrolevoluntariado=" + idcontrolevoluntariado + " ]";
    }
    
}
