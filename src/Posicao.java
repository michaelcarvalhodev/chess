public class Posicao {

    int colunas;
    int linhas;


    public Posicao(int colunas, int linhas) {
        this.colunas = colunas;
        this.linhas = linhas;
    }

    public Posicao() {

    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
}
