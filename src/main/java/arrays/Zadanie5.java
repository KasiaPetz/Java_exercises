package arrays;

//napisz metode która zwróci nowa tablice która bedzie połaczeniem tych 2 tablic.


public class Zadanie5 {

    public int[] joinArrays(int[] first, int[] second) {
        int[] joinedArray = new int[first.length  + second.length];
        int j = 0;

        for (int i = 0; i < first.length; i++) {
            joinedArray[j] = first[i];
            j++;
        }

        for (int i = 0; i < second.length; i++) {
            joinedArray[j] = second[i];
            j++;
        }

        return joinedArray;
    }

    public int[] joinArrays(int[] first, int[] second, int[] third) {
        //milej zabawy ;)
        int [] joinedArray = new int[first.length  + second.length + third.length];
        int j = 0;

        for (int i = 0; i < first.length; i++) {
            joinedArray[j] = first[i];
            j++;
        }

        for (int i = 0; i < second.length; i++) {
            joinedArray[j] = second[i];
            j++;
        }

        for (int i = 0; i < third.length; i++) {
            joinedArray[j] = third[i];
            j++;
        }

        return joinedArray;
    }
}
