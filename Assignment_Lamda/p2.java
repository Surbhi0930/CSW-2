import java.util.*;

public class p2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        strings.sort((s1, s2) -> s2.length() - s1.length());

        System.out.println(strings);
    }
}

