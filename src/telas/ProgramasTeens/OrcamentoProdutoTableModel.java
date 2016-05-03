/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProgramasTeens;

import telas.Cursos.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class OrcamentoProdutoTableModel extends AbstractTableModel{
    
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoBean;
    private String[] colunas ={"Descrição", "Moeda Estrangeira", "Moeda R$"};

    public OrcamentoProdutoTableModel(List<ProdutoOrcamentoBean> listaProdutoOrcamentoBean) {
        this.listaProdutoOrcamentoBean = listaProdutoOrcamentoBean;
    }

    @Override
    public int getRowCount() {
        return listaProdutoOrcamentoBean.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaProdutoOrcamentoBean.get(rowIndex).getDescricaoProdutoOrcamento();
        }else if (columnIndex==1){
            return Formatacao.formatarFloatString(listaProdutoOrcamentoBean.get(rowIndex).getValorMoedaEstrangeira());
        }else return Formatacao.formatarFloatString(listaProdutoOrcamentoBean.get(rowIndex).getValorMoedaReal());
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
