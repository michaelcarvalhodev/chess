public class Posicao {

    char colunas;
    int linhas;


    public Posicao(char colunas, int linhas) {
        this.colunas = colunas;
        this.linhas = linhas;
    }

    public Posicao() {

    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(char colunas) {
        this.colunas = colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public boolean estaDentroDoTabuleiro() {
        // retorna true se linha e coluna estão entre 0 e 7

        return getLinhas() >= 1 && getLinhas() <= 8;
    }
}
