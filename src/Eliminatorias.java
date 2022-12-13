import java.util.ArrayList;

public class Eliminatorias {
    private ArrayList<Partidas> partidas = new ArrayList<>();

    private ArrayList<Selecao> oitavas = new ArrayList<>();

    private ArrayList<Selecao> quartas = new ArrayList<>();

    private ArrayList<Selecao> semi = new ArrayList<>();

    private ArrayList<Partidas> partidasQuartas = new ArrayList<>();

    private ArrayList<Partidas> partidasSemi = new ArrayList<>();

    private ArrayList<Selecao> finalistas = new ArrayList<>();
    private ArrayList<Selecao> disputaTerceiro = new ArrayList<>();
    private ArrayList<Selecao> ganhadores = new ArrayList<>();

    private int controla;

    public int getControla() {
        return controla;
    }

    public void setControla(int controla) {
        this.controla = controla;
    }

    public ArrayList<Selecao> getGanhadores() {
        return ganhadores;
    }

    public void setGanhadores(Selecao ganhadores, int index) {
        this.ganhadores.set(index, ganhadores);
    }

    public ArrayList<Selecao> getFinalistas() {
        return finalistas;
    }

    public void setFinalistas(Selecao finalistas,int index) {
        this.finalistas.set(index,finalistas);
    }

    public ArrayList<Selecao> getDisputaTerceiro() {
        return disputaTerceiro;
    }

    public void setDisputaTerceiro(Selecao disputaTerceiro, int index) {
        this.disputaTerceiro.set(index,disputaTerceiro);
    }

    public ArrayList<Partidas> getPartidasSemi() {
        return partidasSemi;
    }

    public void setPartidasSemi(Partidas partidasSemi, int index) {
        this.partidasSemi.set(index, partidasSemi);
    }

    public ArrayList<Selecao> getSemi() {
        return semi;
    }

    public void setSemi(Selecao semi, int index) {
        this.semi.set(index, semi);
    }

    public ArrayList<Selecao> getOitavas() {
        return oitavas;
    }

    public ArrayList<Partidas> getPartidas() {
        return partidas;
    }

    public ArrayList<Partidas> getPartidasQuartas() {
        return partidasQuartas;
    }

    public void setPartidasQuartas(Partidas[] partidasQuartas) {
        for(int i = 0; i < partidasQuartas.length; i++){
            this.partidasQuartas.set(i,partidasQuartas[i]);
        }
    }

    public void setPartidas(Partidas[] partidas) {
        for(int i = 0; i < partidas.length; i++){
            this.partidas.set(i,partidas[i]);
        }
    }
    public void setOitavas(Selecao oitavas,int index) {
        this.oitavas.set(index,oitavas);
    }

    public ArrayList<Selecao> getQuartas() {
        return quartas;
    }

    public void setQuartas(Selecao quartas,int index) {
        this.quartas.set(index,quartas);
    }

    public Eliminatorias(Selecao s, Partidas p){
        for(int i =0;i<16;i++){
            oitavas.add(s);
        }

        for(int j = 0; j <8;j++){
            quartas.add(s);
            partidas.add(p);
        }

        for(int k = 0; k <4;k++){
            semi.add(s);
            partidasQuartas.add(p);
            ganhadores.add(s);
        }

        for(int k = 0; k <2;k++){
            partidasSemi.add(p);
            finalistas.add(s);
            disputaTerceiro.add(s);
        }
    }

