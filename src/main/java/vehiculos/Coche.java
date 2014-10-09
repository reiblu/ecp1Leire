package vehiculos;

public class Coche extends Vehiculo {
    
    public enum Categoria {
        A,
        B,
        C
    }
    
    private Categoria categoria;

    public Coche(int id, String descripcion, Categoria categoria) {
        super(id, descripcion);
        this.categoria = categoria;
    }

    @Override
    public int calcularPrecio(int dias) {
        // TODO Auto-generated method stub
        return 0;
    }

}
