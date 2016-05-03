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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "controleladies")
public class Controleladies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontroleLadies")
    private Integer idcontroleLadies;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Column(name = "cidadeDestino")
    private String cidadeDestino;
    @Column(name = "dataEnvioApp")
    @Temporal(TemporalType.DATE)
    private Date dataEnvioApp;
    @Column(name = "docanexado")
    private String docanexado;
    @Column(name = "bonus")
    private String bonus;
    @Column(name = "dataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Column(name = "dataAplicouVisto")
    @Temporal(TemporalType.DATE)
    private Date dataAplicouVisto;
    @Lob
    @Column(name = "observacoes")
    private String observacoes;
    @Column(name = "visto")
    private String visto;
    @Column(name = "contrato")
    private String contrato;
    @Column(name = "documentacao")
    private String documentacao;
    @Column(name = "familia")
    private String familia;
    @Column(name = "finalizado")
    private String finalizado;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Controleladies() {
    }

    public Controleladies(Integer idcontroleLadies) {
        this.idcontroleLadies = idcontroleLadies;
    }

    public Integer getIdcontroleLadies() {
        return idcontroleLadies;
    }

    public void setIdcontroleLadies(Integer idcontroleLadies) {
        this.idcontroleLadies = idcontroleLadies;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public Date getDataEnvioApp() {
        return dataEnvioApp;
    }

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    public void setDataEnvioApp(Date dataEnvioApp) {
        this.dataEnvioApp = dataEnvioApp;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public Date getDataAplicouVisto() {
        return dataAplicouVisto;
    }

    public void setDataAplicouVisto(Date dataAplicouVisto) {
        this.dataAplicouVisto = dataAplicouVisto;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
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
        hash += (idcontroleLadies != null ? idcontroleLadies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controleladies)) {
            return false;
        }
        Controleladies other = (Controleladies) object;
        if ((this.idcontroleLadies == null && other.idcontroleLadies != null) || (this.idcontroleLadies != null && !this.idcontroleLadies.equals(other.idcontroleLadies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Controleladies[ idcontroleLadies=" + idcontroleLadies + " ]";
    }
    
}
