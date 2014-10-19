package vehiculos;

public class Bicicleta extends Vehiculo {

    public Bicicleta(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public int calcularPrecio(int dias) {
        if (dias < 3) {
            return 3 * dias;
        } else {
            return (3*2)+(2*(dias-2));
        }
    }

}
