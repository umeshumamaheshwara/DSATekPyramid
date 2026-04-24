package dsaPreparation.string;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

        String str = "Java programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();

        for (Character ch : set) {
            result.append(ch);
        }
        System.out.println(result.toString().trim());
    }
}
