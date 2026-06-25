package xadrez;

import xadrez.pecas.Bispo;
import xadrez.pecas.Cavalo;
import xadrez.pecas.Torre;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.imprimir();


        Cavalo cavalo = new Cavalo(Cor.Branca);
        Posicao origemtest = new Posicao('D', 4);
        tabuleiro.colocarPeca(cavalo, origemtest);

        Torre torre = new Torre(Cor.Preta);
        Posicao torretest = new Posicao('E', 6);
        tabuleiro.colocarPeca(torre, torretest);

        Torre torre2 = new Torre(Cor.Branca);
        Posicao torretest2 = new Posicao('C', 6);
        tabuleiro.colocarPeca(torre2, torretest2);

        Bispo bispo = new Bispo(Cor.Branca);
        Posicao bispotest = new Posicao('D', 5);
        tabuleiro.colocarPeca(bispo, bispotest);

        Torre torre3 = new Torre(Cor.Preta);
        Posicao torretest3 = new Posicao('E',4);
        tabuleiro.colocarPeca(torre3,torretest3);

        Torre torre4 = new Torre(Cor.Branca);
        Posicao torretest4 = new Posicao('D',3);
        tabuleiro.colocarPeca(torre4,torretest4);





        List<Posicao> movimentos = cavalo.movimentosPossiveis(tabuleiro, origemtest);
        System.out.println(movimentos);




    }
}
