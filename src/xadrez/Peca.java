package xadrez;

import java.util.List;

public abstract class  Peca {
    protected Cor cor;

    public Peca (Cor cor){
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public abstract List<Posicao> movimentosPossiveis(Tabuleiro tabuleiro, Posicao origem);

}
