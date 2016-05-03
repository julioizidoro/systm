/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.ArquivosController;
import controller.NotificacaoEmailController;
import controller.ParametrosProdutosController;
import controller.UsuarioController;
import java.io.File;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Parametrosprodutos;
import model.Usuario;
import model.Vendas;
import model.view.Viewnotificacaoemail;
import model.view.Viewtipoarquivousuario;

/**
 *
 * @author Wolverine
 */
public class Formatacao {

    public static String ConvercaoStringData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String emailSenha;
    private String emailUsuario;
    
    public static String ConvercaoDataSql(Date data) {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        String dataFormatada = df.format(data);
        return dataFormatada;
    }
    
    public static String ConvercaoDataPadrao(Date data) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = df.format(data);
        return dataFormatada;
    }
    
    public static String formatarFloatString(Float valor){
        NumberFormat format = new DecimalFormat("#,##0.00"); 
        format.setMinimumFractionDigits(2);
        String valorFormatado = format.format(valor);
        return valorFormatado;
    }
    
    public static String formatarDoubleString(Double valor){
        NumberFormat format = new DecimalFormat("#,##0.00"); 
        format.setMinimumFractionDigits(2);
        String valorFormatado = format.format(valor);
        return valorFormatado;
    }
    
    public static String formatarValorCambio(Float valor){
        NumberFormat format = new DecimalFormat("#,##0.0000"); 
        format.setMinimumFractionDigits(4);
        String valorFormatado = format.format(valor);
        return valorFormatado;
    }
    
    public static Float formatarStringfloat(String valor){
        String novoValor = "";
        for(int i=0;i<valor.length();i++){
            if (valor.charAt(i)==','){
                novoValor = novoValor + ".";
            }else if (!(valor.charAt(i)=='.')){
                novoValor = novoValor + valor.charAt(i);
            }
        }
        return Float.parseFloat(novoValor);
    }
    
    public static Double formatarStringDouble(String valor) {
        String novoValor = "";
        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) == ',') {
                novoValor = novoValor + ".";
            } else if (!(valor.charAt(i) == '.')) {
                novoValor = novoValor + valor.charAt(i);
            }
        }
        return Double.parseDouble(novoValor);
    }
    
    public static JComboBox preencherComobox(List lista, JComboBox combo, boolean nulo, String valorNulo){
        if (nulo){
            combo.addItem(valorNulo);
        }
        for (int i=0;i<lista.size();i++){
            combo.addItem(lista.get(i));
        }
        return combo;
    }
    
    public static String SenhaString(char[] s){
        String senha="";
        for (int i=0;i<s.length;i++){
            senha+= s[i];
        }
        return senha;
  }
    
  public static Integer calcularNumeroSemanas(Date dataInicial, Date dataFinal){
      int resultado =0;
      resultado =  (int)((dataFinal.getTime() - dataInicial.getTime()) / 86400000L);
      int numeroSemanas = (resultado % 7);
      if (numeroSemanas>0){
          numeroSemanas = resultado / 7;
          numeroSemanas = numeroSemanas + 1;
      }
      return numeroSemanas;
  }
  
  public static Date calcularDataFinal(Date dataInicial, int numeroSemanas){
       SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
       Calendar c = new GregorianCalendar();
       c.setTime(dataInicial);
       numeroSemanas = numeroSemanas * 7;
       numeroSemanas = numeroSemanas - 1;
       if (numeroSemanas>0){
            c.add(Calendar.DAY_OF_MONTH, numeroSemanas);
       }
       return (c.getTime());
  } 
  
  public static Date calcularDataFinalDias(Date dataInicial, int numeroSemanas){
       SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
       Calendar c = new GregorianCalendar();
       c.setTime(dataInicial);
       numeroSemanas = numeroSemanas;
       if (numeroSemanas>0){
            c.add(Calendar.DAY_OF_MONTH, numeroSemanas);
       }
       return (c.getTime());
  } 
  
  public static String valorPorExtenso(double vlr) {
    if (vlr == 0)
       return("ZERO");
    String ve = String.valueOf(vlr);
    String nve = "";
    for (int i=0;i<ve.length();i++){
        if (ve.charAt(i)!='.'){
            nve = nve + ve.charAt(i);
        }else {
            int numeroI = ve.length()-i;
            if (numeroI>3){
                nve = nve + ve.charAt(i) + ve.substring(i+1, i+4);
            }else {
                if (numeroI==2){
                    nve = nve + ve.charAt(i) + ve.substring(i+1, i+2);
                }else {
                    if (numeroI==3){
                        nve = nve + ve.charAt(i) + ve.substring(i+1, i+3);
                    }
                }
            }
            
            i=1000;
        }
    }
    vlr = Double.parseDouble(nve);
    long inteiro = (long)Math.abs(vlr); // parte inteira do valor
    double resto = vlr - inteiro;       // parte fracionária do valor
    String vresto = String.valueOf(resto);
    if (vresto.length()>5){
        vresto = vresto.substring(0, 5);
    }
    double valorvResto = Double.parseDouble(vresto);
    if (valorvResto>0.990){
        resto =0.0;
        inteiro = inteiro + 1;
    }else{
        resto = Double.parseDouble(vresto);
    }
    
    
 
    String vlrS = String.valueOf(inteiro);
    if (vlrS.length() > 15)
       return("Erro: valor superior a 999 trilhões.");
 
    String s = "", saux, vlrP;
    String centavos = String.valueOf((int)Math.round(resto * 100));
 
    String[] unidade = {"", "UM", "DOIS", "TRÊS", "QUATRO", "CINCO",
             "SEIS", "SETE", "OITO", "NOVE", "DEZ", "ONZE",
             "DOZE", "TREZE", "QUATORZE", "QUINZE", "DEZESSEIS",
             "DEZESSETE", "DEZOITO", "DEZENOVE"};
    String[] centena = {"", "CENTO", "DUZENTOS", "TREZENTOS",
             "QUATROCENTOS", "QUINHENTOS", "SEISCENTOS",
             "SETECENTOS", "OITOCENTOS", "NOVECENTOS"};
    String[] dezena = {"", "", "VINTE", "TRINTA", "QUARENTA", "CINQUENTA",
             "SESSENTA", "SETENTA", "OITENTA", "NOVENTA"};
    String[] qualificaS = {"", "MIL", "MILHÃO", "BILHÃO", "TRILHÃO"};
    String[] qualificaP = {"", "MIL", "MILHÕES", "BILHÕES", "TRILHÕES"};

 
// definindo o extenso da parte inteira do valor
    int n, unid, dez, cent, tam, i = 0;
    boolean umReal = false, tem = false;
    while (!vlrS.equals("0")) {
      tam = vlrS.length();
// retira do valor a 1a. parte, 2a. parte, por exemplo, para 123456789:
// 1a. parte = 789 (centena)
// 2a. parte = 456 (mil)
// 3a. parte = 123 (milhões)
      if (tam > 3) {
         vlrP = vlrS.substring(tam-3, tam);
         vlrS = vlrS.substring(0, tam-3);
      }
      else { // última parte do valor
        vlrP = vlrS;
        vlrS = "0";
      }
      if (!vlrP.equals("000")) {
         saux = "";
         if (vlrP.equals("100"))
            saux = "CEM";
         else {
           n = Integer.parseInt(vlrP, 10);  // para n = 371, tem-se:
           cent = n / 100;                  // cent = 3 (centena trezentos)
           dez = (n % 100) / 10;            // dez  = 7 (dezena setenta)
           unid = (n % 100) % 10;           // unid = 1 (unidade um)
           if (cent != 0)
              saux = centena[cent];
           if ((n % 100) <= 19) {
              if (saux.length() != 0)
                 saux = saux + " E " + unidade[n % 100];
              else saux = unidade[n % 100];
           }
           else {
              if (saux.length() != 0)
                 saux = saux + " E " + dezena[dez];
              else saux = dezena[dez];
              if (unid != 0) {
                 if (saux.length() != 0)
                    saux = saux + " E " + unidade[unid];
                 else saux = unidade[unid];
              }
           }
         }
         if (vlrP.equals("1") || vlrP.equals("001")) {
            if (i == 0) // 1a. parte do valor (um real)
               umReal = true;
            else saux = saux + " " + qualificaS[i];
         }
         else if (i != 0)
                 saux = saux + " " + qualificaP[i];
         if (s.length() != 0)
            s = saux + ", " + s;
         else s = saux;
      }
      if (((i == 0) || (i == 1)) && s.length() != 0)
         tem = true; // tem centena ou mil no valor
      i = i + 1; // próximo qualificador: 1- mil, 2- milhão, 3- bilhão, ...
    }
 
    if (s.length() != 0) {
       if (umReal)
          s = s + " REAL";
       else if (tem)
               s = s + " REAIS";
            else s = s + " DE REAIS";
    }
 
// definindo o extenso dos centavos do valor
    if (!centavos.equals("0")) { // valor com centavos
       if (s.length() != 0) // se não é valor somente com centavos
          s = s + " E ";
       if (centavos.equals("1"))
          s = s + "UM CENTAVO";
       else {
         n = Integer.parseInt(centavos, 10);
         if (n <= 19)
            s = s + unidade[n];
         else {             // para n = 37, tem-se:
           unid = n % 10;   // unid = 37 % 10 = 7 (unidade sete)
           dez = n / 10;    // dez  = 37 / 10 = 3 (dezena trinta)
           
           s = s + dezena[dez];
           if (unid != 0)
              s = s + " E " + unidade[unid];
         }
         s = s + " CENTAVOS";
       }
    }
    return(s);
  }
  
  public static boolean validaCPF(String s_aux) {
        String ncpf = "";
        for (int i=0;i<s_aux.length();i++){
           if ((s_aux.charAt(i)!='.') && (s_aux.charAt(i)!='-')){
                ncpf+=s_aux.charAt(i);
           }
        }
        s_aux=ncpf;

//------- Rotina para CPF
        if (s_aux.length() == 11) {
            int d1, d2;
            int digito1, digito2, resto;
            int digitoCPF;
            String nDigResult;
            d1 = d2 = 0;
            digito1 = digito2 = resto = 0;
            for (int n_Count = 1; n_Count < s_aux.length() - 1; n_Count++) {
                digitoCPF = Integer.valueOf(s_aux.substring(n_Count - 1, n_Count)).intValue();
//--------- Multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
                d1 = d1 + (11 - n_Count) * digitoCPF;
//--------- Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
                d2 = d2 + (12 - n_Count) * digitoCPF;
            }
            
//--------- Primeiro resto da divisão por 11.
            resto = (d1 % 11);
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }
            d2 += 2 * digito1;
//--------- Segundo resto da divisão por 11.
            resto = (d2 % 11);
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }
//--------- Digito verificador do CPF que está sendo validado.
            String nDigVerific = s_aux.substring(s_aux.length() - 2, s_aux.length());
