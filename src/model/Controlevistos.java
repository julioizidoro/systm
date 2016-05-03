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
@Table(name = "controlevistos")
public class Controlevistos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontroleVistos")
    private Integer idcontroleVistos;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "dataInicioPrograma")
    @Temporal(TemporalType.DATE)
    private Date dataInicioPrograma;
    @Column(name = "paisVisto")
    private String paisVisto;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "emailOrientacao")
    private String emailOrientacao;
    @Column(name = "confirmacaoMatricula")
    private String confirmacaoMatricula;
    @Column(name = "rascunhoFormularios")
    private String rascunhoFormularios;
    @Column(name = "preenchimentoFormularios")
    private String preenchimentoFormularios;
    @Column(name = "conferenciaDocumentos")
    private String conferenciaDocumentos;
    @Column(name = "envioProcessamento")
    private String envioProcessamento;
    @Column(name = "protocolo")
    private String protocolo;
    @Column(name = "vistoLiberado")
    private String vistoLiberado;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "finalizado")
    private String finalizado;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Controlevistos() {
    }

    public Controlevistos(Integer idcontroleVistos) {
        this.idcontroleVistos = idcontroleVistos;
    }

    public Integer getIdcontroleVistos() {
        return idcontroleVistos;
    }

    public void setIdcontroleVistos(Integer idcontroleVistos) {
        this.idcontroleVistos = idcontroleVistos;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataInicioPrograma() {
        return dataInicioPrograma;
    }

    public void setDataInicioPrograma(Date dataInicioPrograma) {
        this.dataInicioPrograma = dataInicioPrograma;
    }

    public String getPaisVisto() {
        return paisVisto;
    }

    public void setPaisVisto(String paisVisto) {
        this.paisVisto = paisVisto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmailOrientacao() {
        return emailOrientacao;
    }

    public void setEmailOrientacao(String emailOrientacao) {
        this.emailOrientacao = emailOrientacao;
    }

    public String getConfirmacaoMatricula() {
        return confirmacaoMatricula;
    }

    public void setConfirmacaoMatricula(String confirmacaoMatricula) {
        this.confirmacaoMatricula = confirmacaoMatricula;
    }

    public String getRascunhoFormularios() {
        return rascunhoFormularios;
    }

    public void setRascunhoFormularios(String rascunhoFormularios) {
        this.rascunhoFormularios = rascunhoFormularios;
    }

    public String getPreenchimentoFormularios() {
        return preenchimentoFormularios;
    }

    public void setPreenchimentoFormularios(String preenchimentoFormularios) {
        this.preenchimentoFormularios = preenchimentoFormularios;
    }

    public String getConferenciaDocumentos() {
        return conferenciaDocumentos;
    }

    public void setConferenciaDocumentos(String conferenciaDocumentos) {
        this.conferenciaDocumentos = conferenciaDocumentos;
    }

    public String getEnvioProcessamento() {
        return envioProcessamento;
    }

    public void setEnvioProcessamento(String envioProcessamento) {
        this.envioProcessamento = envioProcessamento;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getVistoLiberado() {
        return vistoLiberado;
    }

    public void setVistoLiberado(String vistoLiberado) {
        this.vistoLiberado = vistoLiberado;
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
        hash += (idcontroleVistos != null ? idcontroleVistos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controlevistos)) {
            return false;
        }
        Controlevistos other = (Controlevistos) object;
        if ((this.idcontroleVistos == null && other.idcontroleVistos != null) || (this.idcontroleVistos != null && !this.idcontroleVistos.equals(other.idcontroleVistos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Controlevistos[ idcontroleVistos=" + idcontroleVistos + " ]";
    }
    
}
