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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "modeloorcamentocurso")
public class Modeloorcamentocurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorcamentoCurso")
    private Integer idorcamentoCurso;
     @Column(name = "nome")
    private String nome;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Column(name = "valor")
    private Float valor;
    @Column(name = "curso")
    private String curso;
    @Column(name = "tipoDuracao")
    private String tipoDuracao;
    @Column(name = "aulasSemana")
    private Integer aulasSemana;
    @Column(name = "tipoAcomodacao")
    private String tipoAcomodacao;
    @Column(name = "duracaoAcomodacao")
    private Integer duracaoAcomodacao;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "refeicoes")
    private String refeicoes;
    @Column(name = "tipoQuarto")
    private String tipoQuarto;
    @Column(name = "materialDidatico")
    private String materialDidatico;
    @Column(name = "seguroSaude")
    private String seguroSaude;
    @Column(name = "transfer")
    private String transfer;
    @Column(name = "passagemAerea")
    private String passagemAerea;
    @Column(name = "sedexInternacional")
    private String sedexInternacional;
    @Column(name = "vistoConsular")
    private String vistoConsular;
    @Column(name = "duracao")
    private int duracao;
    @Column(name = "outrasTaxas")
    private String outrasTaxas;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;
    @Column(name = "cambio_idcambio")
    private int cambio;
     @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadenegocio;
    @Column(name = "dataValidade")
    @Temporal(TemporalType.DATE)
    private Date dataValidade;
    @JoinColumn(name = "fornecedorcidade_idfornecedorcidade", referencedColumnName = "idfornecedorcidade")
    @ManyToOne(optional = false)
    private Fornecedorcidade fornecedorcidade;

    public Modeloorcamentocurso() {
    }

    public Modeloorcamentocurso(Integer idorcamentoCurso) {
        this.idorcamentoCurso = idorcamentoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCambio() {
        return cambio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Fornecedorcidade getFornecedorcidade() {
        return fornecedorcidade;
    }

    public void setFornecedorcidade(Fornecedorcidade fornecedorcidade) {
        this.fornecedorcidade = fornecedorcidade;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getUnidadenegocio() {
        return unidadenegocio;
    }

    public void setUnidadenegocio(int unidadenegocio) {
        this.unidadenegocio = unidadenegocio;
    }

    public Integer getIdorcamentoCurso() {
        return idorcamentoCurso;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setIdorcamentoCurso(Integer idorcamentoCurso) {
        this.idorcamentoCurso = idorcamentoCurso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Float valorCambio) {
        this.valorCambio = valorCambio;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(String tipoDuracao) {
        this.tipoDuracao = tipoDuracao;
    }

    public Integer getAulasSemana() {
        return aulasSemana;
    }

    public void setAulasSemana(Integer aulasSemana) {
        this.aulasSemana = aulasSemana;
    }

    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    public void setTipoAcomodacao(String tipoAcomodacao) {
        this.tipoAcomodacao = tipoAcomodacao;
    }

    public Integer getDuracaoAcomodacao() {
        return duracaoAcomodacao;
    }

    public void setDuracaoAcomodacao(Integer duracaoAcomodacao) {
        this.duracaoAcomodacao = duracaoAcomodacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes(String refeicoes) {
        this.refeicoes = refeicoes;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getMaterialDidatico() {
        return materialDidatico;
    }

    public void setMaterialDidatico(String materialDidatico) {
        this.materialDidatico = materialDidatico;
    }

    public String getSeguroSaude() {
        return seguroSaude;
    }

    public void setSeguroSaude(String seguroSaude) {
        this.seguroSaude = seguroSaude;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getPassagemAerea() {
        return passagemAerea;
    }

    public void setPassagemAerea(String passagemAerea) {
        this.passagemAerea = passagemAerea;
    }

    public String getSedexInternacional() {
        return sedexInternacional;
    }

    public void setSedexInternacional(String sedexInternacional) {
        this.sedexInternacional = sedexInternacional;
    }

    public String getVistoConsular() {
        return vistoConsular;
    }

    public void setVistoConsular(String vistoConsular) {
        this.vistoConsular = vistoConsular;
    }

    public String getOutrasTaxas() {
        return outrasTaxas;
    }

    public void setOutrasTaxas(String outrasTaxas) {
        this.outrasTaxas = outrasTaxas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorcamentoCurso != null ? idorcamentoCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modeloorcamentocurso)) {
            return false;
        }
        Modeloorcamentocurso other = (Modeloorcamentocurso) object;
        if ((this.idorcamentoCurso == null && other.idorcamentoCurso != null) || (this.idorcamentoCurso != null && !this.idorcamentoCurso.equals(other.idorcamentoCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Modeloorcamentocurso[ idorcamentoCurso=" + idorcamentoCurso + " ]";
    }
    
}
