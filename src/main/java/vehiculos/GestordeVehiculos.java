package vehiculos;

public class GestordeVehiculos {

    private Vehiculo[] vehiculos;

    public GestordeVehiculos() {

        vehiculos = new Vehiculo[10];

    }

    public void addVehiculo(Vehiculo vehiculo) {

        for (int i = 0; i < this.vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
            }
        }

    }

    public String allVehiculo() {
        String cadena;
        for (int i = 0; i < vehiculos.length; i++) {
            
        }
        return null;
    }

}
