package programs;

public class RecursionBinarySerach {
    public static void main(String[] args) {

        int[] arr = {2,5,7,9,12,15,18};
        int key = 15;

        int result = binarySearch(arr, 0, arr.length-1, key);

        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at index " + result);
    }

    static int binarySearch(int[] arr, int si, int ei, int key){

        // base case
        if(si > ei)
            return -1;

        int mid = si + (ei - si)/2;

        if(arr[mid] == key)
            return mid;

        // search left
        if(arr[mid] > key)
            return binarySearch(arr, si, mid-1, key);

        // search right
        return binarySearch(arr, mid+1, ei, key);
    }

}
