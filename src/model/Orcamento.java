/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "orcamento")
public class Orcamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorcamento")
    private Integer idorcamento;
    @Column(name = "dataCambio")
    @Temporal(TemporalType.DATE)
    private Date dataCambio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Column(name = "cambioAlterado")
    private String cambioAlterado;
    @Column(name = "totalMoedaEstrangeira")
    private Float totalMoedaEstrangeira;
    @Column(name = "totalMoedaNacional")
    private Float totalMoedaNacional;
    @Column(name = "taxatm")
    private Float taxatm;
    @Column(name = "vendas_idvendas")
    private int vendas;
    @Column(name = "cambio_idcambio")
    private int cambio;

    public Orcamento() {
    }

    public Orcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public Integer getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public Date getDataCambio() {
        return dataCambio;
    }

    public Float getTaxatm() {
        return taxatm;
    }

    public void setTaxatm(Float taxatm) {
        this.taxatm = taxatm;
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

   

    public String getCambioAlterado() {
        return cambioAlterado;
    }

    public void setCambioAlterado(String cambioAlterado) {
        this.cambioAlterado = cambioAlterado;
    }

    public Float getTotalMoedaEstrangeira() {
        return totalMoedaEstrangeira;
    }

    public void setTotalMoedaEstrangeira(Float totalMoedaEstrangeira) {
        this.totalMoedaEstrangeira = totalMoedaEstrangeira;
    }

    public Float getTotalMoedaNacional() {
        return totalMoedaNacional;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public void setTotalMoedaNacional(Float totalMoedaNacional) {
        this.totalMoedaNacional = totalMoedaNacional;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorcamento != null ? idorcamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamento)) {
            return false;
        }
        Orcamento other = (Orcamento) object;
        if ((this.idorcamento == null && other.idorcamento != null) || (this.idorcamento != null && !this.idorcamento.equals(other.idorcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Orcamento[ idorcamento=" + idorcamento + " ]";
    }

}
