/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.cambio;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cambio;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaMoedaTableModel extends AbstractTableModel {
    
    private List<Cambio> listaCambio;
    private String[] colunas ={"Sigla", "Descrição", "Valor R$"};

    public ConsultaMoedaTableModel(List<Cambio> listaCambio) {
        this.listaCambio = listaCambio;
    }

    @Override
    public int getRowCount() {
            return listaCambio.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaCambio.get(rowIndex).getMoedas().getSigla();
        }else if (columnIndex==1){
            return listaCambio.get(rowIndex).getMoedas().getDescricao();
        }else return Formatacao.formatarFloatString(listaCambio.get(rowIndex).getValor());
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
         }else return String.class;
    }
    
}
