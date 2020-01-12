package strings.reveseWord;

public class ReverseWordLoop implements StringReverse {
    @Override
    public String reverseWord(String input) {
        int length = input.length();
        char[] tempCharArray = new char[length];
        char[] charArray = new char[length];

        for (int i = 0; i < length; i++) {
            tempCharArray[i] = input.charAt(length);
        }

        for (int j = 0; j < length; j++) {
            charArray[j] = tempCharArray[length - 1 - j];
        }

        String revWord = new String(charArray);
        return revWord;
    }
}



