import java.util.ArrayList;

public class Solution {

  private static int sumOfDivisor(int num) {
    int sum = 1;
    int root = (int) Math.sqrt(num);

    // num is a square number
    if (root*root == num) {
      sum += root--;
    }

    for (int i = 2; i <= root; ++i) {
      if (num % i == 0) {
        sum += i + (num / i);
      }
    }

    return sum;
  }

  private static boolean isSplittable(int num, ArrayList<Integer> arr) {
    for (Integer i : arr) {
      if (i >= num) {
        break;
      }

      for (Integer j : arr) {
        if (num - i < j) {
          break;
        } else if (num - i == j) {
          return true;
        }
      }
    }

    return false;
  }

  public static void main(String args[]) {
    ArrayList<Integer> abArr = new ArrayList<>();
    int sum = 0;

    for (int i = 12; i < 20161; ++i) {
      if (sumOfDivisor(i) > i) {
        abArr.add(i);
      }
    }

    for (int i = 1; i < 20162; ++i) {
      if (!isSplittable(i, abArr)) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}
