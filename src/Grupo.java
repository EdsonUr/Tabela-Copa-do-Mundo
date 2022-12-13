import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Grupo {
    private String letra;
    private ArrayList<Selecao> selecoes = new ArrayList<>();
    private ArrayList<Partidas> partidas = new ArrayList();

    public String getLetra() {
        return letra;
    }

    Random random = new Random();

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public ArrayList<Selecao> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(Selecao selecoes) {
        this.selecoes.add(selecoes);
    }

    public ArrayList<Partidas> getPartidas() {
        return partidas;
    }

    public void setPartidas(Partidas[] partidas) {
        for(int i = 0 ; i < 6; i++){
            this.partidas.add(partidas[i]);
        }
    }
    public Grupo(String letra){
        this.letra = letra;
    }

    public void ordenaGrupo(){
        Collections.sort(selecoes, new Comparator<Selecao>() {
            @Override
            public int compare(Selecao o1, Selecao o2) {
                int pontos = o1.getPontos() - o2.getPontos();
                if(pontos == 0){
                    int saldoGols = o1.getSaldoGols() - o2.getSaldoGols();
                    if(saldoGols == 0){
                        int qtdGols = o1.getQtdGols() - o2.getQtdGols();
                        if(qtdGols == 0){
                            int retornar = 0;
                           for(int i = 0; i < partidas.size(); i++){
                               if(partidas.get(i).getTime1().getNome().equals(o1.getNome()) && partidas.get(i).getTime2().getNome().equals(o2.getNome())){
                                   //System.out.println("primeira");
                                   //System.out.println("TIME1: " + partidas.get(i).getTime1().getNome() +" = "+ o1.getNome());
                                   //System.out.println("TIME2: " + partidas.get(i).getTime2().getNome() +" = "+ o2.getNome());
                                   int diferencaGols = partidas.get(i).getGols1() - partidas.get(i).getGols2();
                                   if(diferencaGols != 0){
                                       retornar = -diferencaGols;
                                   }else{
                                       retornar = 0;
                                   }
                               }else if(partidas.get(i).getTime2().getNome().equals(o1.getNome()) && partidas.get(i).getTime1().getNome().equals(o2.getNome())){
                                   //System.out.println("segunda");
                                   //System.out.println("TIME1: " + partidas.get(i).getTime2().getNome() +" = "+ o1.getNome() + " GOLS:"+partidas.get(i).getGols2());
                                   //System.out.println("TIME2: " + partidas.get(i).getTime1().getNome()+" = "+ o2.getNome() + " GOLS:"+partidas.get(i).getGols1());
                                   int diferencaGols = partidas.get(i).getGols2() - partidas.get(i).getGols1();
                                   if(diferencaGols != 0){
                                       retornar = -diferencaGols;
                                   }else{
                                       retornar = 0;
                                   }
                               }
                           }
                           if(retornar != 0){
                               return retornar;
                           }else{
                               int aleatorio = random.nextInt(2);
                               if(aleatorio == 0){
                                   return -1;
                               }else{
                                   return 1;
                               }
                           }
                        }else{
                            return -qtdGols;
                        }
                    }else{
                        return -saldoGols;
                    }
                }else{
                    return -pontos;
                }
            }
        });
    }
}
