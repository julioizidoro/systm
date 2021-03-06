/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewvendasladies")
public class Viewvendasladies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idVendas")
    @Id
    private int idVendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "idprodutos")
    private int idprodutos;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Column(name = "Curso")
    private String curso;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "idunidadeNegocio")
    private int idunidadeNegocio;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "dataCambio")
    @Temporal(TemporalType.DATE)
    private Date dataCambio;
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Column(name = "descricaoMoedas")
    private String descricaoMoedas;
    @Basic(optional = false)
    @Column(name = "idcambio")
    private int idcambio;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "Obstm")
    private String Obstm;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    public Viewvendasladies() {
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

    public Date getDataCambio() {
        return dataCambio;
    }

    public String getObstm() {
        return Obstm;
    }

    public void setObstm(String Obstm) {
        this.Obstm = Obstm;
    }

    public void setDataCambio(Date dataCambio) {
        this.dataCambio = dataCambio;
    }

    public Float getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Float valorCambio) {
        this.valorCambio = valorCambio;
    }

    public String getDescricaoMoedas() {
        return descricaoMoedas;
    }

    public void setDescricaoMoedas(String descricaoMoedas) {
        this.descricaoMoedas = descricaoMoedas;
    }

    public int getIdcambio() {
        return idcambio;
    }

    public void setIdcambio(int idcambio) {
        this.idcambio = idcambio;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }


    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdprodutos() {
        return idprodutos;
    }

    public void setIdprodutos(int idprodutos) {
        this.idprodutos = idprodutos;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
}
