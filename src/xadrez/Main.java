package xadrez;

import xadrez.pecas.Bispo;
import xadrez.pecas.Torre;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.imprimir();


        Bispo bispo = new Bispo (Cor.Branca);
        Posicao origemtest = new Posicao('D', 4);

        Bispo bispo1 = new Bispo(Cor.Preta);

        Posicao origemtest1 = new Posicao('E',3);

        tabuleiro.colocarPeca(bispo, origemtest);
        tabuleiro.colocarPeca(bispo1, origemtest1);

        List<Posicao> movimentos = bispo.movimentosPossiveis(tabuleiro, origemtest);
        System.out.println(movimentos);




    }
}
