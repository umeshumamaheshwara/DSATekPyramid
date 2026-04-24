package dsaPreparation.array;

public class FindTheFirstAndLastOccurenceTarget {
    public static void main(String[] args) {

        int [] arr = {5,7,7,8,8,10};
        int target = 8;

        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){

                first = Math.min(first,i);
                last = Math.max(last,i);
            }

        }
        System.out.println(first+" "+last);
    }
}
