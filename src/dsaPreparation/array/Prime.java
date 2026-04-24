package dsaPreparation.array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {

        List<Integer> primes =
                IntStream.rangeClosed(2, 100)
                        .filter(n -> IntStream.rangeClosed(2, (int)Math.sqrt(n))
                                        .allMatch(i -> n % i != 0)
                        )
                        .boxed()
                        .collect(Collectors.toList());


        System.out.println(primes);

    }
}
