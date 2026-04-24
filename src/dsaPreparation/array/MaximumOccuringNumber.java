package dsaPreparation.array;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,2,3,4,2};
        int max = 0;
        int result = -1;

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){

                System.out.println(entry.getKey());

            }
        }
        System.out.println("Frequency: " + max);


    }
}
