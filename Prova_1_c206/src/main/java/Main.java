import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Time time = new Time();
        Estadio est1 = new Estadio();
        est1.nome = "Mineirao";
        est1.capaidade = 2000;
        est1.cidade = "Belo Horizonte";
        time.est1 = est1;


        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOLHA UMA DAS SEGUINTES OPCOES");
        System.out.println("1 - Adicionar um novo jogador ao time");
        System.out.println("2 - Adicionar informacoes sobre o time");
        System.out.println("3 - Verificar o salario total do time");
        System.out.println("4 - Mostrar jogadores da base");
        System.out.println("-1 - Sair da Aplicacao");
        n = sc.nextInt();
        while (n != -1) {
            switch (n) {
                case 1:
                    Jogador jogador = new Jogador();
                    time.adicionarJogador(jogador);
                    break;
                case 2:
                    System.out.println("Estas são todas as informações sobre o time, jogadores e estadios");
                    time.mostrarInfo();
                    break;

                case 3:
                    System.out.println("A soma total dos salarios e " + time.calculaTotalSalario());
                    break;
                case 4:
                    System.out.println("Os jogadores da base sao:");
                    time.jogadoresBase();
                    break;

                default:
                    System.out.println("Nao reconheci seu comando");
                    break;
            }


            System.out.println("ESCOLHA UMA DAS SEGUINTES OPCOES");
            System.out.println("1 - Adicionar um novo jogador ao time");
            System.out.println("2 - Adicionar informacoes sobre o time");
            System.out.println("3 - Verificar o salario total do time");
            System.out.println("4 - Mostrar jogadores da base");
            System.out.println("-1 - Sair da Aplicacao");
            n = sc.nextInt();
        }
    }
}
