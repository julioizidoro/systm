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
@Table(name = "viewcontrolevoluntariado")
public class Viewcontrolevoluntariado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvendas")
    private int idvendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Size(max = 100)
    @Column(name = "nomecliente")
    private String nomecliente;
    @Size(max = 100)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idunidadeNegocio")
    private int idunidadeNegocio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Size(max = 100)
    @Column(name = "nomeconsultor")
    private String nomeconsultor;
    @Column(name = "numeroSemanas")
    private Integer numeroSemanas;
    @Size(max = 100)
    @Column(name = "nomefornecedor")
    private String nomefornecedor;
    @Size(max = 100)
    @Column(name = "curso")
    private String curso;
    @Size(max = 200)
    @Column(name = "projetoVoluntariado")
    private String projetoVoluntariado;
    @Column(name = "dataInicioVoluntariado")
    @Temporal(TemporalType.DATE)
    private Date dataInicioVoluntariado;
    @Size(max = 3)
    @Column(name = "processoenviado")
    private String processoenviado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valornet")
    private Float valornet;
    @Column(name = "valorgross")
    private Float valorgross;
    @Size(max = 100)
    @Column(name = "nomepais")
    private String nomepais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontrolevoluntariado")
    @Id
    private int idcontrolevoluntariado;
    @Size(max = 50)
    @Column(name = "situacao")
    private String situacao;
    @Size(max = 1)
    @Column(name = "docanexado")
    private String docanexado;
    @Column(name = "dataembarque")
    @Temporal(TemporalType.DATE)
    private Date dataembarque;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Size(max = 14)
    @Column(name = "fonecelular")
    private String fonecelular;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfornecedorcidade")
    private int idfornecedorcidade;

    public Viewcontrolevoluntariado() {
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
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

    public String getNomeconsultor() {
        return nomeconsultor;
    }

    public void setNomeconsultor(String nomeconsultor) {
        this.nomeconsultor = nomeconsultor;
    }

    public Integer getNumeroSemanas() {
        return numeroSemanas;
    }

    public void setNumeroSemanas(Integer numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProjetoVoluntariado() {
        return projetoVoluntariado;
    }

    public void setProjetoVoluntariado(String projetoVoluntariado) {
        this.projetoVoluntariado = projetoVoluntariado;
    }

    public Date getDataInicioVoluntariado() {
        return dataInicioVoluntariado;
    }

    public void setDataInicioVoluntariado(Date dataInicioVoluntariado) {
        this.dataInicioVoluntariado = dataInicioVoluntariado;
    }

    public String getProcessoenviado() {
        return processoenviado;
    }

    public void setProcessoenviado(String processoenviado) {
        this.processoenviado = processoenviado;
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

    public String getNomepais() {
        return nomepais;
    }

    public void setNomepais(String nomepais) {
        this.nomepais = nomepais;
    }

    public int getIdcontrolevoluntariado() {
        return idcontrolevoluntariado;
    }

    public void setIdcontrolevoluntariado(int idcontrolevoluntariado) {
        this.idcontrolevoluntariado = idcontrolevoluntariado;
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

    public Date getDataembarque() {
        return dataembarque;
    }

    public void setDataembarque(Date dataembarque) {
        this.dataembarque = dataembarque;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getFonecelular() {
        return fonecelular;
    }

    public void setFonecelular(String fonecelular) {
        this.fonecelular = fonecelular;
    }

    public int getIdfornecedorcidade() {
        return idfornecedorcidade;
    }

    public void setIdfornecedorcidade(int idfornecedorcidade) {
        this.idfornecedorcidade = idfornecedorcidade;
    }
    
}
