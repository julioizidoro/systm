/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProdutosOrcamento;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produtosorcamento;


/**
 *
 * @author Wolverine
 */
public class ConsultaProdutosOrcamentoTableModel extends AbstractTableModel{
    
    private List<Produtosorcamento> listaProduto;
    private String[] colunas ={"Código", "Descrição"};

    public ConsultaProdutosOrcamentoTableModel(List<Produtosorcamento> listaProduto) {
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
            return listaProduto.get(rowIndex).getIdprodutosOrcamento();
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
