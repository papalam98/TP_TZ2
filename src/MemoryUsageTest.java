import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Random;

public class MemoryUsageTest {

    @Test
    public void testMemoryUsage() {
        int dataSize = 1000000;
        int[] randomNumbers = generateRandomArray(dataSize);

        Runtime runtime = Runtime.getRuntime();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        int sum = NumbersProcessor._sum(randomNumbers);

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        long memoryUsed = memoryAfter - memoryBefore;

        assertTrue("Memory usage is less than 10 MB", memoryUsed < 10 * 1024 * 1024);
    }

    public int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
