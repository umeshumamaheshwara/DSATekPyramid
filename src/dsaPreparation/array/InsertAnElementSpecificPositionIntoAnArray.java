package dsaPreparation.array;

import java.util.Arrays;

public class InsertAnElementSpecificPositionIntoAnArray {
    public static void main(String[] args) {

        int [] arr  = {10,20,30,40,50,60,70,80,90};

        int element = 25;
        int pos = 2;

        int [] result =  new int [arr.length + 1];

        for(int i=0; i<arr.length; i++){
            result[i] = arr[i];
        }

        result[pos] = element;
        for (int i =pos  ; i < arr.length ; i++){

            result[i+1] = arr[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
