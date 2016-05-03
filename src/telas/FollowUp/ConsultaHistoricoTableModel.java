/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.FollowUp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewconsultacontroleloja;
import model.view.Viewcosultafollowup;

/**
 *
 * @author Wolverine
 */
public class ConsultaHistoricoTableModel extends AbstractTableModel{
    
    private List<Viewconsultacontroleloja> listaHistorico;
    private String[] colunas ={"Próximo Contato", "Hora", "Histórico", "Unidade"};

    public ConsultaHistoricoTableModel(List<Viewconsultacontroleloja> listaHistorico) {
        this.listaHistorico = listaHistorico;
    }

    @Override
    public int getRowCount() {
        return listaHistorico.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaHistorico.get(rowIndex).getDataControle();
        }else if (columnIndex==1){
            return (new SimpleDateFormat("HH:mm").format(listaHistorico.get(rowIndex).getHora()));
        }else if (columnIndex==2){
            return listaHistorico.get(rowIndex).getHistorico();
        }else return listaHistorico.get(rowIndex).getNomeFantasia();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Date.class;
         }else if (columnIndex==1){
             return  String.class;
         }else if (columnIndex==2){
             return String.class;
         }else return String.class;
    }
    
    
}
