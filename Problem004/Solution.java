/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Solution {

  public static void main(String[] args) {
    long max = 0;
    int  i = 999;

    while (i >= 100) {
      int j = 999;
      while (j >= i) {
        if (i * j < max) {
          break;      // no need to continue.
        }
        if (i * j == reverse(i * j)) {
          max = i * j;
          break;
        }
        j--;
      }
      i--;
    }

    System.out.println(max);
  }

  private static long reverse(long number) {
    long temp = 0;

    while (number > 0) {
      temp *= 10;
      temp += number % 10;
      number /= 10;
    }
    return temp;
  }
}
