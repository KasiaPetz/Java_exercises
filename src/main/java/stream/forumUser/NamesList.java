package stream.forumUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NamesList {

    public static List<String> removeDuplicates(List<String> inputList) {
        return inputList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void sort(List<String> inputList) {
        Collections.sort(inputList);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ewa");
        names.add("Ewa");
        names.add("Ola");
        names.add("Gosia");
        names.add("Michał");
        names.add("Marek");
        names.add("Michał");
        names.add("Kuba");
        names.add("Kasia");

        List<String> resultList = removeDuplicates(names);

        sort(resultList);

        System.out.println(resultList);
    }
}
