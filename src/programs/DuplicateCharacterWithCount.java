package programs;


import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterWithCount {
    public static void main(String[] args) {

        String input = "LKIJBGJNSGHFJITHNK";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
        }
    }
}
