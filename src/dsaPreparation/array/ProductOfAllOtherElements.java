package dsaPreparation.array;

import java.util.Arrays;

public class ProductOfAllOtherElements {
    public static void main(String[] args) {

        int [] arr = {1,2,4,6};
        int n = arr.length;
        int[] result = new int[n];

        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i-1] * arr[i-1];
            /* 0      =   1
               1      =   1 *  1
               2      =   1 *  2
               3      =   2  * 4
               [1,1,2,8]
            */
        }
        int right = 1;
        for(int i = n-1; i >= 0; i--){
            result[i] = result[i] * right;
             /*  3 = (8)  8 * 1
                 2 = (12) 2 * 6
                 1 = (24) 1 * 24
                 0 = (48) 1 * 48
              */
            right = right * arr[i];
            /*
                6  = 1 * 6
                24 = 6 * 4
                48 = 24 * 2
             */
        }
        System.out.println(Arrays.toString(result));

    }
}
