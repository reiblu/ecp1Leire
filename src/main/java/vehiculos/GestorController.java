package vehiculos;

import upm.jbb.IO;

public class GestorController {
    
    private GestordeVehiculos gestor;

    public GestorController(GestordeVehiculos gestor){
        this.gestor = gestor;
    }

    public void crearVehiculo(){
        String[] tiposVehiculo = {"Coche", "Moto", "Bicicleta"};
        String vehiculo = (String)IO.in.select(tiposVehiculo);
        int identificador = IO.in.readInt("Identificador del vehículo");
        String descripcion = IO.in.readString("Vehiculo + Descripcion del vehiculo");
        if(vehiculo.equals(tiposVehiculo[0])){
            Coche.Categoria categoria = (Coche.Categoria)IO.in.select(Coche.Categoria.values());
            gestor.addVehiculo(new Coche(identificador,descripcion,categoria));
        } else if (vehiculo.equals(tiposVehiculo[1])){
            gestor.addVehiculo(new Moto(identificador,descripcion));
        }else if (vehiculo.equals(tiposVehiculo[2])){
            gestor.addVehiculo(new Bicicleta(identificador,descripcion));
        }
        
    }
    
    public void mostrarVehiculos(){
        IO.out.println(gestor.allVehiculo());
    }
    
    public void mostrarPrecio(){
        int dias = IO.in.readInt("indique el numero de dias ");
        while(dias<0){
            IO.out.println("Dias no valido");
            dias = IO.in.readInt("indique el numero de dias ");
        }
        int identificador = IO.in.readInt("indique el identificador del vehiculo ");
        IO.out.println(gestor.calcularPrecio(identificador, dias));
    }
    
}