//--------- Concatenando o primeiro resto com o segundo.
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
//--------- Comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
            return nDigVerific.equals(nDigResult);
        } //-------- Rotina para CNPJ
        else if (s_aux.length() == 14) {
            int soma = 0;
            int aux=0;
            int dig=0;
            String cnpj_calc = s_aux.substring(0, 12);
            char[] chr_cnpj = s_aux.toCharArray();
//--------- Primeira parte
            for (int i = 0; i < 4; i++) {
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                    soma += (chr_cnpj[i]) - 4 * (6 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                    soma += (chr_cnpj[i + 4]) - 4 * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
//--------- Segunda parte
            soma = 0;
            for (int i = 0; i < 5; i++) {
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                    soma += (chr_cnpj[i]) - 4 * (7 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                    soma += (chr_cnpj[i + 5]) - 4 * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
            return s_aux.equals(cnpj_calc);
        } else {
            return false;
        }
    }
  

  
  
  public void enviarEmailNotificacaoProduto(int idProduto, String texto, String tipoAviso) {
      NotificacaoEmailController notificacaoEmailController = new NotificacaoEmailController();
      List<Viewnotificacaoemail> listaNotificacao = notificacaoEmailController.listar(idProduto, tipoAviso);
      if (listaNotificacao != null) {
          InternetAddress[] listaEmail = new InternetAddress[listaNotificacao.size()];
          try {
              for (int i = 0; i < listaNotificacao.size(); i++) {
                  listaEmail[i] = new InternetAddress(listaNotificacao.get(i).getEmail());
              }
          } catch (AddressException ex) {
              Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println(ex);
          }
          try {
              this.emailSenha = "20SimpleS78";
              this.emailUsuario = "ti@travelmate.com.br";
              Properties p = new Properties();
              p.put("mail.smtp.host", "smtp.travelmate.com.br");
              p.put("mail.smtp.port", 587);
              p.put("mail.smtp.auth", "true");

              Session session = Session.getDefaultInstance(p, new Auth());

              MimeMessage msg = new MimeMessage(session);
              msg.setFrom(new InternetAddress("systm@travelmate.com.br"));

              msg.setRecipients(Message.RecipientType.TO, listaEmail);

              msg.setSubject("Informativo SysTM");
              msg.setContent(texto, "text/html");
              //msg.setText(texto);



              MimeMultipart mpRoot = new MimeMultipart("mixed");
              MimeMultipart mpContent = new MimeMultipart("alternative");
              MimeBodyPart contentPartRoot = new MimeBodyPart();
              contentPartRoot.setContent(mpContent);
              mpRoot.addBodyPart(contentPartRoot);

              //enviando texto  
              MimeBodyPart mbp1 = new MimeBodyPart();
              mbp1.setText(texto);
              mpContent.addBodyPart(mbp1);




              msg.setContent(mpRoot);
              msg.saveChanges();

              Transport.send(msg);
          } catch (Exception e) {
          }
      }
    }
  
  public void enviarEmailPINCambio(String texto, String email) {
        InternetAddress[] listaEmail = new InternetAddress[1];
        try {
            listaEmail[0] = new InternetAddress(email);
        } catch (AddressException ex) {
            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.emailSenha = "20SimpleS78";
            this.emailUsuario = "ti@travelmate.com.br";
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.travelmate.com.br");
            p.put("mail.smtp.port", 587);
            p.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(p, new Auth());

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("systm@travelmate.com.br"));

            msg.setRecipients(Message.RecipientType.TO, listaEmail);

            msg.setSubject("PIN de Alteração de Câmbio");
            msg.setContent(texto, "text/html");
              //msg.setText(texto);

            MimeMultipart mpRoot = new MimeMultipart("mixed");
            MimeMultipart mpContent = new MimeMultipart("alternative");
            MimeBodyPart contentPartRoot = new MimeBodyPart();
            contentPartRoot.setContent(mpContent);
            mpRoot.addBodyPart(contentPartRoot);

            //enviando texto  
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(texto);
            mpContent.addBodyPart(mbp1);

            msg.setContent(mpRoot);
            msg.saveChanges();

            Transport.send(msg);
        } catch (Exception e) {
        }
    }

    
    private class Auth extends Authenticator{
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(emailUsuario, emailSenha);
        }
    }
    
    public static String SubtarirDatas(Date data, int dias, String formato) throws Exception{
       SimpleDateFormat sd = new SimpleDateFormat(formato);
       Calendar c = new GregorianCalendar();
       c.setTime(data);
       int dobroDias = dias * 2;
       int contaDias = dias - dobroDias;
       c.add(Calendar.DAY_OF_MONTH, contaDias);
       return sd.format(c.getTime());
  }
    
  public static String retornaDataInicia(int mes){
      if (mes==1){
          return "01-01";
      }else if (mes==2){
          return "02-01";
      }else if (mes==3){
          return "02-01";
      }else if (mes==4){
          return "04-01";
      }else if (mes==5){
          return "05-01";
      }else if (mes==6){
          return "06-01";
      }else if (mes==7){
          return "07-01";
      }else if (mes==8){
          return "08-01";
      }else if (mes==9){
          return "09-01";
      }else if (mes==10){
          return "10-01";
      }else if (mes==11){
          return "11-01";
      }else if (mes==12){
          return "12-01";
      }else return "0";
  }

  public static String retornaDataFinal(int mes){
      if (mes==1){
          return "01-31";
      }else if (mes==2){
          return "02-28";
      }else if (mes==3){
          return "02-31";
      }else if (mes==4){
          return "04-30";
      }else if (mes==5){
          return "05-31";
      }else if (mes==6){
          return "06-30";
      }else if (mes==7){
          return "07-31";
      }else if (mes==8){
          return "08-31";
      }else if (mes==9){
          return "09-30";
      }else if (mes==10){
          return "10-31";
      }else if (mes==11){
          return "11-30";
      }else if (mes==12){
          return "12-31";
      }else return "0";
  }
  
   public static String retornaDataFinalBarras(int mes){
      if (mes==1){
          return "01/31";
      }else if (mes==2){
          return "02/28";
      }else if (mes==3){
          return "02/31";
      }else if (mes==4){
          return "04/30";
      }else if (mes==5){
          return "05/31";
      }else if (mes==6){
          return "06/30";
      }else if (mes==7){
          return "07/31";
      }else if (mes==8){
          return "08/31";
      }else if (mes==9){
          return "09/30";
      }else if (mes==10){
          return "10/31";
      }else if (mes==11){
          return "11/30";
      }else if (mes==12){
          return "12/31";
      }else return "0";
  }
  
  public static String nomeMes(int mes){
      if (mes==1){
          return "JANEIRO";
      }else if (mes==2){
          return "FEVEREIRO";
      }else if (mes==3){
          return "MARÇO";
      }else if (mes==4){
          return "ABRIL";
      }else if (mes==5){
          return "MAIO";
      }else if (mes==6){
          return "JUNHO";
      }else if (mes==7){
          return "JULHO";
      }else if (mes==8){
          return "AGOSTO";
      }else if (mes==9){
          return "SETEMBRO";
      }else if (mes==10){
          return "OUTUBRO";
      }else if (mes==11){
          return "NOVEMBRO";
      }else if (mes==12){
          return "DEZEMBRO";
      }else return "nao encontrado";
  }
  
  public static String nomeMes(String mes){
      if (mes.equalsIgnoreCase("Janeiro")){
          return "01";
      }else if (mes.equalsIgnoreCase("Fevereiro")){
          return "02";
      }else if (mes.equalsIgnoreCase("Março")){
          return "03";
      }else if (mes.equalsIgnoreCase("Abril")){
          return "04";
      }else if (mes.equalsIgnoreCase("Maio")){
          return "05";
      }else if (mes.equalsIgnoreCase("Junho")){
          return "06";
      }else if (mes.equalsIgnoreCase("Julho")){
          return "07";
      }else if (mes.equalsIgnoreCase("Agosto")){
          return "08";
      }else if (mes.equalsIgnoreCase("Setembro")){
          return "09";
      }else if (mes.equalsIgnoreCase("Outubro")){
          return "10";
      }else if (mes.equalsIgnoreCase("Novembro")){
          return "11";
      }else if (mes.equalsIgnoreCase("Dezembro")){
          return "12";
      }else return "nao encontrado";
  }
  
  public static int subtrairDatas(Date dataInicial, Date dataFinal){
      int resultado =0;
      resultado =  (int)((dataInicial.getTime() - dataFinal.getTime()) / 86400000L);
      return resultado;
  }
  
  public static String foramtarHoraString(){
      DateFormat formato = new SimpleDateFormat("HH:mm:ss");  
      String formattedDate = formato.format(new Date());  
      return formattedDate;
  }
  
  public static int retornaNumeroMes(String mes){
      if (mes.equalsIgnoreCase("Janeiro")){
          return 1;
      }else if (mes.equalsIgnoreCase("Fevereiro")){
          return 2;
      }else if (mes.equalsIgnoreCase("Março")){
          return 3;
      }else if (mes.equalsIgnoreCase("Abril")){
          return 4;
      }else if (mes.equalsIgnoreCase("Maio")){
          return 5;
      }else if (mes.equalsIgnoreCase("Junho")){
          return 6;
      }else if (mes.equalsIgnoreCase("Julho")){
          return 7;
      }else if (mes.equalsIgnoreCase("Agosto")){
          return 8;
      }else if (mes.equalsIgnoreCase("Setembro")){
          return 9;
      }else if (mes.equalsIgnoreCase("Outubro")){
          return 10;
      }else if (mes.equalsIgnoreCase("Novembro")){
          return 11;
      }else if (mes.equalsIgnoreCase("Dezembro")){
          return 12;
      }else return 0;
  }
  
  public static int diaSemana(Date data){
       Calendar calendario = new GregorianCalendar();
       calendario.setTime(data);
       int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
       return diaSemana;
  }
  
  public static Date ConvercaoStringData(String data){
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      Date dataFormatada = null;
        try {
            dataFormatada = df.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return dataFormatada;
  }
  
    public static Time converterStringHora(String hora) throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        Date data = formatador.parse(hora);
        Time time = new Time(data.getTime());
        return time;
    }
    
    public static String calcularIdade(Date dataNascimento){
        String dn = Formatacao.ConvercaoDataSql(dataNascimento);
        String da = Formatacao.ConvercaoDataSql(new Date());
        String an =  dn.substring(0, 4);
        String aa = da.substring(0,4);
        int anoNascimento = Integer.parseInt(an);
        int anoAtual = Integer.parseInt(aa);
        if (dataNascimento.after(dataNascimento)){
            anoAtual = anoAtual - 1;
        }
        int idade = anoAtual - anoNascimento;
        return String.valueOf(idade);
    }
    
    public static void emitirEmailGerencial(String clietne, String unidade, String consultor, Vendas venda, String texto01, String valor, String tipoAviso, String valorCambio, String moeda, 
            String nomeEscola, String obsTM, String dataInicio, String dadosAlterado, String tipoVenda, String motivo){
        Formatacao formatacao = new Formatacao();
        String texto= texto01 + "\r\n";
        texto = texto + "Unidade           : " + unidade + "\r\n";
        texto = texto + "Cliente            : " + clietne + "\r\n";
        texto = texto + "Escola             : " + nomeEscola + "\r\n";
        texto = texto + "Data Início       : " + dataInicio + "\r\n";
        texto = texto + "Consultor         : " + consultor + "\r\n";
        texto = texto + tipoVenda + "\r\n";
        texto = texto + "\r\n";
        texto = texto + "\r\n";
        if (tipoAviso.equalsIgnoreCase("I")){
            texto = texto + "DADOS ALTERADOS" + "\r\n";
            texto = texto +"\r\n" + dadosAlterado + "\r\n";
        }else {
            texto = texto + "Valor da Venda R$ : " + valor + "\r\n";
            texto = texto + "Valor Câmbio R$   : " + valorCambio + "\r\n";
            texto = texto + "Moeda             : " + moeda;
            texto = texto + "\r\n";
            texto = texto + "\r\n";
            texto = texto + "Observação TM     : " + "\r\n";
            texto = texto + "\r\n";
            if (motivo.length()>5){
                texto = texto +"Motivo         : " + motivo + "\r\n";     
                texto = texto + "\r\n";
            }
            texto = texto + obsTM;
        }
        formatacao.enviarEmailNotificacaoProduto(venda.getProdutos(), texto, tipoAviso);
    }
    
    
    
//    public static void emitirEmailGerencial(String clietne, String unidade, String consultor, Vendas venda, String texto01, String valor, String tipoAviso, String valorCambio, String moeda,String fornecedor,  String obsTM, String tipoVenda, String motivo){
//        Formatacao formatacao = new Formatacao();
//        String texto= texto01 + "\r\n";
//        texto = texto + "Unidade           : " + unidade + "\r\n";
//        texto = texto + "Cliente           : " + clietne + "\r\n";
//        texto = texto + "Consultor         : " + consultor + "\r\n";
//        texto = texto + "Valor da Venda R$ : " + valor + "\r\n";
//        texto = texto + "Valor Câmbio R$   : " + valorCambio + "\r\n";
//        texto = texto + "Moeda             : " + moeda + "\r\n";
//        texto = texto + tipoVenda + "\r\n";
//        texto = texto + "\r\n";
//        texto = texto  + "\r\n";
//        texto = texto + "Motivo            : " + motivo + "\r\n"; 
//        texto = texto  + "Observações TM\r\n";
//        texto = texto + obsTM;
//        formatacao.enviarEmailNotificacaoProduto(venda.getProdutos(), texto, tipoAviso);
//    }
    
    public static void emitirEmailCotacaoPacotes(String unidade, String consultor, String texto01, String tipoPacote){
        Formatacao formatacao = new Formatacao();
        String texto= texto01 + "\r\n";
        texto = texto + "Unidade           : " + unidade + "\r\n";
        texto = texto + "Consultor         : " + consultor + "\r\n";
        texto = texto + "Tipo de Pacote : " + tipoPacote + "\r\n";
        texto = texto + "\r\n";
        texto = texto  + "\r\n";
        formatacao.enviarEmailCotacaoPacote(texto);
    }
    
    public void enviarEmailCambio(String texto) {
      ParametrosProdutosController parametrosProdutosController = new ParametrosProdutosController();
      Parametrosprodutos parametrosprodutos = parametrosProdutosController.consultar();
      int contador =0;
      if (parametrosprodutos != null) {
          if (parametrosprodutos.getEmailCambio01()!=null){
              contador+=1;
          }    
          if (parametrosprodutos.getEmailCambio02()!=null){
              contador+=1;
          }
          if (parametrosprodutos.getEmailCambio03()!=null){
              contador+=1;
          }
          InternetAddress[] listaEmail = new InternetAddress[contador+01];
          try {
              if (parametrosprodutos.getEmailCambio01() != null) {
                  if (parametrosprodutos.getEmailCambio01().length()>0){
                      listaEmail[1] = new InternetAddress(parametrosprodutos.getEmailCambio01());
                  }
              }
              if (parametrosprodutos.getEmailCambio02() != null) {
                  if (parametrosprodutos.getEmailCambio02().length()>0){
                      listaEmail[2] = new InternetAddress(parametrosprodutos.getEmailCambio02());
                  }
              }
              if (parametrosprodutos.getEmailCambio03() != null) {
                  if (parametrosprodutos.getEmailCambio03().length()>0){
                      listaEmail[3] = new InternetAddress(parametrosprodutos.getEmailCambio03());
                  }
              }
          } catch (AddressException ex) {
              Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              this.emailSenha = "20SimpleS78";
              this.emailUsuario = "ti@travelmate.com.br";
              Properties p = new Properties();
              p.put("mail.smtp.host", "smtp.travelmate.com.br");
              p.put("mail.smtp.port", 587);
              p.put("mail.smtp.auth", "true");

              Session session = Session.getDefaultInstance(p, new Auth());

              MimeMessage msg = new MimeMessage(session);
              msg.setFrom(new InternetAddress("systm@travelmate.com.br"));

              msg.setRecipients(Message.RecipientType.TO, listaEmail);

              msg.setSubject("SysTM - Alteração Câmbio");
              msg.setText(texto);



              MimeMultipart mpRoot = new MimeMultipart("mixed");
              MimeMultipart mpContent = new MimeMultipart("alternative");
              MimeBodyPart contentPartRoot = new MimeBodyPart();
              contentPartRoot.setContent(mpContent);
              mpRoot.addBodyPart(contentPartRoot);

              //enviando texto  
              MimeBodyPart mbp1 = new MimeBodyPart();
              mbp1.setText(texto);
              mpContent.addBodyPart(mbp1);




              msg.setContent(mpRoot);
              msg.saveChanges();

              Transport.send(msg);
          } catch (Exception e) {
          }
      }
    }
    
    public void enviarEmailCotacaoPacote(String texto) {
      ParametrosProdutosController parametrosProdutosController = new ParametrosProdutosController();
      Parametrosprodutos parametrosprodutos = parametrosProdutosController.consultar();
      int contador =0;
      if (parametrosprodutos != null) {
          if (parametrosprodutos.getEmailCotacao()!=null){
              contador+=1;
          }    
          InternetAddress[] listaEmail = new InternetAddress[1];
          try {
              if (parametrosprodutos.getEmailCotacao() != null) {
                  if (parametrosprodutos.getEmailCotacao().length()>0){
                      listaEmail[0] = new InternetAddress(parametrosprodutos.getEmailCotacao());
                  }
              }
          } catch (AddressException ex) {
              Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
              this.emailSenha = "20SimpleS78";
              this.emailUsuario = "ti@travelmate.com.br";
              Properties p = new Properties();
              p.put("mail.smtp.host", "smtp.travelmate.com.br");
              p.put("mail.smtp.port", 587);
              p.put("mail.smtp.auth", "true");

              Session session = Session.getDefaultInstance(p, new Auth());

              MimeMessage msg = new MimeMessage(session);
              msg.setFrom(new InternetAddress("systm@travelmate.com.br"));

              msg.setRecipients(Message.RecipientType.TO, listaEmail);

              msg.setSubject("Pedido de Cotação de Pacote");
              msg.setText(texto);



              MimeMultipart mpRoot = new MimeMultipart("mixed");
              MimeMultipart mpContent = new MimeMultipart("alternative");
              MimeBodyPart contentPartRoot = new MimeBodyPart();
              contentPartRoot.setContent(mpContent);
              mpRoot.addBodyPart(contentPartRoot);

              //enviando texto  
              MimeBodyPart mbp1 = new MimeBodyPart();
              mbp1.setText(texto);
              mpContent.addBodyPart(mbp1);




              msg.setContent(mpRoot);
              msg.saveChanges();

              Transport.send(msg);
          } catch (Exception e) {
          }
      }
    }
    
    public static void VerificarCambioalterado(float valorCambio, String produto, String cliente, String unidade, String consultor, int idProduto, String valorVenda){
        Formatacao formatacao = new Formatacao();
        String texto="";
        texto = texto + "Produto           : " + produto + "\r\n";
        texto = texto + "Valor do Câmbio   : " + formatarFloatString(valorCambio) + "\r\n";
        texto = texto + "Unidade           : " + unidade + "\r\n";
        texto = texto + "Cliente           : " + cliente + "\r\n";
        texto = texto + "Consultor         : " + consultor + "\r\n";
        texto = texto + "Valor da Venda R$ : " + valorVenda;
        formatacao.enviarEmailCambio(texto);
    }
    
    public void enviarEmailProdutos(String para, String cc, String senha, String de, 
          String assunto, String texto, String nomeArquivoFicha, String nomeArquivoContrato, String nomeArquivoRecibo) {
          int numeroEmail = 1;
          if (cc.length()>0){
              numeroEmail= numeroEmail + 1;
          }
          InternetAddress[] listaEmail = new InternetAddress[numeroEmail];
          try {
              if(para.length()>0){
                  listaEmail[0] = new InternetAddress(para);
              }
              if (cc.length()>0){
                  listaEmail[1] = new InternetAddress(cc);
              }
          } catch (AddressException ex) {
              Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println(ex);
          }
          try {
              this.emailUsuario = de;
              this.emailSenha = senha;
              Properties p = new Properties();
              p.put("mail.smtp.host", "smtp.travelmate.com.br");
              p.put("mail.smtp.port", 587);
              p.put("mail.smtp.auth", "true");

              Session session = Session.getDefaultInstance(p, new Formatacao.Auth());

              MimeMessage msg = new MimeMessage(session);
              msg.setFrom(new InternetAddress(de));

              msg.setRecipients(Message.RecipientType.TO, listaEmail);

              msg.setSubject(assunto);
              //msg.setContent(texto, "text/html");
              msg.setText(texto);



              MimeMultipart mpRoot = new MimeMultipart("mixed");
              MimeMultipart mpContent = new MimeMultipart("alternative");
              MimeBodyPart contentPartRoot = new MimeBodyPart();
              contentPartRoot.setContent(mpContent);
              mpRoot.addBodyPart(contentPartRoot);

              //enviando texto  
              MimeBodyPart mbp1 = new MimeBodyPart();
              mbp1.setText(texto);
              mpContent.addBodyPart(mbp1);
              MimeBodyPart mbpAnexoFicha = new MimeBodyPart();
              MimeBodyPart mbpAnexoContrato = new MimeBodyPart();
              MimeBodyPart mbpAnexoRecibo = new MimeBodyPart();
              
              if (nomeArquivoFicha!=null){
                  FileDataSource source = new FileDataSource(nomeArquivoFicha);
                  mbpAnexoFicha.setDisposition(Part.ATTACHMENT);
                  mbpAnexoFicha.setDataHandler(new DataHandler(source));  
                  mbpAnexoFicha.setFileName(source.getName());  
                  mpContent.addBodyPart(mbpAnexoFicha);
              }
              
              if (nomeArquivoContrato!=null){
                  FileDataSource source = new FileDataSource(nomeArquivoContrato);
                  mbpAnexoContrato.setDisposition(Part.ATTACHMENT);
                  mbpAnexoContrato.setDataHandler(new DataHandler(source));  
                  mbpAnexoContrato.setFileName(source.getName());  
                  mpContent.addBodyPart(mbpAnexoContrato);
              }
              
              if (nomeArquivoRecibo!=null){
                  FileDataSource source = new FileDataSource(nomeArquivoRecibo);
                  mbpAnexoRecibo.setDisposition(Part.ATTACHMENT);
                  mbpAnexoRecibo.setDataHandler(new DataHandler(source));  
                  mbpAnexoRecibo.setFileName(source.getName());  
                  mpContent.addBodyPart(mbpAnexoRecibo);
              }

              msg.setContent(mpRoot);
              msg.saveChanges();

              Transport.send(msg);
              JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso");
          } catch (Exception e) {
              System.out.println(e);
              System.out.println("teste");
      }
    }
    
    public void enviarEmailNotificacaoArquivo(int idTipoArquivo, String texto, String tipoAviso, int idUnidade) {
        InternetAddress[] listaEmail = null;
        if (idTipoArquivo > 0) {
            ArquivosController arquivosController = new ArquivosController();
            List<Viewtipoarquivousuario> listaUsuario = arquivosController.listarTipoUsuario(idTipoArquivo);
            if (listaUsuario != null) {
                listaEmail = new InternetAddress[listaUsuario.size()];
                try {
                    for (int i = 0; i < listaUsuario.size(); i++) {
                        listaEmail[i] = new InternetAddress(listaUsuario.get(i).getEmail());
                    }
                } catch (AddressException ex) {
                    Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
            }
        } else if (idUnidade > 0) {
            UsuarioController usuarioController = new UsuarioController();
            List<Usuario> listaUsuario = usuarioController.listaUsuarioUnidade(idUnidade);
            if (listaUsuario != null) {
                listaEmail = new InternetAddress[listaUsuario.size()];
                try {
                    for (int i = 0; i < listaUsuario.size(); i++) {
                        listaEmail[i] = new InternetAddress(listaUsuario.get(i).getEmail());
                    }
                } catch (AddressException ex) {
                    Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
            }
        }
        try {
            this.emailSenha = "20SimpleS78";
            this.emailUsuario = "ti@travelmate.com.br";
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.travelmate.com.br");
            p.put("mail.smtp.port", 587);
            p.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(p, new Auth());

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("systm@travelmate.com.br"));

            msg.setRecipients(Message.RecipientType.TO, listaEmail);

            msg.setSubject("Informação de Upload de Arquivo");
            msg.setText(texto);

            MimeMultipart mpRoot = new MimeMultipart("mixed");
            MimeMultipart mpContent = new MimeMultipart("alternative");
            MimeBodyPart contentPartRoot = new MimeBodyPart();
            contentPartRoot.setContent(mpContent);
            mpRoot.addBodyPart(contentPartRoot);

            //enviando texto  
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(texto);
            mpContent.addBodyPart(mbp1);

            msg.setContent(mpRoot);
            msg.saveChanges();

            Transport.send(msg);
        } catch (Exception e) {
        }
    }
    
    public static void emitirEmailArquivo(String tipoArquivo, String cliente, int idTipoArquivo, String unidade, String consultor, int idUnidade){
        Formatacao formatacao = new Formatacao();
        String texto= "Tipo de Arquivo     : " + tipoArquivo + "\r\n";
        texto = texto + "Unidade           : " + unidade + "\r\n";
        texto = texto + "Cliente           : " + cliente + "\r\n";
        texto = texto + "Consultor         : " + consultor + "\r\n";
        formatacao.enviarEmailNotificacaoArquivo(idTipoArquivo, texto, tipoArquivo, idUnidade);
    }
    
    public void enviarEmailException(String mensagem) {
        InternetAddress[] listaEmail = new InternetAddress[2];

        try {
            listaEmail[0] = new InternetAddress("ti@travelmate.com.br");
            listaEmail[1] = new InternetAddress("ti2@travelmate.com.br");
        } catch (AddressException ex) {
            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.emailSenha = "20SimpleS78";
            this.emailUsuario = "ti@travelmate.com.br";
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.travelmate.com.br");
            p.put("mail.smtp.port", 587);
            p.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(p, new Auth());

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("systm@travelmate.com.br"));

            msg.setRecipients(Message.RecipientType.TO, listaEmail);

            msg.setSubject("SysTM - Exception");
            msg.setText(mensagem);

            MimeMultipart mpRoot = new MimeMultipart("mixed");
            MimeMultipart mpContent = new MimeMultipart("alternative");
            MimeBodyPart contentPartRoot = new MimeBodyPart();
            contentPartRoot.setContent(mpContent);
            mpRoot.addBodyPart(contentPartRoot);

            //enviando texto  
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(mensagem);
            mpContent.addBodyPart(mbp1);

            msg.setContent(mpRoot);
            msg.saveChanges();

            Transport.send(msg);
        } catch (Exception e) {
        }
    }
    
//    public static String pegarHTML() {
//        String nome = System.getProperty("user.dir") + "/orcamento.html";
//        String nlinha = "";
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(nome));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//
//            while (br.ready()) {
//                String linha = br.readLine();
//                System.out.println(linha);
//                nlinha = nlinha + "\r\n" + linha;
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            System.out.println("");
//            br.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return nlinha;
//    }
    
    public static String getCaminho(String caminho){
    // vamos obter o índice da última aparição do separador de caminho
    int pos = caminho.lastIndexOf(File.separatorChar);
    if (pos > -1) {
       return caminho.substring(0, pos);
    }
    // por padrão vamos retornar uma string vazia
    return "";
  }
    
    public static Date ConvercaoStringDataBrasil(String data) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = null;
        try {
            dataFormatada = df.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataFormatada;
    }
    
    public static String gerarNumeroDocumentoBoleto(String numeroVenda, String numeroParcela){
        if (numeroParcela.length()==1){
            numeroParcela = "0" + numeroParcela;
        }
        String numero = numeroVenda + numeroParcela;
        for(int i=0;i<8;i++){
            if (numero.length()<8){
                numero= "0" + numero;
            }else {
                i=100;
            }
        }
        return numero;
    }
    
    public static BigDecimal converterFloatBigDecimal(Float valor){
        Double dobuleValor = valor.doubleValue();
        BigDecimal bigDecimalValor = new BigDecimal(dobuleValor);
        return bigDecimalValor;
    }
    
    public static String retirarPontos(String dado){
        String formatado = "";
        char c = ' ';
        if (dado != null) {
            for (int i = 0; i < dado.length(); i++) {
                c = dado.charAt(i);
                if ((c != '.') && (c != ',') && (c != '-') && (c != '/') && (c != '(') && (c != ')')) {
                    formatado += c;
                }
            }
        }
        return formatado;
    }
    
    public static Date SomarDiasDatas(Date data, int dias) throws Exception {
        Calendar c = new GregorianCalendar();
        c.setTime(data);
        c.add(Calendar.DAY_OF_MONTH, dias);
        return c.getTime();
    }
    
    public static Date calcularPrevisaoPagamentoFornecedor(Date dataProduto, int idProduto, int idWork){
        String inicoProduto = Formatacao.ConvercaoDataPadrao(dataProduto);
        String dia =  inicoProduto.substring(0, 2);
        String mes = inicoProduto.substring(3, 5);
        String ano = inicoProduto.substring(6, 10);
        int nmes = Integer.parseInt(mes);
        int nano = Integer.parseInt(ano);
        if (idProduto==idWork){
            if (nmes==2){
                nmes = 12;
                nano = nano - 1;
            }else if (nmes==1){
                nmes = 11;
                nano = nano - 1;
            }else {
                nmes = nmes - 2;
            }
        }else {
            if (nmes==1){
                nmes = 12;
                nano = nano - 1;
            }else {
                nmes = nmes - 1;
            }
        }
        if (nmes<10){
            mes = "0"  + String.valueOf(nmes);
        }else mes = String.valueOf(nmes);
        String novaData = dia + "/" + mes + "/" +  String.valueOf(nano);
        return Formatacao.ConvercaoStringDataBrasil(novaData);
    }
    
}
