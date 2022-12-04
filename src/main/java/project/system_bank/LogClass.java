package project.system_bank;

import java.io.*;

public class LogClass { // Daniel

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
}
