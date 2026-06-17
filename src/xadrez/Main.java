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

        tabuleiro.colocarPeca(bispo, origemtest);

        List<Posicao> movimentos = bispo.movimentosPossiveis(tabuleiro, origemtest);
        System.out.println(movimentos);




    }
}
