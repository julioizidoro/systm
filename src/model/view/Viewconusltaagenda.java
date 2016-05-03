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
@Table(name = "viewconusltaagenda")
public class Viewconusltaagenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idAgenda")
    @Id
    private int idAgenda;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "quemAgendou")
    private String quemAgendou;
    @Basic(optional = false)
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadeNegocioidunidadeNegocio;
    @Column(name = "idusuario")
    private int idusuario;
    @Column(name = "evento")
    private String evento;
    @Column(name = "nome")
    private String nome;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;

    public Viewconusltaagenda() {
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getQuemAgendou() {
        return quemAgendou;
    }

    public void setQuemAgendou(String quemAgendou) {
        this.quemAgendou = quemAgendou;
    }

    public int getUnidadeNegocioidunidadeNegocio() {
        return unidadeNegocioidunidadeNegocio;
    }

    public void setUnidadeNegocioidunidadeNegocio(int unidadeNegocioidunidadeNegocio) {
        this.unidadeNegocioidunidadeNegocio = unidadeNegocioidunidadeNegocio;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
}
