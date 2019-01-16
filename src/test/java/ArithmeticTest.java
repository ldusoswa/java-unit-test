import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticTest {
    @Test
    public void testSum() {
        Arithmetic arithmetic = new Arithmetic();

        int[] numbers = new int[] {30, 20, 40, 10};
        int result = arithmetic.sum(numbers);
        assertEquals(100, result);
    }
}