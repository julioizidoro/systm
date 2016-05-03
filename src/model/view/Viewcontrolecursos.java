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
@Table(name = "viewcontrolecursos")
public class Viewcontrolecursos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontroleCursos")
    @Id
    private int idcontroleCursos;
    @Column(name = "work")
    private Integer work;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Column(name = "dataEnvioInscricaoEscola")
    @Temporal(TemporalType.DATE)
    private Date dataEnvioInscricaoEscola;
    @Column(name = "pagamentoAcomodacao")
    @Temporal(TemporalType.DATE)
    private Date pagamentoAcomodacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorAcomodacao")
    private Float valorAcomodacao;
    @Size(max = 3)
    @Column(name = "visto")
    private String visto;
    @Size(max = 3)
    @Column(name = "kitViagem")
    private String kitViagem;
    @Size(max = 3)
    @Column(name = "orientacaoPreEmbarque")
    private String orientacaoPreEmbarque;
    @Lob
    @Size(max = 16777215)
    @Column(name = "LoasObs")
    private String loasObs;
    @Size(max = 30)
    @Column(name = "situacao")
    private String situacao;
    @Size(max = 1)
    @Column(name = "docanexado")
    private String docanexado;
    @Size(max = 100)
    @Column(name = "nomeCurso")
    private String nomeCurso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcursos")
    private int idcursos;
    @Size(max = 50)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 50)
    @Column(name = "pais")
    private String pais;
    @Column(name = "numeroSenamas")
    private Integer numeroSenamas;
    @Column(name = "dataInscricao")
    @Temporal(TemporalType.DATE)
    private Date dataInscricao;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataTermino")
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    @Size(max = 50)
    @Column(name = "tipoAcomodacao")
    private String tipoAcomodacao;
    @Size(max = 45)
    @Column(name = "numeroCartaoVTM")
    private String numeroCartaoVTM;
    @Size(max = 50)
    @Column(name = "controle")
    private String controle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fornecedor")
    private int fornecedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVendas")
    private int idVendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Size(max = 100)
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcliente")
    private int idcliente;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Size(max = 14)
    @Column(name = "foneCelular")
    private String foneCelular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idunidadeNegocio")
    private int idunidadeNegocio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Size(max = 100)
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    @Size(max = 100)
    @Column(name = "nomefornecedor")
    private String nomefornecedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfornecedorcidade")
    private int idfornecedorcidade;

    public Viewcontrolecursos() {
    }

    public int getIdcontroleCursos() {
        return idcontroleCursos;
    }

    public void setIdcontroleCursos(int idcontroleCursos) {
        this.idcontroleCursos = idcontroleCursos;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public Date getDataEnvioInscricaoEscola() {
        return dataEnvioInscricaoEscola;
    }

    public void setDataEnvioInscricaoEscola(Date dataEnvioInscricaoEscola) {
        this.dataEnvioInscricaoEscola = dataEnvioInscricaoEscola;
    }

    public Date getPagamentoAcomodacao() {
        return pagamentoAcomodacao;
    }

    public void setPagamentoAcomodacao(Date pagamentoAcomodacao) {
        this.pagamentoAcomodacao = pagamentoAcomodacao;
    }

    public Float getValorAcomodacao() {
        return valorAcomodacao;
    }

    public void setValorAcomodacao(Float valorAcomodacao) {
        this.valorAcomodacao = valorAcomodacao;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }

    public String getKitViagem() {
        return kitViagem;
    }

    public void setKitViagem(String kitViagem) {
        this.kitViagem = kitViagem;
    }

    public String getOrientacaoPreEmbarque() {
        return orientacaoPreEmbarque;
    }

    public void setOrientacaoPreEmbarque(String orientacaoPreEmbarque) {
        this.orientacaoPreEmbarque = orientacaoPreEmbarque;
    }

    public String getLoasObs() {
        return loasObs;
    }

    public void setLoasObs(String loasObs) {
        this.loasObs = loasObs;
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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(int idcursos) {
        this.idcursos = idcursos;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getNumeroSenamas() {
        return numeroSenamas;
    }

    public void setNumeroSenamas(Integer numeroSenamas) {
        this.numeroSenamas = numeroSenamas;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    public void setTipoAcomodacao(String tipoAcomodacao) {
        this.tipoAcomodacao = tipoAcomodacao;
    }

    public String getNumeroCartaoVTM() {
        return numeroCartaoVTM;
    }

    public void setNumeroCartaoVTM(String numeroCartaoVTM) {
        this.numeroCartaoVTM = numeroCartaoVTM;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
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

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getIdunidadeNegocio() {
        return idunidadeNegocio;
    }

    public void setIdunidadeNegocio(int idunidadeNegocio) {
        this.idunidadeNegocio = idunidadeNegocio;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public int getIdfornecedorcidade() {
        return idfornecedorcidade;
    }

    public void setIdfornecedorcidade(int idfornecedorcidade) {
        this.idfornecedorcidade = idfornecedorcidade;
    }
    
}
