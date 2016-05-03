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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewconsultacontroleloja")
public class Viewconsultacontroleloja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idcontroleloja")
    @Id
    private int idcontroleloja;
    @Column(name = "dataControle")
    @Temporal(TemporalType.DATE)
    private Date dataControle;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "evento")
    private String evento;
    @Lob
    @Column(name = "historico")
    private String historico;
    @Column(name = "dataproximocontato")
    @Temporal(TemporalType.DATE)
    private Date dataproximocontato;
    @Column(name = "proximoevento")
    private String proximoevento;
    @Basic(optional = false)
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;
    @Basic(optional = false)
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @Column(name = "unidadeNegocio_idUnidadeNegocio")
    private int unidadeNegocioidUnidadeNegocio;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "nome")
    private String nome;

    public Viewconsultacontroleloja() {
    }

    public int getIdcontroleloja() {
        return idcontroleloja;
    }

    public void setIdcontroleloja(int idcontroleloja) {
        this.idcontroleloja = idcontroleloja;
    }

    public Date getDataControle() {
        return dataControle;
    }

    public void setDataControle(Date dataControle) {
        this.dataControle = dataControle;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Date getDataproximocontato() {
        return dataproximocontato;
    }

    public void setDataproximocontato(Date dataproximocontato) {
        this.dataproximocontato = dataproximocontato;
    }

    public String getProximoevento() {
        return proximoevento;
    }

    public void setProximoevento(String proximoevento) {
        this.proximoevento = proximoevento;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getUnidadeNegocioidUnidadeNegocio() {
        return unidadeNegocioidUnidadeNegocio;
    }

    public void setUnidadeNegocioidUnidadeNegocio(int unidadeNegocioidUnidadeNegocio) {
        this.unidadeNegocioidUnidadeNegocio = unidadeNegocioidUnidadeNegocio;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
