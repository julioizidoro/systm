/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.UnidadeNegocio;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Unidadenegocio;

/**
 *
 * @author Wolverine
 */
public class ConsultaUnidadeNegocioTableModel extends AbstractTableModel{
    
    List<Unidadenegocio> listaUnidadeNegocio;
    private String[] colunas ={"Nome Fantasia", "Telefone", "E-mail"};

    public ConsultaUnidadeNegocioTableModel(List<Unidadenegocio> listaUnidadeNegocio) {
        this.listaUnidadeNegocio = listaUnidadeNegocio;
    }

    @Override
    public int getRowCount() {
        return listaUnidadeNegocio.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaUnidadeNegocio.get(rowIndex).getNomeFantasia();
        }else if (columnIndex==1){
            return listaUnidadeNegocio.get(rowIndex).getFone();
        }else return listaUnidadeNegocio.get(rowIndex).getEmail();
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
