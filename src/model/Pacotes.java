/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "pacotes")
public class Pacotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpacotes")
    private Integer idpacotes;
    @Column(name = "cidadeDestino")
    private String cidadeDestino;
    @Column(name = "paisDestino")
    private String paisDestino;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Column(name = "dataVolta")
    @Temporal(TemporalType.DATE)
    private Date dataVolta;
    @Column(name = "vendas_idvendas")
    private int vendas;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;
    @Column(name = "controle")
    private String controle;

    public Pacotes() {
    }

    public Pacotes(Integer idpacotes) {
        this.idpacotes = idpacotes;
    }

    public Integer getIdpacotes() {
        return idpacotes;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public void setIdpacotes(Integer idpacotes) {
        this.idpacotes = idpacotes;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
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
        hash += (idpacotes != null ? idpacotes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacotes)) {
            return false;
        }
        Pacotes other = (Pacotes) object;
        if ((this.idpacotes == null && other.idpacotes != null) || (this.idpacotes != null && !this.idpacotes.equals(other.idpacotes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pacotes[ idpacotes=" + idpacotes + " ]";
    }
    
}
