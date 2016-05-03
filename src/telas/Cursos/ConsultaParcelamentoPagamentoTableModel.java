/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Parcelamentopagamento;
import util.Formatacao;


/**
 *
 * @author Wolverine
 */
public class ConsultaParcelamentoPagamentoTableModel extends AbstractTableModel{
    
    private List<Parcelamentopagamento> listaParcelamento;
    private String[] colunas ={"Forma de Pagamento", "Tipo Parcelmento", "Valor a Parcelar", "Nº Parcelas", "Valor da Parcela"};

    public ConsultaParcelamentoPagamentoTableModel(List<Parcelamentopagamento> listaParcelamento) {
        this.listaParcelamento = listaParcelamento;
    }

    @Override
    public int getRowCount() {
        return listaParcelamento.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaParcelamento.get(rowIndex).getFormaPagamento();
        }else if (columnIndex==1){
            return listaParcelamento.get(rowIndex).getTipoParcelmaneto();
        }else if (columnIndex==2){
            return Formatacao.formatarFloatString(listaParcelamento.get(rowIndex).getValorParcelamento());
        }else if (columnIndex==3){
            return String.valueOf(listaParcelamento.get(rowIndex).getNumeroParcelas());
        }else return Formatacao.formatarFloatString(listaParcelamento.get(rowIndex).getValorParcela());
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
         }else if (columnIndex==2){
             return  String.class;
         }else if (columnIndex==3){
             return String.class;
         }else return String.class;
    }
    
    
    
}
