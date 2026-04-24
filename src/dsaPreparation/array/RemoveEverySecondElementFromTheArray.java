package dsaPreparation.array;

import java.util.Arrays;

public class RemoveEverySecondElementFromTheArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};

        int size = (arr.length +1) / 2;

        int index = 0;

        int [] arr1 = new int[size];

        for(int i=0; i<arr.length; i=i+2){
            arr1[index++] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
