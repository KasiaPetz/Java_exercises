package iterations;

//napisz metody zwracajace pierwszy i ostatni element
// która zwraca sume elementów

public class Zadanie4 {

    public int first(int[] array) {
        return array[0];
    }

    public int last(int[] array) {
        return array[array.length - 1];
    }

    public int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
