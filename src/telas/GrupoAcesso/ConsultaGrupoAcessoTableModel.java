/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.GrupoAcesso;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Grupoacesso;

/**
 *
 * @author Wolverine
 */
public class ConsultaGrupoAcessoTableModel extends AbstractTableModel{
    
    private List<Grupoacesso> listaGrupo;
    private String[] colunas ={"Código", "Descricao"};

    public ConsultaGrupoAcessoTableModel(List<Grupoacesso> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }

    @Override
    public int getRowCount() {
        return listaGrupo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            return listaGrupo.get(rowIndex).getIdgrupoAcesso();
        }else return listaGrupo.get(rowIndex).getDescricao();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Integer.class;
         }else return  String.class;
    }
}
