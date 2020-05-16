package exercises.Average;

public class AverageCouter implements Average {
    @Override
    public double findAverage(int[] array) {
        int result = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        average = (double) result / array.length;

        return average;
    }

//    public static void main(String[] args) {
//        int[] array = new int[] {1, 2, 3, 4, 5, 6};
//        Average avc = new AverageCouter();
//        Average avs = new AverageStream();
//
//        System.out.println(avc.findAverage(array));
//        System.out.println(avs.findAverage(array));
//
//    }
}
