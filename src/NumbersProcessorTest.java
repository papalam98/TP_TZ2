import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Scanner;

public class NumbersProcessorTest {
    @Test
    public void testMin() {
        int[] numbers = {1,25,32,108};
        assertEquals(1, NumbersProcessor._min(numbers));
    }
    @Test
    public void testMax() {
        int[] numbers = {891, 400, 2, 300};
        assertEquals(891, NumbersProcessor._max(numbers));
    }

    @Test
    public void testSum() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(10, NumbersProcessor._sum(numbers));
    }

    @Test
    public void testMult() {
        int[] numbers = {1, 5, 17, 3};
        assertEquals(255, NumbersProcessor._mult(numbers));
    }
}
