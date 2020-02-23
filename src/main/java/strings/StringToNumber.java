package strings;

//We need a function that can transform a number into a string.

public class StringToNumber {
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        int number = 123;
        String resultStr = numberToString(number);

        System.out.println(resultStr);
    }

}
