public class PedidoHamburguesa extends Pedido {
    private boolean comboCompleto;
    private int nivelPicante;

    public PedidoHamburguesa(String cliente, String direccion, double precioBase, boolean delivery, boolean combo, int picante) {
        super(cliente, direccion, precioBase, TipoComida.HAMBURGUESA, delivery);
        this.comboCompleto = combo;
        this.nivelPicante = picante;
    }

    @Override
    public double calcularCostoTotal() {
        double costo = getPrecioBase();
        if (isDelivery()) {
            costo += 2.80; // Costo delivery hamburguesa
        }
        return costo;
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = 15; // Tiempo base
        if (isDelivery()) {
            tiempo += 10;
        }
        return tiempo;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("--- Detalle Hamburguesa ---");
        System.out.println("Es combo: " + (comboCompleto ? "Sí" : "No"));
        System.out.println("Nivel picante: " + nivelPicante);
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("Pedido de " + getCliente() + " (" + getTipo() + ")");
        System.out.println("Dirección: " + getDireccion());
    }

}
