package dsaPreparation;

import java.util.Arrays;

public class RemoveDuplicatesFill1 {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,1,3,3,4,5,7,5,6};

        Arrays.sort(arr);
        int j = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] !=arr[i-1]){

                arr[j] = arr[i-1];
                j++;
            }
        }
        while (j<arr.length){
            arr[j] = -1;
            j++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
