import java.util.Random;

public class Tabela {
    Random rd = new Random();
    int linhas = 3;
    int colunas = 3;
    int linhard;
    int colunard;

    int[][] minas = new int[linhas][colunas];
    void setarMatriz() {

        for (int i = 0; i <linhas; i++) {
            for (int j = 0; j <colunas; j++) {
                minas[i][j] = 0;
            }
        }
    }
    void criarMinas() {

        for (int i = 0; i <= 6; i++) {
            boolean ocupado = true;
             linhard = rd.nextInt(2);
             colunard = rd.nextInt(2);

            while (ocupado) {
                if (minas[linhard][colunard] == -1) {
                    linhard = rd.nextInt(2);
                    colunard = rd.nextInt(2);
                }
                else {
                    ocupado = false;
                    break;
                }
            }
           minas[linhard][colunard] = -1;
        }
    }
        boolean temBomba(int i, int j){
            if(minas[i][j] == -1) {
                System.out.println("Boooom, perdeste troxao, tente dnv");
                return true;
            }
            else {
                System.out.println("Se safou dessa em");
                return false;
            }
        }
}


