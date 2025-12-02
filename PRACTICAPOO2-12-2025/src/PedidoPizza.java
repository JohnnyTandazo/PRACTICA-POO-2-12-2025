public class PedidoPizza extends Pedido {
    private String tamanio;
    private String[] ingredientesExtras;

    public PedidoPizza(String cliente, String direccion, double precioBase, boolean delivery, String tamanio, String[] ingredientes) {
        super(cliente, direccion, precioBase, TipoComida.PIZZA, delivery);
        this.tamanio = tamanio;
        this.ingredientesExtras = ingredientes;
    }

    @Override
    public double calcularCostoTotal() {
        double costo = getPrecioBase();
        if (isDelivery()) {
            costo += 3.50; // Costo delivery pizza
        }
        return costo;
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = 25; // Tiempo base
        if (isDelivery()) {
            tiempo += 10;
        }
        return tiempo;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("--- Detalle Pizza ---");
        System.out.println("Tamaño: " + tamanio);
        System.out.print("Extras: ");
        for (String ing : ingredientesExtras) {
            System.out.print(ing + " ");
        }
        System.out.println();
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("Pedido de " + getCliente() + " (" + getTipo() + ")");
        System.out.println("Dirección: " + getDireccion());
    }
}
