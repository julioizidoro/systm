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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "cotacaopacotes")
public class Cotacaopacotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcotacaoPacotes")
    private Integer idcotacaoPacotes;
    @Column(name = "dataSolicitacao")
    @Temporal(TemporalType.DATE)
    private Date dataSolicitacao;
    @Size(max = 15)
    @Column(name = "horaSolicitacao")
    private String horaSolicitacao;
    @Column(name = "dataEspecificaViagem")
    @Temporal(TemporalType.DATE)
    private Date dataEspecificaViagem;
    @Column(name = "dataIda")
    @Temporal(TemporalType.DATE)
    private Date dataIda;
    @Column(name = "dataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Size(max = 50)
    @Column(name = "origram")
    private String origram;
    @Size(max = 50)
    @Column(name = "destino")
    private String destino;
    @Size(max = 1)
    @Column(name = "tipoPacote")
    private String tipoPacote;
    @Column(name = "numeroAdultos")
    private Integer numeroAdultos;
    @Column(name = "numeroCriancas5")
    private Integer numeroCriancas5;
    @Column(name = "numeroCriancas10")
    private Integer numeroCriancas10;
    @Column(name = "numeroBebes")
    private Integer numeroBebes;
    @Size(max = 10)
    @Column(name = "tipoApartamento")
    private String tipoApartamento;
    @Size(max = 15)
    @Column(name = "tipoHotel")
    private String tipoHotel;
    @Size(max = 1)
    @Column(name = "seguro")
    private String seguro;
    @Size(max = 1)
    @Column(name = "carro")
    private String carro;
    @Size(max = 50)
    @Column(name = "localRetiradaCarro")
    private String localRetiradaCarro;
    @Size(max = 50)
    @Column(name = "localEntregaCarro")
    private String localEntregaCarro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorInvestimento")
    private Float valorInvestimento;
    @Lob
    @Size(max = 16777215)
    @Column(name = "observacao")
    private String observacao;
    @Size(max = 30)
    @Column(name = "situacao")
    private String situacao;
    @Size(max = 100)
    @Column(name = "origemCliente")
    private String origemCliente;
    @Size(max = 100)
    @Column(name = "cliente")
    private String cliente;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadenegocio;
   

    public Cotacaopacotes() {
    }

    public Cotacaopacotes(Integer idcotacaoPacotes) {
        this.idcotacaoPacotes = idcotacaoPacotes;
    }

    public Integer getIdcotacaoPacotes() {
        return idcotacaoPacotes;
    }

    public void setIdcotacaoPacotes(Integer idcotacaoPacotes) {
        this.idcotacaoPacotes = idcotacaoPacotes;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getUnidadenegocio() {
        return unidadenegocio;
    }

    public void setUnidadenegocio(int unidadenegocio) {
        this.unidadenegocio = unidadenegocio;
    }

    public String getHoraSolicitacao() {
        return horaSolicitacao;
    }

    public void setHoraSolicitacao(String horaSolicitacao) {
        this.horaSolicitacao = horaSolicitacao;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getOrigemCliente() {
        return origemCliente;
    }

    public void setOrigemCliente(String origemCliente) {
        this.origemCliente = origemCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public Date getDataEspecificaViagem() {
        return dataEspecificaViagem;
    }

    public void setDataEspecificaViagem(Date dataEspecificaViagem) {
        this.dataEspecificaViagem = dataEspecificaViagem;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getOrigram() {
        return origram;
    }

    public void setOrigram(String origram) {
        this.origram = origram;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoPacote() {
        return tipoPacote;
    }

    public void setTipoPacote(String tipoPacote) {
        this.tipoPacote = tipoPacote;
    }

    public Integer getNumeroAdultos() {
        return numeroAdultos;
    }

    public void setNumeroAdultos(Integer numeroAdultos) {
        this.numeroAdultos = numeroAdultos;
    }

    public Integer getNumeroCriancas5() {
        return numeroCriancas5;
    }

    public void setNumeroCriancas5(Integer numeroCriancas5) {
        this.numeroCriancas5 = numeroCriancas5;
    }

    public Integer getNumeroCriancas10() {
        return numeroCriancas10;
    }

    public void setNumeroCriancas10(Integer numeroCriancas10) {
        this.numeroCriancas10 = numeroCriancas10;
    }

   

    public Integer getNumeroBebes() {
        return numeroBebes;
    }

    public void setNumeroBebes(Integer numeroBebes) {
        this.numeroBebes = numeroBebes;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public String getTipoHotel() {
        return tipoHotel;
    }

    public void setTipoHotel(String tipoHotel) {
        this.tipoHotel = tipoHotel;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getLocalRetiradaCarro() {
        return localRetiradaCarro;
    }

    public void setLocalRetiradaCarro(String localRetiradaCarro) {
        this.localRetiradaCarro = localRetiradaCarro;
    }

    public String getLocalEntregaCarro() {
        return localEntregaCarro;
    }

    public void setLocalEntregaCarro(String localEntregaCarro) {
        this.localEntregaCarro = localEntregaCarro;
    }

    public Float getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(Float valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotacaoPacotes != null ? idcotacaoPacotes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotacaopacotes)) {
            return false;
        }
        Cotacaopacotes other = (Cotacaopacotes) object;
        if ((this.idcotacaoPacotes == null && other.idcotacaoPacotes != null) || (this.idcotacaoPacotes != null && !this.idcotacaoPacotes.equals(other.idcotacaoPacotes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cotacaopacotes[ idcotacaoPacotes=" + idcotacaoPacotes + " ]";
    }
    
}
