import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws FileNotFoundException {
    Scanner in = new Scanner(new File("names.txt"));
    String str = in.next();
    String[] names = str.split(",");
    Arrays.sort(names);
    int total = 0;

    for (int i = 0; i < names.length; ++i) {
      char[] chars = names[i].toCharArray();
      for (int j = 1; j < chars.length-1; ++j) {
        total += (chars[j] - 'A' + 1) * (i + 1);
      }
    }

    System.out.println(total);
  }
}
