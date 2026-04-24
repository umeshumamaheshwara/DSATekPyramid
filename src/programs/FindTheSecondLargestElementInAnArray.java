package programs;


public class FindTheSecondLargestElementInAnArray {
    public static void main(String[] args) {

        int [] arr = {2, 3, 1, 15, 9, 35, 65, 42, 65, 2, 7, 5};

        int max1 = arr[0];
        int max2 = max1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);

    }
}
