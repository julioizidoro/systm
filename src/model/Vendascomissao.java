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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "vendascomissao")
public class Vendascomissao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvendascomissao")
    private Integer idvendascomissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorbruto")
    private Float valorbruto;
    @Column(name = "valorfornecedor")
    private Float valorfornecedor;
    @Column(name = "comissaotm")
    private Float comissaotm;
    @Column(name = "taxatm")
    private Float taxatm;
    @Column(name = "descontotm")
    private Float descontotm;
    @Column(name = "descontoloja")
    private Float descontoloja;
    @Column(name = "comissaoemissor")
    private Float comissaoemissor;
    @Column(name = "comissaogerente")
    private Float comissaogerente;
    @Column(name = "comissaoterceiros")
    private Float comissaoterceiros;
    @Column(name = "comissaofraquia")
    private Float comissaofraquia;
    @Column(name = "liquidofranquia")
    private Float liquidofranquia;
    @Column(name = "desagio")
    private Float desagio;
    @Column(name = "liquidovendas")
    private Float liquidovendas;
    @Column(name = "previsaopagamento")
    @Temporal(TemporalType.DATE)
    private Date previsaopagamento;
    @Column(name = "paga")
    private String paga;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "vendas_idvendas", referencedColumnName = "idvendas")
    @ManyToOne(optional = false)
    private Vendas vendas;
    @JoinColumn(name = "produtos_idprodutos", referencedColumnName = "idprodutos")
    @ManyToOne(optional = false)
    private Produtos produtos;
    @Column(name = "terceiros_idterceiros")
    private int terceiros;
    @Column(name = "comissaofranquiabruta")
    private float comissaofranquiabruta;
    @Column(name = "valorcomissionavel")
    private float valorcomissionavel;
    @Column(name = "datainicioprograma")
    @Temporal(TemporalType.DATE)
    private Date datainicioprograma;
    
    
    public Vendascomissao() {
    }

    public Vendascomissao(Integer idvendascomissao) {
        this.idvendascomissao = idvendascomissao;
    }

    public Integer getIdvendascomissao() {
        return idvendascomissao;
    }

    public void setIdvendascomissao(Integer idvendascomissao) {
        this.idvendascomissao = idvendascomissao;
    }

    public Float getValorbruto() {
        return valorbruto;
    }

    public void setValorbruto(Float valorbruto) {
        this.valorbruto = valorbruto;
    }

    public Float getValorfornecedor() {
        return valorfornecedor;
    }

    public void setValorfornecedor(Float valorfornecedor) {
        this.valorfornecedor = valorfornecedor;
    }

    public Float getComissaotm() {
        return comissaotm;
    }

    public Date getDatainicioprograma() {
        return datainicioprograma;
    }

    public void setDatainicioprograma(Date datainicioprograma) {
        this.datainicioprograma = datainicioprograma;
    }

    public float getComissaofranquiabruta() {
        return comissaofranquiabruta;
    }

    public void setComissaofranquiabruta(float comissaofranquiabruta) {
        this.comissaofranquiabruta = comissaofranquiabruta;
    }

    public float getValorcomissionavel() {
        return valorcomissionavel;
    }

    public void setValorcomissionavel(float valorcomissionavel) {
        this.valorcomissionavel = valorcomissionavel;
    }

    public void setComissaotm(Float comissaotm) {
        this.comissaotm = comissaotm;
    }

    public Float getTaxatm() {
        return taxatm;
    }

    public void setTaxatm(Float taxatm) {
        this.taxatm = taxatm;
    }

    public Float getDescontotm() {
        return descontotm;
    }

    public void setDescontotm(Float descontotm) {
        this.descontotm = descontotm;
    }

    public Float getDescontoloja() {
        return descontoloja;
    }

    public void setDescontoloja(Float descontoloja) {
        this.descontoloja = descontoloja;
    }

    public Float getComissaoemissor() {
        return comissaoemissor;
    }

    public void setComissaoemissor(Float comissaoemissor) {
        this.comissaoemissor = comissaoemissor;
    }

    public Float getComissaogerente() {
        return comissaogerente;
    }

    public void setComissaogerente(Float comissaogerente) {
        this.comissaogerente = comissaogerente;
    }

    public Float getComissaoterceiros() {
        return comissaoterceiros;
    }

    public Float getLiquidofranquia() {
        return liquidofranquia;
    }

    public void setLiquidofranquia(Float liquidofranquia) {
        this.liquidofranquia = liquidofranquia;
    }

    public void setComissaoterceiros(Float comissaoterceiros) {
        this.comissaoterceiros = comissaoterceiros;
    }

    public Float getComissaofraquia() {
        return comissaofraquia;
    }

    public void setComissaofraquia(Float comissaofraquia) {
        this.comissaofraquia = comissaofraquia;
    }

    public Float getDesagio() {
        return desagio;
    }

    public void setDesagio(Float desagio) {
        this.desagio = desagio;
    }

    public Float getLiquidovendas() {
        return liquidovendas;
    }

    public void setLiquidovendas(Float liquidovendas) {
        this.liquidovendas = liquidovendas;
    }

    public Date getPrevisaopagamento() {
        return previsaopagamento;
    }

    public void setPrevisaopagamento(Date previsaopagamento) {
        this.previsaopagamento = previsaopagamento;
    }


    public String getPaga() {
        return paga;
    }

    public void setPaga(String paga) {
        this.paga = paga;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public int getTerceiros() {
        return terceiros;
    }

    public void setTerceiros(int terceiros) {
        this.terceiros = terceiros;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvendascomissao != null ? idvendascomissao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendascomissao)) {
            return false;
        }
        Vendascomissao other = (Vendascomissao) object;
        if ((this.idvendascomissao == null && other.idvendascomissao != null) || (this.idvendascomissao != null && !this.idvendascomissao.equals(other.idvendascomissao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vendascomissao[ idvendascomissao=" + idvendascomissao + " ]";
    }
}
