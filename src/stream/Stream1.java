package stream;

/*Java Program - I have list of numbers from which
i) You need to return the numbers which are repeated odd number of times
10,20,20,10,30,40,50,50
ii) You need to return the numbers which starts with 1.*/


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Stream1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,20,10,30,40,50,50);

        List<Integer> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue() % 2 != 0).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);


        List<Integer> collect1 = list.stream().filter(num -> String.valueOf(num).startsWith("1")).
                collect(Collectors.toList());

        System.out.println(collect1);

    }
}
