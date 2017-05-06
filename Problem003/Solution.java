/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Solution {

  public static void main(String[] args) {
    long largeNumber = 600851475143L;
    long cap = (long) Math.sqrt(largeNumber);
    long divisor = 3;
    long lastDivisor = 1;

    while (largeNumber % 2 == 0) {
      largeNumber /= 2;
    }
    if (largeNumber == 1) {
      System.out.println(2);
    }

    while (divisor <= cap) {
      while (largeNumber % divisor == 0) {
        largeNumber /= divisor;
        lastDivisor = divisor;
      }
      divisor += 2;
    }

    System.out.println(lastDivisor > largeNumber ? lastDivisor : largeNumber);
  }
}
