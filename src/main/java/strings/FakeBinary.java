package strings;

//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
// Return the resulting string

public class FakeBinary {

    public static String fakeBin(String numberString) {
        char[] charArray = numberString.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
           int liczba = Character.getNumericValue(c);

            if (liczba < 5) {
               sb.append(0);
           } else {
               sb.append(1);
           }
        }

        return sb.toString();
    }

}
