import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Dictionary (Map) to hold counts
        Map<Integer, Integer> multipleCount = new LinkedHashMap<>();

        // Initialize dictionary with 0 counts
        for (int i = 1; i <= 9; i++) {
            multipleCount.put(i, 0);
        }

        // Count multiples
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multipleCount.put(i, multipleCount.get(i) + 1);
                }
            }
        }

        // Print output
        System.out.println(multipleCount);
    }
}

