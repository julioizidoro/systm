/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Voluntariado;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.view.Viewvendascurso;
import model.view.Viewvendasvoluntariado;


/**
 *
 * @author Wolverine
 */
public class ConsultaVendasTableModel extends AbstractTableModel{
    
    private List<Viewvendasvoluntariado> listaVendas;
    private String[] colunas ={"Situação", "Nome do Cliente", "Data Venda", "Projeto Voluntáriado", "Unidade", "Consultor"};

    public ConsultaVendasTableModel(List<Viewvendasvoluntariado> listaVendas) {
        this.listaVendas = listaVendas;
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return carregarImagem(listaVendas.get(rowIndex).getSituacao());
        }else if (columnIndex==1){
            return listaVendas.get(rowIndex).getNomeCliente();
        }else if (columnIndex==2){
            return listaVendas.get(rowIndex).getDataVenda();
        }else if (columnIndex==3){
            return listaVendas.get(rowIndex).getProjetoVoluntariado();
        }else if (columnIndex==4){
            return listaVendas.get(rowIndex).getNomeFantasia();
        }else return listaVendas.get(rowIndex).getNomeUsuario();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Image.class;
         }else if (columnIndex==1){
             return String.class;
         }else if (columnIndex==2){
             return  Date.class;
         }else if (columnIndex==3){
             return  String.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    public Icon carregarImagem(String situacao) {
        if (situacao.equalsIgnoreCase("PROCESSO")) {
            URL urlVermelha = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            if (situacao.equalsIgnoreCase("FINALIZADA")) {
                URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            }else {
                URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            }
        }
    }
}
