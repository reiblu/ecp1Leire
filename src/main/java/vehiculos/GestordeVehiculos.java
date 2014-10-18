package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class GestordeVehiculos {

    private Map<Integer, Vehiculo> vehiculos;

    public GestordeVehiculos() {

        vehiculos = new HashMap<Integer, Vehiculo>();

    }

    public void addVehiculo(Vehiculo vehiculo) {

       vehiculos.put(vehiculo.getId(), vehiculo);
    }

    public String allVehiculo() {
        String cadena = "";
        for (Vehiculo vehiculo : vehiculos.values()) {
            cadena += vehiculo.getDescripcion();
            cadena += "\n\n";
        }
        
        return cadena;
    }

    public int calcularPrecio(int id, int dias) {

        return vehiculos.get(id).calcularPrecio(dias);
        
    }

}
