import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class SolutionAlternative {

  public static void main(String[] args) {
    System.out.println(latticPath(20, 20));
  }

  // create a matrix represents the lattic path of each vertice
  private static BigInteger latticPath(int row, int col) {
    BigInteger result = factorial(row + col).divide(factorial(row))
        .divide(factorial(col));
    return result;
  }

  // calculate the factorial of the given number
  private static BigInteger factorial(int num) {
    BigInteger[] arr = new BigInteger[num + 1];
    arr[0] = new BigInteger("1");
    arr[1] = new BigInteger("1");

    for (int i = 2; i <= num; i++) {
      arr[i] = new BigInteger(Integer.toString(i)).multiply(arr[i - 1]);
    }

    return arr[num];
  }
}