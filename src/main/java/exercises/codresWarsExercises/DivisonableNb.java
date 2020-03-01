package exercises.codresWarsExercises;

//Create a function that checks if a number n is divisible by two numbers x AND y.

public class DivisonableNb {
    public static boolean isDivisible(long n, long x, long y) throws ArithmeticException {
        if (x == 0 || y == 0) {
            throw new ArithmeticException("Divided by 0!");
        }

        if (n % x == 0 && n % y == 0) {
            return true;
        }
        return false;
    }
//    All inputs are positive, non-zero digits.
//    public static Boolean isDivisible(long n, long x, long y) {
//        return n % x == 0 && n % y == 0 ? true : false;
//    }

    public static void main(String[] args) {
        System.out.println(isDivisible(8L, 2L, 4L));
        System.out.println(isDivisible(8L, 0L, 4L));
    }
}
