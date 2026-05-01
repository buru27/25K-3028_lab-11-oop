import java.util.*;

// Generic Utility Class
class GenericUtils {

    // Sort List
    public static <T extends Number & Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    // Sum of elements
    public static double calculateSum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Find maximum
    public static <T extends Number & Comparable<T>> T findMax(List<T> list) {
        return Collections.max(list);
    }
}

public class Task4 {
    public static void main(String[] args) {

        // List with different numeric types
        List<Number> list = new ArrayList<>();

        list.add(10);        // Integer
        list.add(5.5);       // Double
        list.add(20);
        list.add(3.3);
        list.add(15);

        // Separate lists for sorting (due to Comparable constraint)
        List<Double> doubleList = new ArrayList<>();

        for (Number n : list) {
            doubleList.add(n.doubleValue());
        }

        // Sorting
        GenericUtils.sortList(doubleList);

        // Sum
        double sum = GenericUtils.calculateSum(list);

        // Max
        double max = GenericUtils.findMax(doubleList);

        // Output
        System.out.println("Sorted List: " + doubleList);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}
