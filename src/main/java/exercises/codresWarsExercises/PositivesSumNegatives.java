package exercises.codresWarsExercises;

//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
//If the input array is empty or null, return an empty array.

public class PositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] resultArray = new int[2];
        int positiveNbQnt = 0;
        int negativeNbSum = 0;

        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                // dodawaj ilośc liczb
                positiveNbQnt++;
            } else if (input[i] < 0) {
                // sumuj wartosc
                negativeNbSum += input[i];
            }

        }
        resultArray[0] = positiveNbQnt;
        resultArray[1] = negativeNbSum;

        return resultArray; //return an array with count of positives and sum of negatives
    }

    public static void main(String[] args) {
        int[] imputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] imputEmptyArray = new int[0];

        int[] resultArray = countPositivesSumNegatives(imputArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }

        int[] resultEmptyArray = countPositivesSumNegatives(imputEmptyArray);
        for (int i = 0; i < resultEmptyArray.length; i++) {
            System.out.println(resultEmptyArray[i]);
        }
    }

}
