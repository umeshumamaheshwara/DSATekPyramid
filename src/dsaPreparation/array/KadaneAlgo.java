package dsaPreparation.array;

public class KadaneAlgo {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;      // final answer start index
        int end = 0;        // final answer end index
        int tempStart = 0;  // temporary start

        for (int i = 0; i < arr.length; i++) {

            currentSum = currentSum +  arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);

        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
