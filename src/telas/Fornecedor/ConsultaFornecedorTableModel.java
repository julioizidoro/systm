/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Fornecedor;
import model.view.Viewfornecedor;

/**
 *
 * @author Wolverine
 */
public class ConsultaFornecedorTableModel extends AbstractTableModel{
    
    private List<Viewfornecedor> listaFornecedor;
    private String[] colunas ={"Nome", "Cidade", "País"};

    public ConsultaFornecedorTableModel(List<Viewfornecedor> listaFornecedor) {
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
            return listaFornecedor.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaFornecedor.get(rowIndex).getCidade();
        }else return listaFornecedor.get(rowIndex).getPais();
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
