package operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SummationTest extends OperationTest {

    private Summation suma;

    @Before
    public void inicializar() {
        suma = new Summation(3, 4);
    }

    @Test
    public void testOperar() {
        assertEquals(7, suma.operar());
    }

}
