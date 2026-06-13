package xadrez;

public class Posicao {

    private char colunas;
    private int linhas;


    public Posicao(char colunas, int linhas) {
        this.colunas = Character.toUpperCase(colunas);
        this.linhas = linhas;
    }


    public char getColunas() {
        return colunas;
    }


    public int getLinhas() {
        return linhas;
    }


    @Override
    public String toString() {
        return
                 colunas +
                "" + linhas
                ;
    }

    public boolean estaDentroDoTabuleiro() {
        return (getColunas() >= 'A' && getColunas() <= 'H' ) && (getLinhas() >= 1 && getLinhas() <= 8);
    }



}
