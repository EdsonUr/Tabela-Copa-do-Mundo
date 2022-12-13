public class Selecao {
    private String nome;
    private int pontos;
    private int saldoGols;
    private int qtdGols;

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols += saldoGols;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols += qtdGols;
    }

    public Selecao(){

    }

    public Selecao(String nome){
        this.nome = nome;
    }

    public void zeraOptions(){
        this.pontos = 0;
        this.qtdGols = 0;
        this.saldoGols = 0;
    }

    public void armazenaValor(String[] info, int j){
        this.pontos = Integer.parseInt(info[j]);
        this.saldoGols = Integer.parseInt(info[j+1]);
        this.qtdGols = Integer.parseInt(info[j+2]);
    }

}
