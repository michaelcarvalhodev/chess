package xadrez;

public class Casa {

    private Posicao posicao;
    private Peca peca;


    public Casa(Posicao posicao) {
        this.posicao = posicao;
    }

    public boolean estaVazia() {
        if (peca == null){
            return true;
        } else {
            return false;
        }
    }

    public Cor getCorDaCasa() {

        if (posicao.getLinhas() + posicao.getColunas() % 2 == 0){
            return Cor.Branca;
        } else {
            return Cor.Preta;
        }
    }

    public Peca getPeca() {
        return peca;
    }

    @Override
    public String toString() {
        return posicao.toString();
    }
}
