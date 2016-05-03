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
@Table(name = "viewcontrolehighschool")
public class Viewcontrolehighschool implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontroleHighSchool")
    @Id
    private int idcontroleHighSchool;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Size(max = 100)
    @Column(name = "cidadeDestino")
    private String cidadeDestino;
    @Column(name = "dataEnvioApp")
    @Temporal(TemporalType.DATE)
    private Date dataEnvioApp;
    @Size(max = 50)
    @Column(name = "bonus")
    private String bonus;
    @Column(name = "dataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Column(name = "dataAplicouVisto")
    @Temporal(TemporalType.DATE)
    private Date dataAplicouVisto;
    @Lob
    @Size(max = 16777215)
    @Column(name = "observacoes")
    private String observacoes;
    @Size(max = 3)
    @Column(name = "visto")
    private String visto;
    @Size(max = 3)
    @Column(name = "contrato")
    private String contrato;
    @Size(max = 3)
    @Column(name = "documentacao")
    private String documentacao;
    @Size(max = 3)
    @Column(name = "familia")
    private String familia;
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
    @Size(max = 1)
    @Column(name = "docanexado")
    private String docanexado;
    @Size(max = 50)
    @Column(name = "dataInicio")
    private String dataInicio;
    @Size(max = 100)
    @Column(name = "paisIntercambio")
    private String paisIntercambio;
    @Size(max = 100)
    @Column(name = "nomeContatoEmergencia")
    private String nomeContatoEmergencia;
    @Size(max = 14)
    @Column(name = "foneContatoEmergencia")
    private String foneContatoEmergencia;
    @Size(max = 100)
    @Column(name = "emailConatoEmergencia")
    private String emailConatoEmergencia;
    @Size(max = 100)
    @Column(name = "duracaoIntercambio")
    private String duracaoIntercambio;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVendas")
    private int idVendas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCliente")
    private int idCliente;
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
    @Size(max = 50)
    @Column(name = "cidadeEndereco")
    private String cidadeEndereco;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Size(max = 9)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 45)
    @Column(name = "rg")
    private String rg;
    @Size(max = 100)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUnidadeNegocio")
    private int idUnidadeNegocio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Size(max = 100)
    @Column(name = "nomeConsultor")
    private String nomeConsultor;
    @Size(max = 100)
    @Column(name = "nomeFornecedor")
    private String nomeFornecedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfornecedorcidade")
    private int idfornecedorcidade;

    public Viewcontrolehighschool() {
    }

    public int getIdcontroleHighSchool() {
        return idcontroleHighSchool;
    }

    public void setIdcontroleHighSchool(int idcontroleHighSchool) {
        this.idcontroleHighSchool = idcontroleHighSchool;
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

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getPaisIntercambio() {
        return paisIntercambio;
    }

    public void setPaisIntercambio(String paisIntercambio) {
        this.paisIntercambio = paisIntercambio;
    }

    public String getNomeContatoEmergencia() {
        return nomeContatoEmergencia;
    }

    public void setNomeContatoEmergencia(String nomeContatoEmergencia) {
        this.nomeContatoEmergencia = nomeContatoEmergencia;
    }

    public String getFoneContatoEmergencia() {
        return foneContatoEmergencia;
    }

    public void setFoneContatoEmergencia(String foneContatoEmergencia) {
        this.foneContatoEmergencia = foneContatoEmergencia;
    }

    public String getEmailConatoEmergencia() {
        return emailConatoEmergencia;
    }

    public void setEmailConatoEmergencia(String emailConatoEmergencia) {
        this.emailConatoEmergencia = emailConatoEmergencia;
    }

    public String getDuracaoIntercambio() {
        return duracaoIntercambio;
    }

    public void setDuracaoIntercambio(String duracaoIntercambio) {
        this.duracaoIntercambio = duracaoIntercambio;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getIdUnidadeNegocio() {
        return idUnidadeNegocio;
    }

    public void setIdUnidadeNegocio(int idUnidadeNegocio) {
        this.idUnidadeNegocio = idUnidadeNegocio;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeConsultor() {
        return nomeConsultor;
    }

    public void setNomeConsultor(String nomeConsultor) {
        this.nomeConsultor = nomeConsultor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getIdfornecedorcidade() {
        return idfornecedorcidade;
    }

    public void setIdfornecedorcidade(int idfornecedorcidade) {
        this.idfornecedorcidade = idfornecedorcidade;
    }
    
}
