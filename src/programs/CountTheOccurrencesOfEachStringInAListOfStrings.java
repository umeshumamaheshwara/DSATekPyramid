package programs;

import java.util.*;


public class CountTheOccurrencesOfEachStringInAListOfStrings {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {

            map.put(str,map.getOrDefault(str,0)+1);
        }
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

    }
}
