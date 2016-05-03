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
@Table(name = "viewcosultafollowup")
public class Viewcosultafollowup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idfollowup")
    @Id
    private int idfollowup;
    @Column(name = "dataProximoContato")
    @Temporal(TemporalType.DATE)
    private Date dataProximoContato;
    @Column(name = "nivelInteresse")
    private String nivelInteresse;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadeNegocioidunidadeNegocio;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "idcliente")
    private int idcliente;
    @Column(name = "descricao")
    private String descricao;
    

    public Viewcosultafollowup() {
    }

    public int getIdfollowup() {
        return idfollowup;
    }

    public void setIdfollowup(int idfollowup) {
        this.idfollowup = idfollowup;
    }

    public Date getDataProximoContato() {
        return dataProximoContato;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setDataProximoContato(Date dataProximoContato) {
        this.dataProximoContato = dataProximoContato;
    }

    public String getNivelInteresse() {
        return nivelInteresse;
    }

    public void setNivelInteresse(String nivelInteresse) {
        this.nivelInteresse = nivelInteresse;
    }

    

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getUnidadeNegocioidunidadeNegocio() {
        return unidadeNegocioidunidadeNegocio;
    }

    public void setUnidadeNegocioidunidadeNegocio(int unidadeNegocioidunidadeNegocio) {
        this.unidadeNegocioidunidadeNegocio = unidadeNegocioidunidadeNegocio;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
