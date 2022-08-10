import java.util.Scanner;

public class Exercicio3_Lab {

    public static void main(String[] args) {

        int menu;
        float area;
        float base;
        float altura;
        float raio;
        float pi = 355/113;
        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha as seguintes opcoes para o calculo de area");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Circulo");

        menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("Digite a base e a altura: ");
                base = sc.nextFloat();
                altura = sc.nextFloat();
                area = base*altura;
                System.out.println("Area = " + area);
                break;
            case 2:
                System.out.println("Digite a base e a altura: ");
                base = sc.nextFloat();
                altura = sc.nextFloat();
                area = (base*altura)/2;
                System.out.println("Area = " + area);
                break;
            case 3:
                System.out.println("Digite o Raio: ");
                raio = sc.nextFloat();
                area = (raio*raio*pi);
                System.out.println("Area = " + area);
                break;
            default:
                System.out.println("Numero Invalido");
                break;
        }

    }
}
