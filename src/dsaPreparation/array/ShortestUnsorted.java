package dsaPreparation.array;

public class ShortestUnsorted {
    public static void main(String[] args) {

        int[] nums = {2,6,4,8,10,9,15};

        int n = nums.length;

        int start = -1;
        int end = -2;

        int max = nums[0];
        int min = nums[n-1];

        for (int i = 1; i < n; i++) {

            // ---------- LEFT → RIGHT (find end) ----------
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                end = i;
            }
            // ---------- RIGHT → LEFT (find start) ----------
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[n - 1 - i] > min) {
                start = n - 1 - i;
            }
        }

        int length = end - start + 1;
        System.out.println("Length of shortest unsorted subarray: " + length);
    }
}


