package xadrez;

import xadrez.pecas.Torre;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("XADREZ.com");

        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.imprimir();


        Torre torre = new Torre(Cor.Branca);
        Posicao origem = new Posicao('D', 1);

        List<Posicao> movimentos = torre.movimentosPossiveis(tabuleiro, origem);
        System.out.println(movimentos);




    }
}
