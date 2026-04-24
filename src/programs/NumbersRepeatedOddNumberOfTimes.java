package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersRepeatedOddNumberOfTimes {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,20,10,30,40,50,50);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer no:list){
            map.put(no,map.getOrDefault(no,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() %2 !=0){
                System.out.println(entry.getKey());
            }
        }
    }
}
