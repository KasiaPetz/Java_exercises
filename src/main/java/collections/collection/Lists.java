package collections.collection;


import java.util.ArrayList;
import java.util.List;


//przyjmuje duplikaty
//pamieta kolejnosc

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        //int[] array = { 1, 2, 3 };
        // List<Integer> linkedList = Arrays.asList(array);


        arrayList.add("Kasia");
        arrayList.add("Kasia");
        arrayList.add("Kasia");
        arrayList.add("Marysia");
        arrayList.add("Monika");
        arrayList.add("Basia");

        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());

        arrayList.remove("Kasia");   //usuwa tylko jedna Kasie

        System.out.println("List after remove(): " + arrayList);

        System.out.println("List size: " + arrayList.size());

//        for (String name: arrayList) {   // ConcurrentModificationException
//            if ( name.equals("Kasia")) {
//                arrayList.remove(name);
//            }
//        }
//
//        System.out.println("List after loop" + arrayList);

        arrayList.removeIf(n -> (n.equals("Kasia")));

        System.out.println("List after removeIf(): " + arrayList);

        System.out.println();

        for (String name : arrayList) {
            System.out.println("Ptintln forLoop: " + name);
        }

        for (int i = 0; i < 30; i++) {
            arrayList.add("Kasia");
        }

    }

}
