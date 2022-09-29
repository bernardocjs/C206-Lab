public class Principal {
    public static void main(String[] args) {

    Notebook n1 = new Notebook();
    n1.setNome("Notebook Samsung");
    n1.setPreco(5000);
        System.out.println(n1.etiquetaPreco());

        System.out.println("-----------------------");

    Camiseta c1 = new Camiseta();
    c1.setNome("Camisa vermelha polo");
    c1.setPreco(70);
        System.out.println(c1.etiquetaPreco());


    }
}
