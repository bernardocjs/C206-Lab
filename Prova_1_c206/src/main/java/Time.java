
import java.util.Scanner;

public class Time {
    String nome = "Cruzeiro";
    String corCamisa = "Azul";
    Scanner sc = new Scanner(System.in);
    Jogador jogadores[] = new Jogador[100];
    int n = 0;
    Estadio est1;

    void adicionarJogador( Jogador jogador){
        System.out.println("Insira o nome do Jogador");
        jogador.nome = sc.nextLine();
        System.out.println("Insira o numero da camisa");
        jogador.nCamisa = sc.nextInt();
        System.out.println("Insira true caso ele seja da base e false caso nao");
        jogador.base = sc.nextBoolean();
        System.out.println("Digite o salario do jogador");
        jogador.salario = sc.nextDouble();
        jogadores[n] = jogador;
        n++;
    }

    void mostrarInfo(){

        System.out.println("Infos do time:");
        System.out.println("Nome do time: " + nome);
        System.out.println("A cor da camisa do time é "+corCamisa);

        System.out.println("---------------------");
        System.out.println("Infos do estadio");
        System.out.println("O nome do estadio e " + est1.nome);
        System.out.println("Ele consegue armazenar até "+est1.capaidade + " pessoas");
        System.out.println("Ele é localizado na cidade de " +est1.cidade);

        System.out.println("---------------------");
        System.out.println("Jogadores:");
        for (int i = 0; i < jogadores.length; i++) {
            if(jogadores[i] != null){
                System.out.println("Infos do jogador "+ jogadores[i].nome);
                jogadores[i].mostrarInfo();
                }
        }

    }

    double calculaTotalSalario() {
       double totalSalario = 0;
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                totalSalario += jogadores[i].salario;
            }
        }
        return totalSalario;
    }

    void jogadoresBase(){
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null){
            if(jogadores[i].base) {
                System.out.println("O nome do jogador é " + jogadores[i].nome);
                System.out.println("O numero do jogador é " + jogadores[i].nCamisa);
                System.out.println("O salario dele e " + jogadores[i].salario);
                System.out.println();
            }
            }

        }
    }
}
