package strings;

//We need a function that can transform a string into a number. What ways of achieving this do you know?
//all inputs will be strings, and every string is a perfectly valid representation of an integral number.

public class NumberToString {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String str = "123";

        System.out.println(stringToNumber(str));
    }
}
