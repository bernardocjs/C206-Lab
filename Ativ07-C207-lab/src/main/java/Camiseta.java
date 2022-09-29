public class Camiseta extends Produto{
    private String cor = "Vermelha";
    private String tamanho = "XXL";


    @Override
    public String etiquetaPreco() {
        System.out.println("Cor da camiseta: "+cor);
        System.out.println("Tamanho: "+tamanho);
        return super.etiquetaPreco();
    }
}
