package vehiculos;

public class Moto extends Vehiculo {

    public Moto(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public int calcularPrecio(int dias) {
        if (dias < 7) {
            return 8 * dias;
        } else {
            return (8 * 7) + (7 * (dias - 7));
        }
    }

}
