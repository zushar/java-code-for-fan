// Import statement:
import java.util.ArrayList;
class PrimeDirective {

  public ArrayList<Integer> onlyPrimes(int[] numbers){
   ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int number : numbers){
      if(isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }

  // Add your methods here:
  public boolean isPrime(int number){
   for(int i = 2; i < number; i++){
     if(number % i == 0){
       return false;
     }else if (number == 2){
       return true;
     }else if(number < 2){
       return false;
     }
   }
   return true;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
  System.out.println(pd.isPrime(29));
  System.out.println(pd.onlyPrimes(numbers));
  }  

}