package programs;

public class MaxSubArraysOfKey {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = 0;
        int windowSum = 0;

        // First window
        for(int i = 0; i < k; i++) {
            windowSum =  windowSum + arr[i];
        }

        maxSum = windowSum;

        //Slide window

        for(int i = k; i < arr.length; i++) {    // 3

            windowSum = windowSum - arr[i - k] + arr[i];
            //   7    =    8   -     2    +    1
            //   9    =    7   -     1    +    3
            //   6    =    9   -     5    +    2

            maxSum = Math.max(maxSum, windowSum);  // (8,7)  -> 8, (8,9) -> 9
        }

        System.out.println("Maximum sum: " + maxSum);

    }
}
