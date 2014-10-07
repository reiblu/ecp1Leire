package vehiculos;

public abstract class Vehiculo {

    private int id;
    private String descripcion;
    private int precio;
    private char categoria;
    
    public Vehiculo(int id, String descripcion, int precio) {
        super();
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public char getCategoria() {
        return categoria;
    }
    
    public abstract int precio();

}
