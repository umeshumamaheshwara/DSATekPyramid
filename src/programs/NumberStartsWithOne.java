package programs;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWithOne {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,20,10,30,40,50,50,11,15,100);

        for(int num : list){

            String str = String.valueOf(num);
            if(str.startsWith("1")){
                System.out.println(str);
            }

        }
    }
}
