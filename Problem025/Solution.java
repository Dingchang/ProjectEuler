import java.math.BigInteger;
import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {
    ArrayList<BigInteger> arr = new ArrayList<>();
    arr.add(new BigInteger("1"));
    arr.add(new BigInteger("1"));
    BigInteger temp = new BigInteger("2");
    int counter = 2;

    while (temp.toString().length() < 1000) {
      arr.add(temp);
      counter++;
      temp = arr.get(counter-2).add(arr.get(counter-1));
    }

    System.out.println(counter+1);
  }
}
