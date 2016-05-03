/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Coeficiente;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Coeficientejuros;

/**
 *
 * @author Wolverine
 */
public class ConsultaCoeficienteTableModel extends AbstractTableModel{
    
    List<Coeficientejuros> lista;
    private String[] colunas ={"Numero de Parcelas", "Coeficiente"};

    public ConsultaCoeficienteTableModel(List<Coeficientejuros> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return lista.get(rowIndex).getNumeroParcelas();
        }else return lista.get(rowIndex).getCoeficiente();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Integer.class;
         }else return Double.class;
    }
    
    
    
}
