package hackeranktest;

import java.util.*;

import static java.util.Arrays.*;

public class Zad2 {

    public static void main(String[] args) {

    }

    public static int fewestCoins(String coins) {
        return 0;
    }

    private static boolean check(Set<Character> letters, String word) {
        Set<Character> chars = new HashSet<>(letters);

        for(char c : word.toCharArray()) {
            chars.remove(c);
        }

        return chars.isEmpty();
    }
}
