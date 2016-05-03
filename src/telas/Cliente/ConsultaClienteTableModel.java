/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cliente;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewcliente;

/**
 *
 * @author Wolverine
 */
public class ConsultaClienteTableModel extends AbstractTableModel{
    
    private List<Viewcliente> listaCliente;
    private String[] colunas ={"Id", "Nome", "Data Nascimento", "Fone Residencial", "Fone Celular", "Unidade"};

    public ConsultaClienteTableModel(List<Viewcliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public int getRowCount() {
        return listaCliente.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaCliente.get(rowIndex).getIdcliente();
        }else if (columnIndex==1){
            return listaCliente.get(rowIndex).getNome();
        }else if (columnIndex==2){
            return listaCliente.get(rowIndex).getDatanascimento();
        }else if (columnIndex==3){
            return listaCliente.get(rowIndex).getFoneResidencial();
        }else if (columnIndex==4){
            return listaCliente.get(rowIndex).getFoneCelular();
        }else return listaCliente.get(rowIndex).getNomeFantasia();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
            return Integer.class;
        }else if (columnIndex==1){
             return String.class;
         }else if (columnIndex==2){
             return  Date.class;
         }else if (columnIndex==3){
             return String.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    
    
}
