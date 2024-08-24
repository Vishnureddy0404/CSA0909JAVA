import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CentralTendency {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 8, 5, 12, 14, 21, 13, 18, 18};

        System.out.println("Mean: " + mean(numbers));
        System.out.println("Median: " + median(numbers));
        System.out.println("Mode: " + mode(numbers));
    }

    public static double mean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static double median(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 0) {
            return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            return numbers[numbers.length / 2];
        }
    }

    public static int mode(int[] numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = numbers[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
