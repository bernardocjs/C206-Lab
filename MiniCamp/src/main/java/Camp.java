import java.util.Scanner;

public class Camp {
    public static void main(String[] args) {
        Tabela jogo = new Tabela();

        Scanner sc = new Scanner(System.in);
        boolean naoGanho = true;
        int cont = 0;
        jogo.setarMatriz();
        jogo.criarMinas();

        while(naoGanho) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            naoGanho = jogo.temBomba(i, j);
            cont++;
        }
        System.out.println("Vc tentou " +cont + " vzs");
    }
}

