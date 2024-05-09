import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.Random;

public class TimeGraph {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int dataSize = 100; dataSize <= 1000; dataSize += 100) {
            int[] randomArray = generateRandomArray(dataSize);
            long startTime = System.nanoTime();
            int sum = sumArray(randomArray);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            dataset.addValue(duration, "Time", String.valueOf(dataSize));
        }

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Зависимость памяти от объема данных",
                "Объем данных",
                "Время (мс)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(lineChart);
        JFrame frame = new JFrame("Зависимость памяти от объема данных");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
