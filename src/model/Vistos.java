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
@Table(name = "vistos")
public class Vistos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvistos")
    private Integer idvistos;
    @Column(name = "dataEntregaDocumentos")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaDocumentos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorEmissao")
    private Float valorEmissao;
    @Size(max = 100)
    @Column(name = "observacao")
    private String observacao;
    @Size(max = 3)
    @Column(name = "possuiVisto")
    private String possuiVisto;
    @Size(max = 50)
    @Column(name = "paisDestino")
    private String paisDestino;
    @Size(max = 30)
    @Column(name = "tipoVisto")
    private String tipoVisto;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Size(max = 50)
    @Column(name = "duracao")
    private String duracao;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "obstm")
    private String obstm;
    @Size(max = 50)
    @Column(name = "controle")
    private String controle;
    @Column(name = "vendas_idvendas")
    private int vendas;
    @JoinColumn(name = "valoresvistos_idvaloresvistos", referencedColumnName = "idvaloresvistos")
    @ManyToOne(optional = false)
    private Valoresvistos valoresvistos;

    public Vistos() {
    }

    public Vistos(Integer idvistos) {
        this.idvistos = idvistos;
    }

    public Integer getIdvistos() {
        return idvistos;
    }

    public void setIdvistos(Integer idvistos) {
        this.idvistos = idvistos;
    }

    public Date getDataEntregaDocumentos() {
        return dataEntregaDocumentos;
    }

    public void setDataEntregaDocumentos(Date dataEntregaDocumentos) {
        this.dataEntregaDocumentos = dataEntregaDocumentos;
    }

    public Float getValorEmissao() {
        return valorEmissao;
    }

    public void setValorEmissao(Float valorEmissao) {
        this.valorEmissao = valorEmissao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPossuiVisto() {
        return possuiVisto;
    }

    public void setPossuiVisto(String possuiVisto) {
        this.possuiVisto = possuiVisto;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getTipoVisto() {
        return tipoVisto;
    }

    public void setTipoVisto(String tipoVisto) {
        this.tipoVisto = tipoVisto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getObstm() {
        return obstm;
    }

    public void setObstm(String obstm) {
        this.obstm = obstm;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }


    public Valoresvistos getValoresvistos() {
        return valoresvistos;
    }

    public void setValoresvistos(Valoresvistos valoresvistos) {
        this.valoresvistos = valoresvistos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvistos != null ? idvistos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vistos)) {
            return false;
        }
        Vistos other = (Vistos) object;
        if ((this.idvistos == null && other.idvistos != null) || (this.idvistos != null && !this.idvistos.equals(other.idvistos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vistos[ idvistos=" + idvistos + " ]";
    }
    
}
