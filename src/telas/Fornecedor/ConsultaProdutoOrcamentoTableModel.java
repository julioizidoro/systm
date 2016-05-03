/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Fornecedorcomissaocursoproduto;
import model.Produtosorcamento;

/**
 *
 * @author Wolverine
 */
public class ConsultaProdutoOrcamentoTableModel extends AbstractTableModel{
    
    private List<Fornecedorcomissaocursoproduto> listaProduto;
    private String[] colunas ={"Descrição"};

    public ConsultaProdutoOrcamentoTableModel(List<Fornecedorcomissaocursoproduto> listaProduto) {
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
            return listaProduto.get(rowIndex).getProdutosorcamento().getDescricao();
        }else return "";
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
