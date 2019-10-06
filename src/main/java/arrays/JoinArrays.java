package arrays;

public class JoinArrays {
    public int [] joinTwoArrays(int [] first, int[] second) {
        int [] joinedArray = new int[first.length + second.length];
        int j = 0;

        for(int i = 0; i < first.length; i++) {
            joinedArray[j] = first[i];
            j++;
        }

        for(int i = 0; i < second.length; i++) {
            joinedArray[j] = second[i];
            j++;
        }

        return joinedArray;
    }
}
