import java.util.ArrayList;
import java.util.List;

public class MainPizzeria {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();

        String[] extras = {"Queso", "Peperoni"};
        pedidos.add(new PedidoPizza("Argely", "Esmeraldas Centro", 12.50, true, "Grande", extras));

        pedidos.add(new PedidoHamburguesa("Juan", "Las Palmas", 8.00, false, true, 5));

        for (Pedido p : pedidos) {
            p.mostrarResumenPedido();
            p.mostrarDetallesEspeciales();
            System.out.println("Total: $" + p.calcularCostoTotal());
            System.out.println("Tiempo: " + p.estimarTiempoEntrega() + " min");
            System.out.println("-----------------------------");
        }
    }
}