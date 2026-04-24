package dsaPreparation.array;

public class SumOfDigitsOfEachElementInAnArray {
    public static void main(String[] args) {

        int [] numbers  = {123,45,9,100,78};


        for(int i=0;i<numbers.length;i++){

            int num  =  numbers[i];
            int sum = 0;

            while(num != 0){

                int rem  =  num % 10;
                sum  =  sum +  rem ;
                num =  num/ 10;

            }
            System.out.println(sum);

        }
    }
}
