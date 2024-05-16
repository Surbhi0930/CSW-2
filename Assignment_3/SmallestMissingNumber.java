
import java.util.HashMap;

public class SmallestMissingNumber {
    public static int findSmallestMissingNumber(int[] nums) {
        HashMap<Integer, Integer> elementMap = new HashMap<>();

        for (int num : nums) {
            elementMap.put(num, 1);
        }

        for (int i = 1; i <= 10; i++) {
            if (!elementMap.containsKey(i)) {
                return i;
            }
        }

        return 11;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 8, 4, 10, 6, 5, 1}; // Example unsorted array

        int smallestMissingNumber = findSmallestMissingNumber(nums);
        System.out.println("Smallest missing positive number: " + smallestMissingNumber);
    }
}

