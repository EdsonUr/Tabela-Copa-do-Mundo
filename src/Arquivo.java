import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public static String[] Read(String Caminho, int quantidade){
        String conteudo = "";
        String[] infoBox = new String[quantidade];
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha!=null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                infoBox = conteudo.split(";");
                arq.close();
            }catch (IOException ex){
                conteudo = "Erro: Não foi possível ler o arquivo!";
            }
        }catch (FileNotFoundException ex){
            conteudo = "Erro: Arquivo não encontrado!";
        }
        if(conteudo.contains("Erro")){
            return new String[]{""};
        }else{
            return infoBox;
        }
    }

    public static boolean Write(String Caminho, String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static String ReadLista(String Caminho){
        String conteudo = "";
        ArrayList<String> lista = new ArrayList<>();
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha!=null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            }catch (IOException ex){
                conteudo = "Erro: Não foi possível ler o arquivo!";
            }
        }catch (FileNotFoundException ex){
            conteudo = "Erro: Arquivo não encontrado!";
        }
        if(conteudo.contains("Erro")){
            return "nada";
        }else{
            return conteudo;
        }
    }
}
