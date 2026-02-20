package programs;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharInTheString {
    public static void main(String[] args) {

        String str = "aabbbbccdde";

        Map<Character,Integer> map = new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Integer max = 0;
        char key = ' ';

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                key = entry.getKey();
            }


        }
        System.out.println(" " +key+ " " +max);

    }
}
