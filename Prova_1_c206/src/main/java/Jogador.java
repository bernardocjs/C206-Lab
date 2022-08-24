public class Jogador {
    String nome;
    double salario;
    int nCamisa;
    boolean base;

    void mostrarInfo(){
        System.out.println("Jogador camisa " +nCamisa);
        System.out.println("Nome completo: "+nome);
        System.out.println("Possui um salario de R$" +salario );
       if(base)
           System.out.println("O jogador e da base");
       else
           System.out.println("O jogador nao e da base");
    }
}
