package dsaPreparation.array;

import java.util.HashMap;

public class PrefixSumSubarrayForSumK {
    public static void main(String[] args) {

        int []  arr = {1,2,3,4,5};
        int k = 3;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){

            prefixSum = prefixSum + arr[i];
            /* 1    = 0 + 1
               3    = 1 + 2
               6    = 3 + 3

            */

            if(map.containsKey(prefixSum - k)){
                /*  1-3 = -2
                    3-3 =  0  ---> enters
                    6-3 =  3  ---> enters
                */

                count = count + map.get(prefixSum - k);   //1 ,  1

            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        System.out.println(count);

    }
}
