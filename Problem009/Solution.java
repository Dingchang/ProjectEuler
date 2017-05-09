public class Solution {

  public static void main(String[] args) {
    System.out.println(pythagorean(1000));
  }

  // find the product of pythagorean triplet such that a + b + c = num
  private static long pythagorean(long num) {
    for (int a = 3; a <= num / 3; a++) {
      long b = (num * num - 2 * num * a) / (2 * num - 2 * a);
      long c = num - a - b;

      if (a * a + b * b == c * c) {
        return a * b * c;
      }
    }

    return -1;
  }
}
