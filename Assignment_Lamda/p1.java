import java.util.ArrayList;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(8);
        numbers.add(15);
        numbers.add(3);
        numbers.add(20);
        numbers.add(6);
        numbers.add(9);

        List<Integer> filteredNumbers = new ArrayList<>();
        numbers.forEach(num -> {
            if (num < 10) {
                filteredNumbers.add(num);
            }
        });

        System.out.println(filteredNumbers);
    }
}
