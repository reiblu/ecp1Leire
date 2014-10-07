package vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {
    
    private Bicicleta bicicleta;
    
    @Before
    public void inicializar(){
        bicicleta = new Bicicleta(1,"nueva bicicleta");
    }

    @Test
    public void testCalcularPrecio() {
        fail("Not yet implemented");
    }

}
