import java.util.Random;

public class Tabela {

    char tabela[8][8];
    int minas[8][8];
    int dj[] = {1, 0, -1, 0};
    int bombas[
    i][j];
    int di[] = {0, 1, -1, 0};
    int vis[8][8];
    bool ocup = false;
    Random rd = new Random();
    int n;

    void criaTabela() {

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <; j++) {
                minas[i][j] = 0;
            }
        }
    }

    void criandoBombas() {

        for (int i = 0; i <= 7; i++) {

            while (!ocup) {
                li = rd.nextInt(8);
                col = rd.nextInt(8);
                if (minas[li][col] != -1) {
                    minas[li][col] = -1;
                    ocup = true;
                } else {
                    if (li == 3) {
                        li = 1;
                    } else li++;
                    if (col == 3) {
                        col = 1;
                    } else col++;

                }
            }
        }
    }

    boolean isValid(int i, int j) {
        if (i < 1 || i > 8 || j < 1 || j > 8)
            return false;
        return true;
    }

    void criarProximidade() {

        for (int i = 0; i <; i++) {
            for (int j = 0; j <; j++) {
                for (int k = 0; k < 4; k++) {
                    int iv = i + di[k];
                    int jv = j + dj[k];

                    if (minas[i][j] != -1)
                        if (isValid(iv, jv)) {
                            if (minas[iv][jv] == -1)
                                minas[i][j]++;
                        }
                }
            }
        }

    }

}




}
