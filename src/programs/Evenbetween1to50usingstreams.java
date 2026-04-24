package programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Evenbetween1to50usingstreams {
    public static void main(String[] args) {

        List<Integer> collect = IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());

        System.out.println(collect);


        //Or

        IntStream.rangeClosed(1,50).filter(n->n%2 == 0).forEach(System.out::println);



    }
}
