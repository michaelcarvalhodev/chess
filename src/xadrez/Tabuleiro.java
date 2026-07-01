package xadrez;

public class Tabuleiro {

    private Casa[][] casas = new Casa[8][8];


    public Tabuleiro() {

        for (int i = 0; i < casas.length; i++) {

            for (int j = 0; j < casas[i].length; j++) {

                char coluna = (char) ('A' + j);

                Posicao posicao = new Posicao(coluna, i + 1);

                casas[i][j] = new Casa(posicao);


            }
        }
    }

    public void imprimir() {

        for (int i = 7; i >= 0; i--) {

            for (int j = 0; j < casas[i].length; j++) {

                System.out.print(casas[i][j] + " ");

            }
                System.out.println();
        }

    }

    public Casa getCasa(Posicao posicao){

        if (!posicao.estaDentroDoTabuleiro()){
            throw new IllegalArgumentException("Posicao nao encontrada no tabuleiro");
        }

        int indiceLinha = posicao.getLinhas() - 1;
        int indiceColuna = posicao.getColunas() - 'A';

        return casas[indiceLinha][indiceColuna];
    }

    public void colocarPeca(Peca peca, Posicao posicao){

        Casa casa = getCasa(posicao);
        casa.setPeca(peca);

    }

}
 