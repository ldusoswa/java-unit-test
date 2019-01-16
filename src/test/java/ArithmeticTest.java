import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class ArithmeticTest {
    @Test
    public void testSum() {
        Arithmetic arithmetic = new Arithmetic();
        List<Integer> numbers = Arrays.asList(30, 20, 40, 10);
        int result = arithmetic.sum(numbers);
        assertEquals(100, result);
    }
}