/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos.Controle;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.view.Viewcontrolecursos;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaControleCursosTableModel extends AbstractTableModel{
    
    private List<Viewcontrolecursos> listaVendas;
    private String[] colunas ={"Situação", "Doc", "Data Embarque", "Data Inscrição", "Início Curso", "Nome Cliente","Escola/Instituição", "E-mail", "Idade", "Telefone", "Unidade", "Consultor"};

    public ConsultaControleCursosTableModel(List<Viewcontrolecursos> listaVendas) {
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
            return listaVendas.get(rowIndex).getDocanexado();
        }else if (columnIndex==2){
            if (listaVendas.get(rowIndex).getDataEmbarque()==null){
                return " ";
            }else return Formatacao.ConvercaoDataPadrao(listaVendas.get(rowIndex).getDataEmbarque());
        }else if (columnIndex==3){
            return listaVendas.get(rowIndex).getDataInscricao();
        }else if (columnIndex==4){
            return listaVendas.get(rowIndex).getDataInicio();
        }else if (columnIndex==5){
            return listaVendas.get(rowIndex).getNomeCliente();
        }else if (columnIndex==6){
            return listaVendas.get(rowIndex).getNomefornecedor();
        }else if (columnIndex==7){
            return listaVendas.get(rowIndex).getEmail();
        }else if (columnIndex==8){
            if (listaVendas.get(rowIndex).getDataNascimento()==null){
                return "0 anos";
            }else return Formatacao.calcularIdade(listaVendas.get(rowIndex).getDataNascimento()) + " anos";
        }else if (columnIndex==9){
            return listaVendas.get(rowIndex).getFoneCelular();
        }else if (columnIndex==10){
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
            return String.class;
        }else if (columnIndex==3){
             return Date.class;
         }else if (columnIndex==4){
             return  Date.class;
         }else if (columnIndex==5){
             return  String.class;
         }else if (columnIndex==6){
             return String.class;
         }else if (columnIndex==7){
             return String.class;
         }else if (columnIndex==8){
             return String.class;
         }else if (columnIndex==9){
             return String.class;
         }else if (columnIndex==10){
             return String.class;
         }else return String.class;
    }
    
    public Icon carregarImagem(String situacao) {
        if (situacao.equalsIgnoreCase("Processo")) {
            URL urlAzul = this.getClass().getResource("/imagens/bolas/bolaAzul.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAzul);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("Standby")) {
            URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("Embarcado")) {
            URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            URL urlPreta = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlPreta);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        }
    }
    
    
}
