package xadrez.pecas;

import xadrez.*;

import java.util.ArrayList;
import java.util.List;

public class Torre extends Peca {


    public Torre(Cor cor) {
        super(cor);
    }

    @Override
    public List<Posicao> movimentosPossiveis(Tabuleiro tabuleiro, Posicao origem) {


        int linhaAtual = origem.getLinhas() + 1;
        ArrayList<Posicao> movimentos = new ArrayList<>();

        while (linhaAtual <= 8) {
            Posicao novaposicao = new Posicao(origem.getColunas(), linhaAtual);
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                linhaAtual++;
            } else if (casa.getPeca().getCor() != this.cor) {
                movimentos.add(novaposicao);
                break;
            } else {
                break;
            }

        }
        return movimentos;

    }
}
