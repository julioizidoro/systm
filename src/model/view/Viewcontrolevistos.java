/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.view;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewcontrolevistos")
public class Viewcontrolevistos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontroleVistos")
    @Id
    private int idcontroleVistos;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "dataInicioPrograma")
    @Temporal(TemporalType.DATE)
    private Date dataInicioPrograma;
    @Size(max = 100)
    @Column(name = "paisVisto")
    private String paisVisto;
    @Size(max = 100)
    @Column(name = "categoria")
    private String categoria;
    @Size(max = 3)
    @Column(name = "emailOrientacao")
    private String emailOrientacao;
    @Size(max = 3)
    @Column(name = "confirmacaoMatricula")
    private String confirmacaoMatricula;
    @Size(max = 3)
    @Column(name = "rascunhoFormularios")
    private String rascunhoFormularios;
    @Size(max = 3)
    @Column(name = "preenchimentoFormularios")
    private String preenchimentoFormularios;
    @Size(max = 3)
    @Column(name = "conferenciaDocumentos")
    private String conferenciaDocumentos;
    @Size(max = 3)
    @Column(name = "envioProcessamento")
    private String envioProcessamento;
    @Size(max = 3)
    @Column(name = "protocolo")
    private String protocolo;
    @Size(max = 3)
    @Column(name = "vistoLiberado")
    private String vistoLiberado;
    @Lob
    @Size(max = 16777215)
    @Column(name = "observacao")
    private String observacao;
    @Size(max = 50)
    @Column(name = "finalizado")
    private String finalizado;
    @Size(max = 20)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvendas")
    private int idvendas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCliente")
    private int idCliente;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Size(max = 100)
    @Column(name = "nomeCliente")
    private String nomeCliente;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 14)
    @Column(name = "foneCelular")
    private String foneCelular;
    @Size(max = 100)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Size(max = 100)
    @Column(name = "nomeConsultor")
    private String nomeConsultor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUnidadeNegocio")
    private int idUnidadeNegocio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvistos")
    private int idvistos;

    public Viewcontrolevistos() {
    }

    public int getIdcontroleVistos() {
        return idcontroleVistos;
    }

    public void setIdcontroleVistos(int idcontroleVistos) {
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

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeConsultor() {
        return nomeConsultor;
    }

    public void setNomeConsultor(String nomeConsultor) {
        this.nomeConsultor = nomeConsultor;
    }

    public int getIdUnidadeNegocio() {
        return idUnidadeNegocio;
    }

    public void setIdUnidadeNegocio(int idUnidadeNegocio) {
        this.idUnidadeNegocio = idUnidadeNegocio;
    }

    public int getIdvistos() {
        return idvistos;
    }

    public void setIdvistos(int idvistos) {
        this.idvistos = idvistos;
    }
    
}
