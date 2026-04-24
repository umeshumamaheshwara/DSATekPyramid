package programs;

import java.util.*;

public class MissingELementsFromTheSeries {
    public static void main(String[] args) {

        int[] arr = {4, 2, 9};

        List<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        for (Integer a :arr){
            list.add(a);
        }

        int min = Collections.min(list);
        int max = Collections.max(list);
        for(int i= min; i<=max; i++){

            if(!list.contains(i))
                System.out.println(i);
        }
    }
}
