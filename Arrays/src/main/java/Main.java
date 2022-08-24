public class Main {
    public static void main(String[] args) {

        Conta[] teste = new Conta[10];

        for (Conta aux : teste)
            if(aux == null)
                continue;
            else
                System.out.println(aux);

        System.out.println();
    }
}