package collections.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Kasia");
        stringList.add("Ola");
        stringList.add("Piotr");
        stringList.add("Ela");
        stringList.add("Monika");
        stringList.add("Michał");


        Iterator<String> it = stringList.iterator();

        while(it.hasNext()) {
            String word = it.next();

            if(word.length() == 3) {
                it.remove();
            }

        }

        System.out.println(stringList);

        stringList.removeIf(n ->n.length()==3);

    }
}
