import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class LogicaCompartilhada {
    public void insertLabel(JLabel[] labels, Grupo grupo){
        int control = 0;
        for(int i = 0; i < 4; i++){
            labels[i].setText(grupo.getSelecoes().get(control).getNome());
            control++;
        }
        control = 0;
        for(int i = 4; i < 8; i++){
            labels[i].setText(Integer.toString(grupo.getSelecoes().get(control).getPontos()));
            control++;
        }
        control = 0;
        for(int i = 8; i < 12; i++){
            labels[i].setText(Integer.toString(grupo.getSelecoes().get(control).getSaldoGols()));
            control++;
        }
        control = 0;
        for(int i = 12; i < 16; i++){
            labels[i].setText(Integer.toString(grupo.getSelecoes().get(control).getQtdGols()));
            control++;
        }
        labels[16].setText(grupo.getSelecoes().get(0).getNome());
        labels[17].setText(grupo.getSelecoes().get(1).getNome());
    }
    public void grupoLogica(Grupo grupo, Selecao s1, Selecao s2, Selecao s3, Selecao s4, Partidas p1, Partidas p2, Partidas p3, Partidas p4, Partidas p5, Partidas p6, JLabel[] labels, int index1, int index2, ArrayList<String> arquivos){
        String arq = grupo.getLetra()+".txt";
        String arq2 = "listaArquivos.txt";
        String texto = "";
        String texto2 = "";
        grupo.ordenaGrupo();
        insertLabel(labels,grupo);
        texto = p1.getGols1()+";"+p1.getGols2()+";"+p2.getGols1()+";"+p2.getGols2()+";"+
                p3.getGols1()+";"+p3.getGols2()+";"+p4.getGols1()+";"+p4.getGols2()+";"+p5.getGols1()+";"+p5.getGols2()+";"+p6.getGols1()+";"+p6.getGols2()+";"+"\n"+s1.getPontos()+";"+s1.getSaldoGols()+";"+s1.getQtdGols()+";"+"\n"+
                s2.getPontos()+";"+s2.getSaldoGols()+";"+s2.getQtdGols()+";"+"\n"+s3.getPontos()+";"+s3.getSaldoGols()+";"+s3.getQtdGols()+";"+"\n"+s4.getPontos()+";"+s4.getSaldoGols()+";"+s4.getQtdGols()+";"+"\n"+grupo.getSelecoes().get(0).getNome()+
                ";"+grupo.getSelecoes().get(1).getNome()+";"+grupo.getSelecoes().get(2).getNome()+";"+grupo.getSelecoes().get(3).getNome()+";"+"\n"+grupo.getSelecoes().get(0).getPontos()+";"+grupo.getSelecoes().get(1).getPontos()+";"+grupo.getSelecoes().get(2).getPontos()+
                ";"+grupo.getSelecoes().get(3).getPontos()+";"+"\n"+grupo.getSelecoes().get(0).getSaldoGols()+";"+grupo.getSelecoes().get(1).getSaldoGols()+";"+grupo.getSelecoes().get(2).getSaldoGols()+";"+grupo.getSelecoes().get(3).getSaldoGols()+";"+"\n"+grupo.getSelecoes().get(0).getQtdGols()
                +";"+grupo.getSelecoes().get(1).getQtdGols()+";"+grupo.getSelecoes().get(2).getQtdGols()+";"+grupo.getSelecoes().get(3).getQtdGols()+";"+"\n"+grupo.getSelecoes().get(0).getNome()+";"+grupo.getSelecoes().get(1).getNome()+";"+"\n"+index1+";"+index2;
        if(Arquivo.Write(arq,texto)){
            System.out.println("Grupo " + grupo.getLetra() + " salvo!");
        }else{
            System.out.println("Erro ao salvar o arquivo!");
        }
        if(!arquivos.contains(arq)){
            arquivos.add(arq);
        }
        for(String path:arquivos){
            if(!Files.exists(Path.of(path))){
                arquivos.remove(path);
            }
        }
        for(int i = 0; i < arquivos.size();i++){
            if(i != arquivos.size()-1){
                texto2 += arquivos.get(i)+";";
            }else{
                texto2 += arquivos.get(i);
            }
        }
        Arquivo.Write(arq2,texto2);
    }
    public void escreveEliminatorias(String texto, String arq){
        if(Arquivo.Write(arq,texto)){
            System.out.println(arq+" salvo!");
        }else{
            System.out.println("Erro ao salvar o arquivo!");
        }
    }
    public void checaArquivo(JTextArea[] textArea, String[] info,Selecao s1, Selecao s2, Selecao s3, Selecao s4, Grupo grupo, JLabel[] labels,Eliminatorias el){
        for(int i = 0; i < textArea.length; i++){
            textArea[i].setText(info[i]);
        }
        s1.armazenaValor(info,12);
        s2.armazenaValor(info,15);
        s3.armazenaValor(info,18);
        s4.armazenaValor(info,21);
        int control = 0;
        for(int i = 24;i<42;i++){
            labels[control].setText(info[i]);
            control++;
        }
        int index1 = Integer.parseInt(info[42]);
        int index2 = Integer.parseInt(info[43]);
        el.setOitavas(new Selecao(info[40]),index1);
        el.setOitavas(new Selecao(info[41]),index2);
    }

    public void logicaGrupos(Selecao s1, Selecao s2, Selecao s3, Selecao s4,JTextArea[] textAreas, JLabel[] labels, Grupo g, Eliminatorias el,int index1, int index2,ArrayList<String> arquivos){
        try{
            s1.zeraOptions();
            s2.zeraOptions();
            s3.zeraOptions();
            s4.zeraOptions();
            for(JTextArea textArea : textAreas){
                if(Integer.parseInt(textArea.getText())<0){
                    throw new Exception();
                }
            }
            Partidas p1 = new Partidas(s1,s2,Integer.parseInt(textAreas[0].getText()),Integer.parseInt(textAreas[1].getText()));
            Partidas p2 = new Partidas(s1,s3,Integer.parseInt(textAreas[2].getText()),Integer.parseInt(textAreas[3].getText()));
            Partidas p3 = new Partidas(s1,s4,Integer.parseInt(textAreas[4].getText()),Integer.parseInt(textAreas[5].getText()));
            Partidas p4 = new Partidas(s2,s3,Integer.parseInt(textAreas[6].getText()),Integer.parseInt(textAreas[7].getText()));
            Partidas p5 = new Partidas(s2,s4,Integer.parseInt(textAreas[8].getText()),Integer.parseInt(textAreas[9].getText()));
            Partidas p6 = new Partidas(s3,s4,Integer.parseInt(textAreas[10].getText()),Integer.parseInt(textAreas[11].getText()));
            Partidas[] partidas = {p1,p2,p3,p4,p5,p6};
            g.setPartidas(partidas);
            grupoLogica(g,s1,s2,s3,s4,p1,p2,p3,p4,p5,p6,labels,index1,index2,arquivos);
            el.setOitavas(g.getSelecoes().get(0),index1);
            el.setOitavas(g.getSelecoes().get(1),index2);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Preencha todos os placares com inteiros positivos!" , "Bracket Simulator",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void verificaArquivoGrupos(String arq,JTextArea[] textAreas, JLabel[] labels,Grupo g,Eliminatorias el){
        try {
            String[] info = Arquivo.Read(arq,44);
            checaArquivo(textAreas,info,g.getSelecoes().get(0),g.getSelecoes().get(1),g.getSelecoes().get(2),g.getSelecoes().get(3),g,labels,el);
        }catch (Exception ex){
            System.out.println("O arquivo "+g.getLetra()+".txt ainda nao existe!");
        }
    }

    public void verificaArquivoFinais(String arq,int tam,JTextArea[] textAreas, JLabel[] labels, Eliminatorias el){
        try {
            String[] info = Arquivo.Read(arq,tam);
            for(int i = 0; i < textAreas.length;i++){
                textAreas[i].setText(info[i]);
            }
            int control =0;
            if(tam != 12){
                for(int j = textAreas.length; j < info.length;j++){
                    labels[control].setText(info[j]);
                    if(tam == 40){
                        el.setQuartas(new Selecao(info[j]),control);
                    }else if(tam == 20){
                        el.setSemi(new Selecao(info[j]),control);
                    }
                    control++;
                }
            }else if(tam == 12){
                for(int i = 0; i < 8; i++){
                    textAreas[i].setText(info[i]);
                }
                for(int j = 8; j < 10; j++){
                    labels[control].setText(info[j]);
                    el.setFinalistas(new Selecao(info[j]),control);
                    control++;
                }
                control = 2;
                int index = 0;
                for(int j = 10; j < 12; j++){
                    labels[control].setText(info[j]);
                    el.setDisputaTerceiro(new Selecao(info[j]),index);
                    control++;
                    index++;
                }
            }else{
                for(int i = 0; i < 8; i++){
                    textAreas[i].setText(info[i]);
                }
                for(int j = 8; j < 11; j++){
                    labels[control].setText(info[j]);
                    control++;
                }
            }
        }catch (Exception ex){
            System.out.println("O arquivo "+arq+" ainda nao existe!");
        }
    }
}
