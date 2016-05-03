/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Agenda;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewconusltaagenda;

/**
 *
 * @author Wolverine
 */
public class ConsultaEventoTableModel extends AbstractTableModel{
    
    private List<Viewconusltaagenda> listaAgenda;
    private String[] colunas ={"Hora", "Evento","Agendado por" ,"Situação", "Consultor", "Unidade"};

    public ConsultaEventoTableModel(List<Viewconusltaagenda> listaAgenda) {
        this.listaAgenda = listaAgenda;
    }

    @Override
    public int getRowCount() {
        return listaAgenda.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return (new SimpleDateFormat("HH:mm").format(listaAgenda.get(rowIndex).getHora()));
        }else if (columnIndex==1){
            return listaAgenda.get(rowIndex).getEvento();
        }else if (columnIndex==2){
            return listaAgenda.get(rowIndex).getQuemAgendou();
        }else if (columnIndex==3){
            return listaAgenda.get(rowIndex).getSituacao();
        }else if (columnIndex==4){
            return listaAgenda.get(rowIndex).getNome();
        }else return listaAgenda.get(rowIndex).getNomeFantasia();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return String.class;
         }else if (columnIndex==1){
             return  String.class;
         }else if (columnIndex==2){
             return String.class;
         }else if (columnIndex==3){
             return String.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    
}
