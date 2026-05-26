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

        if (getColunas() >= 'a' && getColunas() <= 'h' ){

            return true;
        } else {
            return false;
        }

    }
}
