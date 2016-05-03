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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "cancelamento")
@NamedQueries({
    @NamedQuery(name = "Cancelamento.findAll", query = "SELECT c FROM Cancelamento c")})
public class Cancelamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcancelamento")
    private Integer idcancelamento;
    @Column(name = "datasolicitacao")
    @Temporal(TemporalType.DATE)
    private Date datasolicitacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valormatriz")
    private Float valormatriz;
    @Column(name = "valorloja")
    private Float valorloja;
    @Column(name = "multa")
    private Float multa;
    @Column(name = "valorreembolso")
    private Float valorreembolso;
    @Size(max = 10)
    @Column(name = "tipopagamento")
    private String tipopagamento;
    @Size(max = 50)
    @Column(name = "localacerto")
    private String localacerto;
    @Lob
    @Size(max = 16777215)
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "dataacerto")
    @Temporal(TemporalType.DATE)
    private Date dataacerto;
    @Column(name = "vendas_idvendas")
    private int vendas;
     @Column(name = "usuario_idusuario")
    private int usuario;

    public Cancelamento() {
    }

    public Cancelamento(Integer idcancelamento) {
        this.idcancelamento = idcancelamento;
    }

    public Integer getIdcancelamento() {
        return idcancelamento;
    }

    public void setIdcancelamento(Integer idcancelamento) {
        this.idcancelamento = idcancelamento;
    }

    public Date getDatasolicitacao() {
        return datasolicitacao;
    }

    public void setDatasolicitacao(Date datasolicitacao) {
        this.datasolicitacao = datasolicitacao;
    }

    public String getLocalacerto() {
        return localacerto;
    }

    public void setLocalacerto(String localacerto) {
        this.localacerto = localacerto;
    }

    public Date getDataacerto() {
        return dataacerto;
    }

    public void setDataacerto(Date dataacerto) {
        this.dataacerto = dataacerto;
    }


    public Float getValormatriz() {
        return valormatriz;
    }

    public void setValormatriz(Float valormatriz) {
        this.valormatriz = valormatriz;
    }

    public Float getValorloja() {
        return valorloja;
    }

    public void setValorloja(Float valorloja) {
        this.valorloja = valorloja;
    }

    public Float getMulta() {
        return multa;
    }

    public void setMulta(Float multa) {
        this.multa = multa;
    }

    public Float getValorreembolso() {
        return valorreembolso;
    }

    public void setValorreembolso(Float valorreembolso) {
        this.valorreembolso = valorreembolso;
    }

    public String getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(String tipopagamento) {
        this.tipopagamento = tipopagamento;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcancelamento != null ? idcancelamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancelamento)) {
            return false;
        }
        Cancelamento other = (Cancelamento) object;
        if ((this.idcancelamento == null && other.idcancelamento != null) || (this.idcancelamento != null && !this.idcancelamento.equals(other.idcancelamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cancelamento[ idcancelamento=" + idcancelamento + " ]";
    }
    
}
