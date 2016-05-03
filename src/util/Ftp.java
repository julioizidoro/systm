/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Wolverine
 */
public class Ftp {
    
    private FTPClient ftpClient;
    private String host;
    private String user;
    private String password;

    public Ftp(String host, String user, String password)  {
        ftpClient = new FTPClient();
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public boolean conectar() throws IOException{
        ftpClient.connect(host);
        ftpClient.login(user, password);
        if (ftpClient.isConnected()){
            return true;
        }else return false;
    }
    
    public String enviarArquivo(String arquivoLocal, String arquivoFTP) throws IOException{
        ftpClient.changeWorkingDirectory("systm");
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        FileInputStream arqEnviar = new FileInputStream(arquivoLocal);
        if (ftpClient.storeFile(arquivoFTP, arqEnviar)) {
            return "Arquivo Salvo com Sucesso";
        } else {
            return "Erro Salvar Arquivo";
        }
    }
    
    public void desconectar() throws IOException{
        ftpClient.logout();
        ftpClient.disconnect();  
    }
    
    public void receberArquivo(String arquivoSalvar, String arquivoFTP) throws IOException{
        ftpClient.changeWorkingDirectory("systm");
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        OutputStream os = new FileOutputStream(arquivoSalvar);
        ftpClient.retrieveFile(arquivoFTP, os );
        os.close();
    }
}
