import java.util.Scanner;

public class Exercicio2_Lab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decisao;
        decisao = sc.nextInt();

        if(decisao == 1){
            System.out.println("Pedra");
        } else if (decisao == 2) {
            System.out.println("Papel");
        }
        else if(decisao == 3) {
            System.out.println("Tesoura");
        }
        else System.out.println("NULL");

        sc.close();
    }
}
