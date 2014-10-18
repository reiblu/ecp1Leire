package vehiculos;

import upm.jbb.IO;

public class MainVehiculo {

    public void run(){
        IO.in.addController(new GestorController(new GestordeVehiculos()));
        IO.main(null);
    }
    
    public static void main(String[] args) {
        new MainVehiculo().run();
    }
    
}
