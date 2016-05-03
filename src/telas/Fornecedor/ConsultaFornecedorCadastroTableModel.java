/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Fornecedor;

/**
 *
 * @author Wolverine
 */
public class ConsultaFornecedorCadastroTableModel extends AbstractTableModel{
    
    private List<Fornecedor> listaFornecedor;
    private String[] colunas ={"id", "Nome"};

    public ConsultaFornecedorCadastroTableModel(List<Fornecedor> listaFornecedor) {
        this.listaFornecedor = listaFornecedor;
    }

    @Override
    public int getRowCount() {
        return listaFornecedor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaFornecedor.get(rowIndex).getIdfornecedor();
        }else return listaFornecedor.get(rowIndex).getNome();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Integer.class;
         }else return String.class;
    }
    
    
    
}
