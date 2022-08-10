import java.util.Random;

public class Desafio1_Lab {
    public static void main(String[] args) {
        Random rd = new Random();
        int n;

        for(int i = 0; i <= 2; i++){
            n = rd.nextInt(100);
            if(n % 2 == 0)
                System.out.println("O numero " + n + " é par");
            else System.out.println("O numero " + n + " é impar");

        }
    }
}
