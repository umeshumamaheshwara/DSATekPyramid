package dsaPreparation.array;

import java.util.HashSet;

public class FindDuplicateValuesInAnArrayOfIntegerValues {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,20,30,30,20,60};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : arr) {
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);

    }
}
