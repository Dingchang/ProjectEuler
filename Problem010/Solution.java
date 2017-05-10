import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    boolean[] primeArr = primeArr(2000000);
    long sum = 0;
    
    for (int i = 2; i < 2000000; i++) {
      if (primeArr[i]) {
        sum += i;
      }
    }
    
    System.out.println(sum);
  }
  
  // create an array of prime number determiner by sieve of Eratosthenes
  private static boolean[] primeArr(int limit) {
    boolean[] primeArr = new boolean[limit];
    Arrays.fill(primeArr, true);
    primeArr[0] = false;
    primeArr[1] = false;
    
    for (int i = 4; i < limit; i += 2) {
      primeArr[i] = false;
    }
    
    for (int i = 3; i * i <= limit; i += 2) {
      if (primeArr[i]) {
        for (int j = i * i; j < limit; j += 2 * i) {
          primeArr[j] = false;
        }
      }
    }
    
    return primeArr;
  }
}