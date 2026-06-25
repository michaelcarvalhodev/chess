package xadrez.pecas;

import xadrez.*;

import java.util.ArrayList;
import java.util.List;

public class Cavalo extends Peca {

    public Cavalo(Cor cor) {
        super(cor);
    }

    @Override
    public List<Posicao> movimentosPossiveis(Tabuleiro tabuleiro, Posicao origem) {

        ArrayList<Posicao> movimentos = new ArrayList<>();

        int[] deltaLinha = {2, 2, -2, -2, 1, -1, 1, -1};
        int[] deltaColuna = {1, -1, 1, -1, 2, 2, -2, -2};

        for (int i = 0; i < deltaLinha.length; i++) {

            int linhaAtual = origem.getLinhas() + deltaLinha[i];
            char colunaAtual = (char) (origem.getColunas() + deltaColuna[i]);

            Posicao novaposicao = new Posicao(colunaAtual, linhaAtual);

            if (novaposicao.estaDentroDoTabuleiro()) {
                Casa casa = tabuleiro.getCasa(novaposicao);

                if (casa.estaVazia()) {

                    movimentos.add(novaposicao);

                } else if (casa.getPeca().getCor() != this.cor) {
                    movimentos.add(novaposicao);
                    
                }

            }

        }
        return movimentos;
    }

}
