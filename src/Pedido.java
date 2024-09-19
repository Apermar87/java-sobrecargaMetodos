public class Pedido {
    private String nombrePrimerPlato;
    private String nombreSegundoPlato;
    private String nombreBebida;
    private String nombrePostre;
    private int valorPrimerPlato;
    private int valorSegundoPlato;
    private int valorBebida;
    private int valorPostre;

    public Pedido() {
        nombrePrimerPlato = "";
        nombreSegundoPlato = "";
        nombreBebida = "";
        nombrePostre = "";
        valorPrimerPlato = 0;
        valorSegundoPlato = 0;
        valorBebida = 0;
        valorPostre = 0;
    }
    
    public String getNombrePrimerPlato() {
        return nombrePrimerPlato;
    }

    public void setNombrePrimerPlato(String nombrePrimerPlato) {
        this.nombrePrimerPlato = nombrePrimerPlato;
    }

    public String getNombreSegundoPlato() {
        return nombreSegundoPlato;
    }

    public void setNombreSegundoPlato(String nombreSegundoPlato) {
        this.nombreSegundoPlato = nombreSegundoPlato;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public void setNombrePostre(String nombrePostre) {
        this.nombrePostre = nombrePostre;
    }

    public int getValorPrimerPlato() {
        return valorPrimerPlato;
    }

    public void setValorPrimerPlato(int valorPrimerPlato) {
        this.valorPrimerPlato = valorPrimerPlato;
    }

    public int getValorSegundoPlato() {
        return valorSegundoPlato;
    }

    public void setValorSegundoPlato(int valorSegundoPlato) {
        this.valorSegundoPlato = valorSegundoPlato;
    }

    public int getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(int valorBebida) {
        this.valorBebida = valorBebida;
    }

    public int getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(int valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void calcularPedido(String primerPlato, int precioPrimerPlato, String bebida, int precioBebida){
        int costeTotal = precioPrimerPlato + precioBebida;
        System.out.println("El coste total de " + primerPlato + " y " + bebida + " es: " + costeTotal);
    }

    public void calcularPedido(String primerPlato, int precioPrimerPlato, String segundoPlato, int precioSegundoPlato, String bebida, int precioBebida){
        int costeTotal = precioPrimerPlato + precioSegundoPlato + precioBebida;
        System.out.println("El coste total de " + primerPlato + ", " + segundoPlato + " y " + bebida + " es: " + costeTotal);
    }

    public void calcularPedido(String primerPlato, int precioPrimerPlato, String segundoPlato, int precioSegundoPlato, String bebida, int precioBebida, String postre, int precioPostre){
        int costeTotal = precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
        System.out.println("El coste total de " + primerPlato + ", " + segundoPlato + ", " + bebida + " y " + postre + " es: " + costeTotal);
    }

}
