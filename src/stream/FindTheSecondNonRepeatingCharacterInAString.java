package stream;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSecondNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        String str = "aabcbcdeffxyz";


        Map.Entry<Character, Long> characterLongEntry = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).skip(1).findFirst().orElse(null);

        System.out.println(characterLongEntry);


    }
}
