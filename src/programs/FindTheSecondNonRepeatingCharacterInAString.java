package programs;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSecondNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        String str = "aabcbcdeffxyz";


        str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).skip(1).findFirst().ifPresent(System.out::println);

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c :str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int count = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if (entry.getValue() == 1){
               count++;
                if(count == 2){
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}
