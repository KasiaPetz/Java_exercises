package fizzBuzz;

public class FizzBuzzConcat implements FizzBuzz {
    @Override
    public void fizzBuzz() {
        for (int i = 1; i <= 15; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()) {
                result += i;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fbz = new FizzBuzzConcat();
        fbz.fizzBuzz();
    }
}