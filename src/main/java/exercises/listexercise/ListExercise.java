package exercises.listexercise;

import java.util.*;
import java.util.stream.Collectors;

public class ListExercise {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ala", "Tomek", "Ala", "Janusz", "Seba", "Radek", "Janusz");

        System.out.println(removeDuplicates(list));
    }

    public static List<String> removeDuplicates(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /*public static List<String> removeDuplicates(List<String> list) {
        final Set<String> set = new LinkedHashSet<>(list);
        final List<String> l = new ArrayList<>(set);
        return l;
    }*/

}
