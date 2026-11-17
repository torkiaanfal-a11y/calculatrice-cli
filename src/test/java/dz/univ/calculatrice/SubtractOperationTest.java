
package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractOperationTest {

    private final SubtractOperation operation = new SubtractOperation();

    @Test
    void testPositiveNumbers() {
        assertEquals(5.0, operation.calculer(10, 5));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5.0, operation.calculer(-10, -5));
    }

    @Test
    void testDecimalNumbers() {
        assertEquals(2.5, operation.calculer(5.5, 3.0));
    }
}
