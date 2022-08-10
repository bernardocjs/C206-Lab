import java.util.Scanner;

public class Exercicio1_Lab {
    public static void main(String[] args) {

        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (i != 7){

            i = sc.nextInt();
            if(i < 0 || i > 10){
                System.out.println("Numero Invalido, tente novamente");
            }
        }
        System.out.println("O numero foi um 7, é sobre isso");
        sc.close();
    }
}
