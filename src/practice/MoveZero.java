package practice;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0, 4, 0, 5, 2, 0, 3};

        int index = 0;

        for(int num : arr){
            if(num != 0){
                arr[index++] = num;
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
