package vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotoTest {
    
    private Moto moto;
    
    @Before
    public void inicializar(){
        moto = new Moto(1,"nueva moto");
    }

    @Test
    public void testCalcularPrecio() {
        fail("Not yet implemented");
    }

}
