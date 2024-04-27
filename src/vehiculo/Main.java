package vehiculo;

/**
 * @author Samuel
 */
public class Main {

    public static void main(String[] args) {
        VehiculoXXX2223 miVehiculoXXX2223;
        int stockActual;

        miVehiculoXXX2223 = new VehiculoXXX2223("Seat", 18000, 100);

        operativaVehiculosXXX2223(miVehiculoXXX2223);

        stockActual = miVehiculoXXX2223.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    /**
     * Función para comprar y vender un vehículo que le pasamos por parámetro
     * @param miVehiculoXXX2223 Objeto de la clase VehiculoXXX2223
     */
    public static void operativaVehiculosXXX2223(VehiculoXXX2223 miVehiculoXXX2223) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }

        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
    }
}
