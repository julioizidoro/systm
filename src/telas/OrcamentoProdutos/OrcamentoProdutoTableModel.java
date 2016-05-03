/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoProdutos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class OrcamentoProdutoTableModel extends AbstractTableModel{
    
    List<OrcamentoProdutoBean> listaProduto;
    private String[] colunas ={"Fornecedor", "Cidade", "País", "Câmbio", "Valor Estrangeira","Valor Real"};

    public OrcamentoProdutoTableModel(List<OrcamentoProdutoBean> listaProduto) {
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
            return listaProduto.get(rowIndex).getNomeFornecedor();
        }else if (columnIndex==1){
            return listaProduto.get(rowIndex).getCidadeFornecedor();
        }else if (columnIndex==2){
            return listaProduto.get(rowIndex).getPaisFornecedor();
        }else if (columnIndex==3){
            return Formatacao.formatarFloatString(listaProduto.get(rowIndex).getValorCambio());
        }else if (columnIndex==4){
            return Formatacao.formatarFloatString(listaProduto.get(rowIndex).getValorMoedaEstrangeira());
        }else return Formatacao.formatarFloatString(listaProduto.get(rowIndex).getValorMoedaNacional());
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
            return String.class;
        }else if (columnIndex==2){
             return String.class;
         }else if (columnIndex==3){
             return  String.class;
         }else if (columnIndex==4){
             return  String.class;
         }else return String.class;
    }
    
    
    
}
