/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Trainee.Valores;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Valorestrainee;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaValoresTraineeTableModel extends AbstractTableModel{
    
    private List<Valorestrainee> listaValor;
    private String[] colunas ={"Destino", "Valor", "Moeda"};

    public ConsultaValoresTraineeTableModel(List<Valorestrainee> listaValor) {
        this.listaValor = listaValor;
    }

    @Override
    public int getRowCount() {
        return listaValor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaValor.get(rowIndex).getDescricao();
        }else if (columnIndex==1){
            return Formatacao.formatarFloatString(listaValor.get(rowIndex).getValorgross());
        }else return listaValor.get(rowIndex).getMoedas().getSigla();
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
             return String.class;
         }else return String.class;
    }
    
}
