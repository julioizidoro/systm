/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.HighSchool.Valores;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewconsultavaloreshighschool;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaValoresHighSchoolTableModel extends AbstractTableModel{
    
    private List<Viewconsultavaloreshighschool> listaValor;
    private String[] colunas ={"Duraçãoo", "Ínicio", "Valor", "Moeda", "Situação"};

    public ConsultaValoresHighSchoolTableModel(List<Viewconsultavaloreshighschool> listaValor) {
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
            return listaValor.get(rowIndex).getDuracao();
        }else if (columnIndex==1){
            return listaValor.get(rowIndex).getInicio();
        }else if (columnIndex==2){
            return Formatacao.formatarFloatString(listaValor.get(rowIndex).getValorgross());
        }else if (columnIndex==3){
            return listaValor.get(rowIndex).getSigla();
        }else return listaValor.get(rowIndex).getSituacao();
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
         }else if (columnIndex==2){
             return  String.class;
         }else if (columnIndex==3){
             return  String.class;
         }else return String.class;
    }
    
}
