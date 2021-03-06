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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "pincambio")
public class Pincambio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpinCambio")
    private Integer idpinCambio;
    @Column(name = "consultor")
    private int consultor;
    @Column(name = "dataEmissao")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Size(max = 20)
    @Column(name = "numero")
    private String numero;
    @Size(max = 1)
    @Column(name = "utilizado")
    private String utilizado;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Pincambio() {
    }

    public Pincambio(Integer idpinCambio) {
        this.idpinCambio = idpinCambio;
    }

    public Integer getIdpinCambio() {
        return idpinCambio;
    }

    public void setIdpinCambio(Integer idpinCambio) {
        this.idpinCambio = idpinCambio;
    }

    

    public int getConsultor() {
        return consultor;
    }

    public void setConsultor(int consultor) {
        this.consultor = consultor;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getUtilizado() {
        return utilizado;
    }

    public void setUtilizado(String utilizado) {
        this.utilizado = utilizado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpinCambio != null ? idpinCambio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pincambio)) {
            return false;
        }
        Pincambio other = (Pincambio) object;
        if ((this.idpinCambio == null && other.idpinCambio != null) || (this.idpinCambio != null && !this.idpinCambio.equals(other.idpinCambio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNumero();
    }
    
}
