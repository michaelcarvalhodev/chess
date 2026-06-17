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

        int linhaAtual;
        char colunaAtual;

        ArrayList<Posicao> movimentos = new ArrayList<>();

        //Direção Cima
        linhaAtual = origem.getLinhas() + 1;
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


        //Direção BAIXO
        linhaAtual = origem.getLinhas() - 1;
        while (linhaAtual >= 1) {

            Posicao novaposicao = new Posicao(origem.getColunas(), linhaAtual);
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                linhaAtual--;
            } else if (casa.getPeca().getCor() != this.cor) {
                movimentos.add(novaposicao);
                break;
            } else {
                break;
            }

        }

        //Direção direita
        colunaAtual = (char)(origem.getColunas() + 1);
        while (colunaAtual <= 'H') {

            Posicao novaposicao = new Posicao(colunaAtual, origem.getLinhas());
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                colunaAtual++;
            } else if (casa.getPeca().getCor() != this.cor) {
                movimentos.add(novaposicao);
                break;
            } else {
                break;
            }

        }

        //Direção esquerda
        colunaAtual = (char)(origem.getColunas() - 1);
        while (colunaAtual >= 'A') {

            Posicao novaposicao = new Posicao(colunaAtual, origem.getLinhas());
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                colunaAtual--;
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
