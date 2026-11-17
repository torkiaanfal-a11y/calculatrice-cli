package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractOperationTest {

    @Test
    public void testCalculer() {
        Operation op = new SubtractOperation();
        assertEquals(2.0, op.calculer(5.0, 3.0), 0.001);
        assertEquals(5.0, op.calculer(2.0, -3.0), 0.001);
        assertEquals(1.1, op.calculer(3.3, 2.2), 0.001);
    }

    @Test
    public void testGetSymbole() {
        Operation op = new SubtractOperation();
        assertEquals("-", op.getSymbole());
    }
}