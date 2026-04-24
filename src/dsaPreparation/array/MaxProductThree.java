package dsaPreparation.array;

public class MaxProductThree {
    public static void main(String[] args) {

        int[] arr = {-10, -10, 5, 2};

        int max1=Integer.MIN_VALUE ;
        int max2=Integer.MIN_VALUE ;
        int max3=Integer.MIN_VALUE ;
        int min1=Integer.MAX_VALUE ;
        int min2=Integer.MAX_VALUE ;

        for (int num : arr){

            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num > max2){
                max3 = max2;
                max2 = num;
            }
            else if(num > max3){
                max3 = num;
            }

            // update minimums
            if(num < min1){
                min2 = min1;
                min1 = num;
            }
            else if(num < min2){
                min2 = num;
            }
        }

        int option1 = max1*max2*max3;
        int option2 = min1*min2*max1;

        int max = Math.max(option1, option2);
        int  min = Math.min(option1, option2);

        System.out.println(max);
        System.out.println(min);

     }
}

