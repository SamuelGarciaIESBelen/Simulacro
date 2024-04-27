package vehiculo;

/**
 * @author Samuel
 */
public class VehiculoXXX2223 {

    protected String nombre;
    protected double precio;
    protected double precioIVA;
    protected int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoXXX2223() {
    }
    
    /**
     * Constructor con argumentos
     * @param nom El nombre del vehículo
     * @param precio El precio al que se encuentra el vehículo
     * @param stock El stock del que se dispone del vehículo
     */
    public VehiculoXXX2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Getter para el atributo nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el atributo nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para el atributo precio
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter para el atributo precio
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter para el atributo precioIVA
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Setter para el atributo precioIVA
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Getter para el atributo stock
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter para el atributo stock
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Método para asignar el nombre del vehiculo
     * @param nom
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que me devuelve el nombre del vehiculo
     * @return nom
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return stock
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Método para comprar vehiculos. Modifica el stock.
     * @param cantidad
     * @throws Exception
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehiculos. Modifica el stock.
     * @param cantidad
     * @throws Exception 
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        setStock(getStock() - cantidad);
    }
}
