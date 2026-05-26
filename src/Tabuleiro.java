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
}
