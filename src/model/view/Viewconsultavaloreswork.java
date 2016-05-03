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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewconsultavaloreswork")
public class Viewconsultavaloreswork implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvaloresWork")
    @Id
    private int idvaloresWork;
    @Size(max = 100)
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorgross")
    private Float valorgross;
    @Column(name = "valornet")
    private Double valornet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moedas_idmoedas")
    private int moedasIdmoedas;
    @Size(max = 10)
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fornecedorcidade_idfornecedorcidade")
    private int fornecedorcidadeIdfornecedorcidade;

    public Viewconsultavaloreswork() {
    }

    public int getIdvaloresWork() {
        return idvaloresWork;
    }

    public void setIdvaloresWork(int idvaloresWork) {
        this.idvaloresWork = idvaloresWork;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValorgross() {
        return valorgross;
    }

    public void setValorgross(Float valorgross) {
        this.valorgross = valorgross;
    }

    public Double getValornet() {
        return valornet;
    }

    public void setValornet(Double valornet) {
        this.valornet = valornet;
    }

    public int getMoedasIdmoedas() {
        return moedasIdmoedas;
    }

    public void setMoedasIdmoedas(int moedasIdmoedas) {
        this.moedasIdmoedas = moedasIdmoedas;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getFornecedorcidadeIdfornecedorcidade() {
        return fornecedorcidadeIdfornecedorcidade;
    }

    public void setFornecedorcidadeIdfornecedorcidade(int fornecedorcidadeIdfornecedorcidade) {
        this.fornecedorcidadeIdfornecedorcidade = fornecedorcidadeIdfornecedorcidade;
    }
    
}
