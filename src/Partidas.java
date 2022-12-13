public class Partidas {
    private Selecao selecao1;
    private Selecao selecao2;
    private int gols1;
    private int gols2;

    private int penalti1;

    private int penalti2;

    public Selecao getTime1() {
        return selecao1;
    }

    public void setTime1(Selecao selecao1) {
        this.selecao1 = selecao1;
    }

    public Selecao getTime2() {
        return selecao2;
    }

    public void setTime2(Selecao selecao2) {
        this.selecao2 = selecao2;
    }

    public int getGols1() {
        return gols1;
    }

    public void setGols1(int gols1) {
        this.gols1 = gols1;
    }

    public int getGols2() {
        return gols2;
    }

    public void setGols2(int gols2) {
        this.gols2 = gols2;
    }

    public int getPenalti1() {
        return penalti1;
    }

    public void setPenalti1(int penalti1) {
        this.penalti1 = penalti1;
    }

    public int getPenalti2() {
        return penalti2;
    }

    public void setPenalti2(int penalti2) {
        this.penalti2 = penalti2;
    }

    public Partidas(Selecao s1, Selecao s2, int gols1, int gols2){
        this.selecao1 = s1;
        this.selecao2 = s2;
        this.gols1 = gols1;
        this.gols2 = gols2;
        if(gols1 == gols2){
            s1.setPontos(1);
            s1.setQtdGols(gols1);
            s1.setSaldoGols(gols1 - gols2);
            s2.setPontos(1);
            s2.setQtdGols(gols2);
            s2.setSaldoGols(gols2 - gols1);
        }else if(gols1 > gols2){
            s1.setPontos(3);
            s1.setQtdGols(gols1);
            s1.setSaldoGols(gols1 - gols2);
            s2.setQtdGols(gols2);
            s2.setSaldoGols(gols2 - gols1);
        }else{
            s2.setPontos(3);
            s1.setQtdGols(gols1);
            s1.setSaldoGols(gols1 - gols2);
            s2.setQtdGols(gols2);
            s2.setSaldoGols(gols2 - gols1);
        }
    }

    public Partidas(Selecao s1, Selecao s2,int gols1, int penalti1, int gols2, int penalti2){
        this.selecao1 = s1;
        this.selecao2 = s2;
        this.gols1 = gols1;
        this.gols2 = gols2;
        this.penalti1 = penalti1;
        this.penalti2 = penalti2;
    }


}
