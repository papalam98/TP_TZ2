import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersProcessor {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersStr = line.split(" ");
            int[] numbers = new int[numbersStr.length];
            for (int i = 0; i < numbersStr.length; i++) {
                numbers[i] = Integer.parseInt(numbersStr[i]);
            }
            scanner.close();

            int min = _min(numbers);
            int max = _max(numbers);
            int sum = _sum(numbers);
            long mult = _mult(numbers);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    static int _min(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    static int _max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static int _sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static long _mult(int[] numbers) {
        long mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
