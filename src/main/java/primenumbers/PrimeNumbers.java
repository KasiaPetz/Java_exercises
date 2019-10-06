package primenumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public List<Integer> generatePrimeNumbers(int range) {
        List<Integer> primeList = new ArrayList<>();

        for(int i = 2; i <= range; i++){
            if(isPrimeNumber(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    private boolean isPrimeNumber(int number) {
        if(number < 2) {
            return false;
        }

        for(int i = 2; i*i <= number; i++) {
            if(number%i == 0) {
                return false;
            }
        }

        return true;
    }

}
