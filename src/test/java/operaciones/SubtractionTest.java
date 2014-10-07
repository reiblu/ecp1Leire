package operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubtractionTest extends OperationTest {

    private Subtraction resta;

    @Before
    public void inicializar() {
        resta = new Subtraction(4, 2);
    }

    @Test
    public void testOperar() {
        assertEquals(2, resta.operar());
    }

}
