package exercises;

//Given an integral number, define if it's a square number

public class SquereNumbers {

    public static boolean isSquare(int n) {

        for (int i = 0; i < n; i++) {
            if( i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = isSquare(25);

        System.out.println(result);
    }
}
