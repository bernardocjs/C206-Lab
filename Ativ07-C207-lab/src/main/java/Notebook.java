public class Notebook extends Produto{

    private double armazenamento = 500;
    private String gpu = "GTX 1660S";
    private String processador = "Intel 11400f";

    @Override
    public String etiquetaPreco() {
        System.out.println("Armazenamento: "+armazenamento+ " GB");
        System.out.println("GPU: "+gpu);
        return super.etiquetaPreco();
    }
}
