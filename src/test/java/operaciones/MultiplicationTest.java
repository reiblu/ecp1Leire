package operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest extends OperationTest {

    private Multiplication multiplicacion;

    @Before
    public void inicializar() {
        multiplicacion = new Multiplication(2, 2);
    }

    @Test
    public void testOperar() {
        assertEquals(4, multiplicacion.operar());
    }

}
