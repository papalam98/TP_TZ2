import static org.junit.Assert.*;
import org.junit.Test;

public class NumbersProcessorSpeedTest {

    @Test
    public void testPerformance() {
        // Генерируем файлы с разным количеством чисел
        for (int size = 10000; size <= 10000000; size += 100000) {
            int[] numbers = generateNumbers(size);
            long startTime = System.currentTimeMillis();
            NumbersProcessor._sum(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер файла: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    private int[] generateNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
