/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Produto;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produtos;


/**
 *
 * @author Wolverine
 */
public class ConsultaProdutoTableModel extends AbstractTableModel{
    
    private List<Produtos> listaProduto;
    private String[] colunas ={"Código", "Descrição"};

    public ConsultaProdutoTableModel(List<Produtos> listaProduto) {
        this.listaProduto = listaProduto;
    }

    @Override
    public int getRowCount() {
        return listaProduto.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaProduto.get(rowIndex).getIdprodutos();
        }else return listaProduto.get(rowIndex).getDescricao();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return String.class;
         }else return  String.class;
    }
    
    
    
}
