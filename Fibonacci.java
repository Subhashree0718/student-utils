import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> series(int n) {
        List<Integer> list = new ArrayList<>();
        if (n <= 0) return list;
        list.add(0);
        if (n == 1) return list;
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list;
    }
}