    public void checaOitavas(){
        this.controla = 1;
        for(int i = 0; i < partidas.size(); i++){
            int p1 = partidas.get(i).getPenalti1();
            int p2 = partidas.get(i).getPenalti2();
            int g1 = partidas.get(i).getGols1();
            int g2 = partidas.get(i).getGols2();
            if(g1 != g2 && p1 ==0 && p2 ==0 || g1 == g2 && p1 != p2){
                if(partidas.get(i).getGols1() - partidas.get(i).getGols2() == 0){
                    if(partidas.get(i).getPenalti1() - partidas.get(i).getPenalti2() <0){
                        this.setQuartas(partidas.get(i).getTime2(),i);
                    }else{
                        this.setQuartas(partidas.get(i).getTime1(),i);
                    }
                }else if(partidas.get(i).getGols1() - partidas.get(i).getGols2() < 0){
                    this.setQuartas(partidas.get(i).getTime2(),i);
                }else{
                    this.setQuartas(partidas.get(i).getTime1(),i);
                }
            }else{
                this.controla = 2;
            }
        }
    }
    public void checaQuartas(){
        this.controla = 1;
        for(int i = 0; i < partidasQuartas.size();i++){
            int p1 = partidasQuartas.get(i).getPenalti1();
            int p2 = partidasQuartas.get(i).getPenalti2();
            int g1 = partidasQuartas.get(i).getGols1();
            int g2 = partidasQuartas.get(i).getGols2();
                if(g1 != g2 && p1 ==0 && p2 ==0 || g1 == g2 && p1 != p2){
                if(partidasQuartas.get(i).getGols1() - partidasQuartas.get(i).getGols2() == 0){
                    if(partidasQuartas.get(i).getPenalti1() - partidasQuartas.get(i).getPenalti2() <0){
                        this.setSemi(partidasQuartas.get(i).getTime2(),i);
                    }else{
                        this.setSemi(partidasQuartas.get(i).getTime1(),i);
                    }
                }else if(partidasQuartas.get(i).getGols1() - partidasQuartas.get(i).getGols2() < 0){
                    this.setSemi(partidasQuartas.get(i).getTime2(),i);
                }else{
                    this.setSemi(partidasQuartas.get(i).getTime1(),i);
                }
            }else{
                this.controla = 2;
                }
        }
    }
    public void checaSemis(){
        this.controla = 1;
        for(int i = 0; i < partidasSemi.size();i++){
            int p1 = partidasSemi.get(i).getPenalti1();
            int p2 = partidasSemi.get(i).getPenalti2();
            int g1 = partidasSemi.get(i).getGols1();
            int g2 = partidasSemi.get(i).getGols2();
            if(g1 != g2 && p1 ==0 && p2 ==0 || g1 == g2 && p1 != p2){
                if(partidasSemi.get(i).getGols1() - partidasSemi.get(i).getGols2() == 0){
                    if(partidasSemi.get(i).getPenalti1() - partidasSemi.get(i).getPenalti2() <0){
                        this.setFinalistas(partidasSemi.get(i).getTime2(),i);
                        this.setDisputaTerceiro(partidasSemi.get(i).getTime1(),i);
                    }else{
                        this.setFinalistas(partidasSemi.get(i).getTime1(),i);
                        this.setDisputaTerceiro(partidasSemi.get(i).getTime2(),i);
                    }
                }else if(partidasSemi.get(i).getGols1() - partidasSemi.get(i).getGols2() < 0){
                    this.setFinalistas(partidasSemi.get(i).getTime2(),i);
                    this.setDisputaTerceiro(partidasSemi.get(i).getTime1(),i);
                }else{
                    this.setFinalistas(partidasSemi.get(i).getTime1(),i);
                    this.setDisputaTerceiro(partidasSemi.get(i).getTime2(),i);
                }
            }else{
                this.controla = 2;
            }
        }
    }
    public void checaFinais(){
        this.controla = 1;
        for(int i = 0; i < partidasSemi.size();i++){
            int p1 = partidasSemi.get(i).getPenalti1();
            int p2 = partidasSemi.get(i).getPenalti2();
            int g1 = partidasSemi.get(i).getGols1();
            int g2 = partidasSemi.get(i).getGols2();
            if(g1 != g2 && p1 ==0 && p2 ==0 || g1 == g2 && p1 != p2){
                if(i == 0){
                    if(partidasSemi.get(i).getGols1() - partidasSemi.get(i).getGols2() == 0){
                        if(partidasSemi.get(i).getPenalti1() - partidasSemi.get(i).getPenalti2() <0){
                            this.setGanhadores(partidasSemi.get(i).getTime2(),i);
                            this.setGanhadores(partidasSemi.get(i).getTime1(),i+1);
                        }else{
                            this.setGanhadores(partidasSemi.get(i).getTime1(),i);
                            this.setGanhadores(partidasSemi.get(i).getTime2(),i+1);
                        }
                    }else if(partidasSemi.get(i).getGols1() - partidasSemi.get(i).getGols2() < 0){
                        this.setGanhadores(partidasSemi.get(i).getTime2(),i);
                        this.setGanhadores(partidasSemi.get(i).getTime1(),i+1);
                    }else{
                        this.setGanhadores(partidasSemi.get(i).getTime1(),i);
                        this.setGanhadores(partidasSemi.get(i).getTime2(),i+1);
                    }
                }else{
                    if(partidasSemi.get(i).getGols1() - partidasSemi.get(i).getGols2() == 0){
                        if(partidasSemi.get(i).getPenalti1() - partidasSemi.get(i).getPenalti2() <0){
                            this.setGanhadores(partidasSemi.get(i).getTime2(),i+1);
                            this.setGanhadores(partidasSemi.get(i).getTime1(),i+2);
                        }else{
                            this.setGanhadores(partidasSemi.get(i).getTime1(),i+1);
                            this.setGanhadores(partidasSemi.get(i).getTime2(),i+2);
                        }
                    }else if(partidasSemi.get(i).getGols1() - partidasSemi.get(i).getGols2() < 0){
                        this.setGanhadores(partidasSemi.get(i).getTime2(),i+1);
                        this.setGanhadores(partidasSemi.get(i).getTime1(),i+2);
                    }else{
                        this.setGanhadores(partidasSemi.get(i).getTime1(),i+1);
                        this.setGanhadores(partidasSemi.get(i).getTime2(),i+2);
                    }
                }
            }else{
                this.controla = 2;
            }
        }
    }
}
