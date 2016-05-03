/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "vendas")
public class Vendas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvendas")
    private Integer idvendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @Column(name = "situacao")
    private String situacao;
    @Lob
    @Column( name = "Obstm")
    private String obstm;
    @Column(name = "vendasMatriz")
    private String vendasMatriz;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadenegocio;
    @Column(name = "produtos_idprodutos")
    private int produtos;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;
    @Column(name = "cliente_idcliente")
    private int cliente;
    @Column(name = "obsCancelar")
    private String obsCancelar;
    @Column(name = "datacancelamento")
    @Temporal(TemporalType.DATE)
    private Date datacancelamento;
    @JoinColumn(name = "fornecedorcidade_idfornecedorcidade", referencedColumnName = "idfornecedorcidade")
    @ManyToOne(optional = false)
    private Fornecedorcidade fornecedorcidade;
    @Column(name = "vendaimportada")
    private Integer vendaimportada;
    @Column(name = "usuariocancelamento")
    private Integer usuariocancelamento;
    @Column(name = "cambio_idcambio")
    private Integer cambio;
    
  
    public Vendas() {
    }

    public Vendas(Integer idvendas) {
        this.idvendas = idvendas;
    }

    public Integer getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(Integer idvendas) {
        this.idvendas = idvendas;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getObsCancelar() {
        return obsCancelar;
    }

    public Date getDatacancelamento() {
        return datacancelamento;
    }

    public void setDatacancelamento(Date datacancelamento) {
        this.datacancelamento = datacancelamento;
    }

    public Integer getVendaimportada() {
        return vendaimportada;
    }

    public void setVendaimportada(Integer vendaimportada) {
        this.vendaimportada = vendaimportada;
    }

    public Integer getUsuariocancelamento() {
        return usuariocancelamento;
    }

    public void setUsuariocancelamento(Integer usuariocancelamento) {
        this.usuariocancelamento = usuariocancelamento;
    }


    public void setObsCancelar(String obsCancelar) {
        this.obsCancelar = obsCancelar;
    }

    public Float getValor() {
        return valor;
    }

    public Integer getCambio() {
        return cambio;
    }

    public void setCambio(Integer cambio) {
        this.cambio = cambio;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public Fornecedorcidade getFornecedorcidade() {
        return fornecedorcidade;
    }

    public void setFornecedorcidade(Fornecedorcidade fornecedorcidade) {
        this.fornecedorcidade = fornecedorcidade;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObstm() {
        return obstm;
    }

    public void setObstm(String obstm) {
        this.obstm = obstm;
    }

    public String getVendasMatriz() {
        return vendasMatriz;
    }

    public void setVendasMatriz(String vendasMatriz) {
        this.vendasMatriz = vendasMatriz;
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

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvendas != null ? idvendas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendas)) {
            return false;
        }
        Vendas other = (Vendas) object;
        if ((this.idvendas == null && other.idvendas != null) || (this.idvendas != null && !this.idvendas.equals(other.idvendas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vendas[ idvendas=" + idvendas + " ]";
    }

}
