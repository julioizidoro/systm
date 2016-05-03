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
@Table(name = "viewconsultavaloreshighschool")
public class Viewconsultavaloreshighschool implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvaloresHighSchool")
    @Id
    private int idvaloresHighSchool;
    @Size(max = 100)
    @Column(name = "duracao")
    private String duracao;
    @Size(max = 100)
    @Column(name = "inicio")
    private String inicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorgross")
    private Float valorgross;
    @Size(max = 10)
    @Column(name = "situacao")
    private String situacao;
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

    public Viewconsultavaloreshighschool() {
    }

    public int getIdvaloresHighSchool() {
        return idvaloresHighSchool;
    }

    public void setIdvaloresHighSchool(int idvaloresHighSchool) {
        this.idvaloresHighSchool = idvaloresHighSchool;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
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
