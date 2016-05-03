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
@Table(name = "viewcontroleladies")
public class Viewcontroleladies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontroleLadies")
    @Id
    private int idcontroleLadies;
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
    @Size(max = 50)
    @Column(name = "finalizado")
    private String finalizado;
    @Size(max = 20)
    @Column(name = "situacao")
    private String situacao;
    @Size(max = 1)
    @Column(name = "docanexado")
    private String docanexado;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Size(max = 50)
    @Column(name = "controle")
    private String controle;
    @Size(max = 50)
    @Column(name = "pais")
    private String pais;
    @Size(max = 100)
    @Column(name = "nomeFornecedor")
    private String nomeFornecedor;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfornecedorcidade")
    private int idfornecedorcidade;

    public Viewcontroleladies() {
    }

    public int getIdcontroleLadies() {
        return idcontroleLadies;
    }

    public void setIdcontroleLadies(int idcontroleLadies) {
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

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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

    public int getIdfornecedorcidade() {
        return idfornecedorcidade;
    }

    public void setIdfornecedorcidade(int idfornecedorcidade) {
        this.idfornecedorcidade = idfornecedorcidade;
    }
    
}
