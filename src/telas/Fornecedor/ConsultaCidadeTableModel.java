/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cidade;

/**
 *
 * @author Wolverine
 */
public class ConsultaCidadeTableModel extends AbstractTableModel{
    
    private List<Cidade> listaCidade;
    private String[] colunas ={"Nome"};

    public ConsultaCidadeTableModel(List<Cidade> listaCidade) {
        this.listaCidade = listaCidade;
    }

    

    @Override
    public int getRowCount() {
        return listaCidade.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaCidade.get(rowIndex).getNome();
        }else return " ";
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
            return String.class;
        }else return String.class;
    }
    
    
    
    
    
    
}
