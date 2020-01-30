package exercises.codresWarsExercises;

//Your task is to create a function that does four basic mathematical operations.
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {

        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
               return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                if (v2 == 0) {
                    throw new ArithmeticException("Division by 0!");
                }
                return v1 / v2;
            default:
                throw new IllegalArgumentException("Uncnown operation" + op);
        }
    }

    public static void main(String[] args) {
        Integer r1 = BasicOperations.basicMath("+", 4, 7);
        Integer r2 = BasicOperations.basicMath("-", 15, 18);
        Integer r3 = BasicOperations.basicMath("*", 5, 5);
        Integer r4 = BasicOperations.basicMath("/", 49, 7);
//        Integer r5 = BasicOperations.basicMath("/", 49, 0);
//        Integer r6 = BasicOperations.basicMath("#", 49, 7);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
//        System.out.println(r5);
//        System.out.println(r6);
    }
}
