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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "followup")
public class Followup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfollowup")
    private Integer idfollowup;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "dataProximoContato")
    @Temporal(TemporalType.DATE)
    private Date dataProximoContato;
    @Column(name = "horaproximocontato")
    @Temporal(TemporalType.TIME)
    private Date horaproximocontato;
    @Column(name = "nomeConcorrencia")
    private String nomeConcorrencia;
    @Column(name = "nivelInteresse")
    private String nivelInteresse;
    @Column(name = "pais")
    private String pais;
    @Lob
    @Column(name = "historico")
    private String historico;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadenegocio;
    @Column(name = "cliente_idcliente")
    private int cliente;
    @Column(name = "produtos_idprodutos")
    private int produto;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataFechamento")
    @Temporal(TemporalType.DATE)
    private Date dataFechamneto;
    @Column(name = "Fechou")
    private String fechou;
    
    

    public Followup() {
    }

    public Followup(Integer idfollowup) {
        this.idfollowup = idfollowup;
    }

    public Integer getIdfollowup() {
        return idfollowup;
    }

    public void setIdfollowup(Integer idfollowup) {
        this.idfollowup = idfollowup;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFechamneto() {
        return dataFechamneto;
    }

    public void setDataFechamneto(Date dataFechamneto) {
        this.dataFechamneto = dataFechamneto;
    }

    public String getFechou() {
        return fechou;
    }

    public void setFechou(String fechou) {
        this.fechou = fechou;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public Date getHoraproximocontato() {
        return horaproximocontato;
    }

    public void setHoraproximocontato(Date horaproximocontato) {
        this.horaproximocontato = horaproximocontato;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDataProximoContato() {
        return dataProximoContato;
    }

    public void setDataProximoContato(Date dataProximoContato) {
        this.dataProximoContato = dataProximoContato;
    }

    public String getNomeConcorrencia() {
        return nomeConcorrencia;
    }

    public void setNomeConcorrencia(String nomeConcorrencia) {
        this.nomeConcorrencia = nomeConcorrencia;
    }

    public String getNivelInteresse() {
        return nivelInteresse;
    }

    public void setNivelInteresse(String nivelInteresse) {
        this.nivelInteresse = nivelInteresse;
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

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfollowup != null ? idfollowup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Followup)) {
            return false;
        }
        Followup other = (Followup) object;
        if ((this.idfollowup == null && other.idfollowup != null) || (this.idfollowup != null && !this.idfollowup.equals(other.idfollowup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Followup[ idfollowup=" + idfollowup + " ]";
    }
    
}
