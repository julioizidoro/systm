/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewfornecedorproduto;

/**
 *
 * @author Wolverine
 */
public class ConsultaProdutoFornecedorTableModel extends AbstractTableModel{
    
    private List<Viewfornecedorproduto> listaFornecedor;
    private String[] colunas ={"Razão Social", "Cidade", "País", "Produto"};

    public ConsultaProdutoFornecedorTableModel(List<Viewfornecedorproduto> listaFornecedor) {
        this.listaFornecedor = listaFornecedor;
    }

    @Override
    public int getRowCount() {
        return listaFornecedor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaFornecedor.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaFornecedor.get(rowIndex).getCidade();
        }else if (columnIndex==2){
            return listaFornecedor.get(rowIndex).getPais();
        }else return listaFornecedor.get(rowIndex).getDescricao();
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
         }else if(columnIndex==2){
             return String.class;
         }else return String.class;
    }
}
