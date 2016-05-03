/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Agenda;

import java.util.Date;
import java.util.List;
import model.Agenda;
import model.view.Viewconusltaagenda;


/**
 *
 * @author Wolverine
 */
public class AgendaBean {
    
    private Date data;
    private int dia;
    private List<Viewconusltaagenda> listaEventos;
    private int diaSemana;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public List<Viewconusltaagenda> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Viewconusltaagenda> listaEventos) {
        this.listaEventos = listaEventos;
    }

    

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    
    
}
