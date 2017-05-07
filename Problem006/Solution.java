public class Solution {

  public static void main(String[] args) {
    int num = 100;

    System.out.print(sumOfFirst(num) * sumOfFirst(num) - squareSumOfFirst(num));
  }
  
  // calculate sum numbers from 1 to n
  private static int sumOfFirst(int n) {
    return n * (n + 1) / 2;
  }
  
  // calculate the sum of the square of each number from 1 to n.
  private static int squareSumOfFirst(int n) {
    return n * (n + 1) * (2 * n + 1) / 6;
  }
}
