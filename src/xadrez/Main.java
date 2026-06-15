package xadrez;

import xadrez.pecas.Torre;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println("XADREZ.com");

        Tabuleiro tabuleiro = new Tabuleiro();

//        tabuleiro.imprimir();


        Torre torre = new Torre(Cor.Branca);

        Torre torreteste = new Torre(Cor.Preta);

        Posicao origem = new Posicao('D', 1);

        Posicao origemtest = new Posicao('D', 8);

        tabuleiro.colocarPeca(torreteste, origemtest);

        List<Posicao> movimentos = torre.movimentosPossiveis(tabuleiro, origem);
        System.out.println(movimentos);




    }
}
