/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "pacotecarro")
public class Pacotecarro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpacoteCarro")
    private Integer idpacoteCarro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorMoedaEstrangeira")
    private Float valorMoedaEstrangeira;
    @Column(name = "valorMoedaNacional")
    private Float valorMoedaNacional;
    @Column(name = "produtosOrcamento_idprodutosOrcamento")
    private int produtosOrcamento;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;
    @Column(name = "pacotes_idpacotes")
    private int pacotes;
    @Column(name = "localizador")
    private String localizador;

    public Pacotecarro() {
    }

    public Pacotecarro(Integer idpacoteCarro) {
        this.idpacoteCarro = idpacoteCarro;
    }

    public Integer getIdpacoteCarro() {
        return idpacoteCarro;
    }

    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public void setIdpacoteCarro(Integer idpacoteCarro) {
        this.idpacoteCarro = idpacoteCarro;
    }

    public Float getValorMoedaEstrangeira() {
        return valorMoedaEstrangeira;
    }

    public void setValorMoedaEstrangeira(Float valorMoedaEstrangeira) {
        this.valorMoedaEstrangeira = valorMoedaEstrangeira;
    }

    public Float getValorMoedaNacional() {
        return valorMoedaNacional;
    }

    public void setValorMoedaNacional(Float valorMoedaNacional) {
        this.valorMoedaNacional = valorMoedaNacional;
    }

    public int getProdutosOrcamento() {
        return produtosOrcamento;
    }

    public void setProdutosOrcamento(int produtosOrcamento) {
        this.produtosOrcamento = produtosOrcamento;
    }


    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getPacotes() {
        return pacotes;
    }

    public void setPacotes(int pacotes) {
        this.pacotes = pacotes;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacoteCarro != null ? idpacoteCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacotecarro)) {
            return false;
        }
        Pacotecarro other = (Pacotecarro) object;
        if ((this.idpacoteCarro == null && other.idpacoteCarro != null) || (this.idpacoteCarro != null && !this.idpacoteCarro.equals(other.idpacoteCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pacotecarro[ idpacoteCarro=" + idpacoteCarro + " ]";
    }
    
}
