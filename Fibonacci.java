import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {

    // Returns Fibonacci series of n terms
    public static List<Integer> series(int n) {
        List<Integer> list = new ArrayList<>();
        if (n <= 0) {
            System.out.println("Invalid input: n must be > 0");
            return list;
        }
        list.add(0);
        if (n == 1) return list;
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list;
    }

    // Returns the series in reverse order
    public static List<Integer> reverseSeries(int n) {
        List<Integer> list = series(n);
        Collections.reverse(list);
        return list;
    }

    // Prints the series nicely
    public static void printSeries(List<Integer> list) {
        System.out.print("Fibonacci Series: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Demo method for mentor
    public static void demo() {
        int n = 7;
        System.out.println("Demo Fibonacci:");
        List<Integer> normal = series(n);
        printSeries(normal);

        List<Integer> reversed = reverseSeries(n);
        System.out.print("Reversed ");
        printSeries(reversed);
    }
}
