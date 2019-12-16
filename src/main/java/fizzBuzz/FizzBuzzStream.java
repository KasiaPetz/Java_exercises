package fizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzzStream implements FizzBuzz{
    @Override
    public void fizzBuzz() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> {
                    if (i % 15 == 0) {
                        return "FizzBuzz";
                    } else if (i % 3 == 0) {
                        return "Fizz";
                    } else if (i % 5 == 0) {
                        return "Buzz";
                    } else {
                        return Integer.toString(i);
                    }
                })
                .forEach(System.out::println);
    }
}

