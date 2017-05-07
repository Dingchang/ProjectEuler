public class Solution {
  public static void main(String[] args) {
    int i = 3;
    
    for (int counter = 1; counter < 10001; i += 2) {
      if (isPrime(i)) {
        counter += 1;
      }
    }
    
    System.out.println(i - 2);
  }
  
  // determine if a number is a prime number
  private static boolean isPrime(int n) {
    if (n == 1)
      return false;
    else if (n < 4)
      return true;
    else if (n % 2 == 0)
      return false;
    else if (n < 9)
      return true;
    else if (n % 3 == 0)
      return false;
    else {
      long limit = (long) Math.floor(Math.sqrt(n));

      for (int i = 5; i <= limit; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) 
          return false;
      }
    }   
    return true;
  }
}