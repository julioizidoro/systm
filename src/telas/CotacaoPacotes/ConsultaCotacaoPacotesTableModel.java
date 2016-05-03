/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.CotacaoPacotes;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.view.Viewconsultacotacaopacote;


/**
 *
 * @author Wolverine
 */
public class ConsultaCotacaoPacotesTableModel extends AbstractTableModel{
    
    private List<Viewconsultacotacaopacote> listaCotacao;
    private String[] colunas ={"Situação", "Tipo de Pacote", "Data Solicitação", "Hora Solicitação",  "Origem Cliente", "Cliente"};

    public ConsultaCotacaoPacotesTableModel(List<Viewconsultacotacaopacote> listaCotacao) {
        this.listaCotacao = listaCotacao;
    }

    @Override
    public int getRowCount() {
        return listaCotacao.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return carregarImagem(listaCotacao.get(rowIndex).getSituacao());
        }else if (columnIndex==1){
            if (listaCotacao.get(rowIndex).getTipoPacote().equalsIgnoreCase("C")){
                return "COMPLETO";
            }else return "TERRESTRE";
        }else if (columnIndex==2){
            return listaCotacao.get(rowIndex).getDataSolicitacao();
        }else if (columnIndex==3){
            return listaCotacao.get(rowIndex).getHoraSolicitacao();
        }else if (columnIndex==4){
            return listaCotacao.get(rowIndex).getOrgiemCliente();
        }else return listaCotacao.get(rowIndex).getCliente();
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
             return Date.class;
         }else if (columnIndex==3){
             return  String.class;
         }else if (columnIndex==4){
             return  String.class;
         }else return String.class;
    }
    
    public Icon carregarImagem(String situacao) {
        if (situacao.equalsIgnoreCase("Pendente")) {
            URL urlAzul = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAzul);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("Finalizada")) {
            URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("Cancelada")) {
            URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            URL urlPreta = this.getClass().getResource("/imagens/bolas/bolaPreta.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlPreta);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        }
    }
    
}
