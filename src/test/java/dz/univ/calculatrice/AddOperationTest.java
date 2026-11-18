package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOperationTest {

    @Test
    public void testCalculer() {
        Operation op = new AddOperation();
        assertEquals(5.0, op.calculer(2.0, 3.0), 0.001);
        assertEquals(-1.0, op.calculer(2.0, -3.0), 0.001);
        assertEquals(5.5, op.calculer(2.2, 3.3), 0.001);
    }

    @Test
    public void testGetSymbole() {
        Operation op = new AddOperation();
        assertEquals("+", op.getSymbole());
    }
}