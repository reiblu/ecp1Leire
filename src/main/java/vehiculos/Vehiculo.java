package vehiculos;

public abstract class Vehiculo {

    private int id;
    private String descripcion;
    
    public Vehiculo(int id, String descripcion) {
        super();
        this.id = id;
        this.descripcion = descripcion;
        
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public abstract int calcularPrecio(int dias);

}
