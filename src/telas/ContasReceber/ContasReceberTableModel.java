/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ContasReceber;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Contasreceber;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ContasReceberTableModel extends AbstractTableModel{
    
    private List<Contasreceber> listaContas;
    private String[] colunas ={"Nº Documento", "Nº Parcela", "Valor Parcela"};

    public ContasReceberTableModel(List<Contasreceber> listaContas) {
        this.listaContas = listaContas;
    }

    @Override
    public int getRowCount() {
        return listaContas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaContas.get(rowIndex).getNumerodocumento();
        }else if (columnIndex==1){
            return listaContas.get(rowIndex).getDatavencimento();
        }else return Formatacao.formatarFloatString(listaContas.get(rowIndex).getValorparcela());
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
         }else return String.class;
    }
    
    
    
}
