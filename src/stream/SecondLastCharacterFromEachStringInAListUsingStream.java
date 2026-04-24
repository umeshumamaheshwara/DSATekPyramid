package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLastCharacterFromEachStringInAListUsingStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Stream", "Code");

        List<Character> collect = list.stream().filter(s -> s.length() > 2)
                .map(s -> s.charAt(s.length() - 2))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
