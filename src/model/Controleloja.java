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
@Table(name = "controleloja")
public class Controleloja implements Serializable {
    @Lob
    @Column(name = "historico")
    private String historico;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontroleLoja")
    private Integer idcontroleLoja;
    @Column(name = "dataControle")
    @Temporal(TemporalType.DATE)
    private Date dataControle;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "dataProximoContato")
    @Temporal(TemporalType.DATE)
    private Date dataProximoContato;
    @Column(name = "proximoEvento")
    private String proximoEvento;
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadenegocio;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "cliente_idcliente")
    private int cliente;
    @Column(name = "idFloowup")
    private int idFloowup;
    

    public Controleloja() {
    }

    public Controleloja(Integer idcontroleLoja) {
        this.idcontroleLoja = idcontroleLoja;
    }

    public Integer getIdcontroleLoja() {
        return idcontroleLoja;
    }

    public void setIdcontroleLoja(Integer idcontroleLoja) {
        this.idcontroleLoja = idcontroleLoja;
    }

    public int getIdFloowup() {
        return idFloowup;
    }

    public void setIdFloowup(int idFloowup) {
        this.idFloowup = idFloowup;
    }

    public Date getData() {
        return dataControle;
    }

    public void setData(Date dataControle) {
        this.dataControle = dataControle;
    }

    public Date getDataControle() {
        return dataControle;
    }

    public void setDataControle(Date dataControle) {
        this.dataControle = dataControle;
    }


    public Date getDataProximoContato() {
        return dataProximoContato;
    }

    public void setDataProximoContato(Date dataProximoContato) {
        this.dataProximoContato = dataProximoContato;
    }

    public String getProximoEvento() {
        return proximoEvento;
    }

    public void setProximoEvento(String proximoEvento) {
        this.proximoEvento = proximoEvento;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

   
    public int getUnidadenegocio() {
        return unidadenegocio;
    }

    public void setUnidadenegocio(int unidadenegocio) {
        this.unidadenegocio = unidadenegocio;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
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
        hash += (idcontroleLoja != null ? idcontroleLoja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controleloja)) {
            return false;
        }
        Controleloja other = (Controleloja) object;
        if ((this.idcontroleLoja == null && other.idcontroleLoja != null) || (this.idcontroleLoja != null && !this.idcontroleLoja.equals(other.idcontroleLoja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Controleloja[ idcontroleLoja=" + idcontroleLoja + " ]";
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
}
