/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pais;

/**
 *
 * @author Wolverine
 */
public class ConsultaPaisTableModel extends AbstractTableModel{
    
    private List<Pais> listaPais;
    private String[] colunas ={"Nome", "Sigla", "Moeda"};

    public ConsultaPaisTableModel(List<Pais> listaPais) {
        this.listaPais = listaPais;
    }


    @Override
    public int getRowCount() {
        return listaPais.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaPais.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaPais.get(rowIndex).getSigla();
        }else return listaPais.get(rowIndex).getMoedas().getSigla();
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
