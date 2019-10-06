package primenumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbSecond {
   public List<Integer> geneatePrimeNumbers (int range) {
       List<Integer> primeList = new ArrayList<>();

       for(int i = 2; i < range; i++) {
           if(isPrime(i)) {
               primeList.add(i);
           }
       }
       return primeList;
   }

   public boolean isPrime(int number) {
       if( number < 2 ) {
           return false;
       }

       for( int i = 2; i*i <= number; i++) {
           if(number%i == 0);
       }
       return true;
   }
}
