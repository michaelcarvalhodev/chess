package xadrez.pecas;

import xadrez.*;

import java.util.ArrayList;
import java.util.List;

public class Bispo extends Peca {


    public Bispo(Cor cor) {
        super(cor);
    }

    @Override
    public List<Posicao> movimentosPossiveis(Tabuleiro tabuleiro, Posicao origem) {

        int linhaAtual;
        char colunaAtual;

        ArrayList<Posicao> movimentos = new ArrayList<>();

        //Direção Cima direita
        linhaAtual = origem.getLinhas() + 1;
        colunaAtual = (char)(origem.getColunas() + 1);

        while (linhaAtual <= 8 && colunaAtual <= 'H') {

            Posicao novaposicao = new Posicao(colunaAtual, linhaAtual);
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                linhaAtual++;
                colunaAtual++;

            } else if (casa.getPeca().getCor() != this.cor) {
                movimentos.add(novaposicao);
                break;
            } else {
                break;
            }

        }

        //Cima esquerda

        linhaAtual = origem.getLinhas() + 1;
        colunaAtual = (char)(origem.getColunas() - 1);
        while (linhaAtual <= 8 && colunaAtual >= 'A') {

            Posicao novaposicao = new Posicao(colunaAtual, linhaAtual);
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                linhaAtual++;
                colunaAtual--;

            } else if (casa.getPeca().getCor() != this.cor) {
                movimentos.add(novaposicao);
                break;
            } else {
                break;
            }

        }


        //Baixo direita
        linhaAtual = origem.getLinhas() - 1;
        colunaAtual = (char)(origem.getColunas() + 1);
        while (linhaAtual >= 1 && colunaAtual <= 'H') {

            Posicao novaposicao = new Posicao(colunaAtual, linhaAtual);
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                linhaAtual--;
                colunaAtual++;

            } else if (casa.getPeca().getCor() != this.cor) {
                movimentos.add(novaposicao);
                break;
            } else {
                break;
            }

        }



//        Baixo esquerda

        linhaAtual = origem.getLinhas() - 1;
        colunaAtual = (char)(origem.getColunas() - 1);
        while (linhaAtual >= 1 && colunaAtual >= 'A') {

            Posicao novaposicao = new Posicao(colunaAtual, linhaAtual);
            Casa casa = tabuleiro.getCasa(novaposicao);

            if (casa.estaVazia()) {
                movimentos.add(novaposicao);
                linhaAtual--;
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
