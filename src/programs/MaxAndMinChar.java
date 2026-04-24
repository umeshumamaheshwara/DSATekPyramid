package programs;

import java.util.HashMap;
import java.util.Map;

public class MaxAndMinChar {
    public static void main(String[] args) {
        String str = "Javasendhan";

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        int min = Integer.MAX_VALUE;
        int max = 0;

        char maxChar = ' ';
        char minChar = ' ';

        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){

            if (entry.getValue()>max){

                max = entry.getValue();
                maxChar = entry.getKey();


            }else if (entry.getValue()<min){
                min = entry.getValue();
                minChar = entry.getKey();
            }
        }
        System.out.println(maxChar+" "+minChar);

    }
}
