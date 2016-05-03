/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.view;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewconsultavaloresaupair")
public class Viewconsultavaloresaupair implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvaloresAupair")
    @Id
    private int idvaloresAupair;
    @Size(max = 100)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 100)
    @Column(name = "inicio")
    private String inicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valornet")
    private Float valornet;
    @Column(name = "valorgross")
    private Float valorgross;
    @Size(max = 10)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fornecedorcidade_idfornecedorcidade")
    private int fornecedorcidadeIdfornecedorcidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moedas_idmoedas")
    private int moedasIdmoedas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "produtosOrcamento_idprodutosOrcamento")
    private int produtosOrcamentoidprodutosOrcamento;
    @Size(max = 10)
    @Column(name = "sigla")
    private String sigla;

    public Viewconsultavaloresaupair() {
    }

    public int getIdvaloresAupair() {
        return idvaloresAupair;
    }

    public void setIdvaloresAupair(int idvaloresAupair) {
        this.idvaloresAupair = idvaloresAupair;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
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

    public int getFornecedorcidadeIdfornecedorcidade() {
        return fornecedorcidadeIdfornecedorcidade;
    }

    public void setFornecedorcidadeIdfornecedorcidade(int fornecedorcidadeIdfornecedorcidade) {
        this.fornecedorcidadeIdfornecedorcidade = fornecedorcidadeIdfornecedorcidade;
    }

    public int getMoedasIdmoedas() {
        return moedasIdmoedas;
    }

    public void setMoedasIdmoedas(int moedasIdmoedas) {
        this.moedasIdmoedas = moedasIdmoedas;
    }

    public int getProdutosOrcamentoidprodutosOrcamento() {
        return produtosOrcamentoidprodutosOrcamento;
    }

    public void setProdutosOrcamentoidprodutosOrcamento(int produtosOrcamentoidprodutosOrcamento) {
        this.produtosOrcamentoidprodutosOrcamento = produtosOrcamentoidprodutosOrcamento;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
}
