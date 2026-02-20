package programs;


import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheSecondNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        String str = "aabcbcdeffxyz";

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
