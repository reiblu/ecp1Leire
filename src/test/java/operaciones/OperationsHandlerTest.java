package operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperationsHandlerTest {

    private OperationsHandler operaciones;

    @Before
    public void inicializar() {
        operaciones = new OperationsHandler();
        operaciones.addOperation(new Summation(3, 2));
        operaciones.addOperation(new Summation(6, 5));
        operaciones.addOperation(new Multiplication(2,5));
        operaciones.addOperation(new Subtraction(8,4));
    }

    @Test
    public void testReset() {
       this.operaciones.reset();
       assertEquals(0, operaciones.total(), 10e-1);
    }

    @Test
    public void testTotal() {
        assertEquals(30, operaciones.total(), 10e-1);
    }

}
