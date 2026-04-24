package dsaPreparation.array;

import java.util.Arrays;

public class FindMinMaxIndexRangeToSortArray {
    public static void main(String[] args) {

        int[] arr = {2,6,4,8,10,9,15};

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int start = arr.length;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != sorted[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }

        if (start == arr.length)
            System.out.println("Already sorted");
        else
            System.out.println("Sort range: " + start + " to " + end);
    }
}
