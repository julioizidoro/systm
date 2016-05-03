/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.SeguroViagem;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewvendasseguro;


/**
 *
 * @author Wolverine
 */
public class ConsultaVendasTableModel extends AbstractTableModel{
    
    private List<Viewvendasseguro> listaVendas;
    private String[] colunas ={"Nome do Cliente", "Data Venda", "Plano", "Unidade", "Consultor"};

    public ConsultaVendasTableModel(List<Viewvendasseguro> listaVendas) {
        this.listaVendas = listaVendas;
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaVendas.get(rowIndex).getNomeCliente();
        }else if (columnIndex==1){
            return listaVendas.get(rowIndex).getDataVenda();
        }else if (columnIndex==2){
            return listaVendas.get(rowIndex).getPlano();
        }else if (columnIndex==3){
            return listaVendas.get(rowIndex).getNomeFantasia();
        }else return listaVendas.get(rowIndex).getNomeConsultor();
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
             return  Date.class;
         }else if (columnIndex==2){
             return  String.class;
         }if (columnIndex==3){
             return String.class;
         }else return String.class;
    }
    
    
    
}
