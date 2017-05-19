import java.math.BigInteger;

public class Solution {

  public static void main(String[] args) {
    char[] result = new BigInteger("2").pow(1000).toString().toCharArray();
    int sum = 0;
    for (char c : result) {
      sum += c - '0';
    }
    System.out.println(sum);
  }
}