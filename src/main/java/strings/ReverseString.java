package strings;

//Complete the function that accepts a string parameter, and reverses each word in the string.
// All spaces in the string should be retained.

public class ReverseString {

    public static String reverseWords(final String original) {

        StringBuilder sb = new StringBuilder(original);
        String revString = sb.reverse().toString();

        return revString;
    }

}
