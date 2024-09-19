public class App {
    public static void main(String[] args) throws Exception {
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();
        Pedido p3 = new Pedido();

        p1.calcularPedido("Rabo de toro", 12, "vino", 5);
        p2.calcularPedido("Filetes de pollo", 10, "ensalada", 4, "fanta naranja", 2);
        p3.calcularPedido("Sopa", 6, "macarrones", 8, "agua", 1, "Natillas", 1);
    }
}
