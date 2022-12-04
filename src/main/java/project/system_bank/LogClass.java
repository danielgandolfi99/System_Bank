package project.system_bank;

import java.io.*;

public class LogClass {

    public static void escreve(String erro){
        try{
            File logs = new File("logs.txt");
            if(!logs.exists()){
                logs.createNewFile();
            }
            try (FileWriter fw = new FileWriter(logs,true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter pw = new PrintWriter(bw)){
                pw.println(erro);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void le(){
        try{
            File logs = new File("logs.txt");
            if(logs.exists()){
                try (FileReader fr = new FileReader(logs);
                     BufferedReader br = new BufferedReader(fr)){
                    String texto_lido = "";
                    String linha_lida = "";
                    do{
                        linha_lida = br.readLine();
                        if(linha_lida !=null){
                            texto_lido += linha_lida + System.lineSeparator();
                        }
                    } while (linha_lida != null);
                    System.out.println(texto_lido);
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
