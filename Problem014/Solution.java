import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    long[] arr = collatzArr(1000000);
    long longest = 1;
    int longestIdx = 1;
    
    for (int i = 500000; i < 1000000; i++) {
      if (arr[i] >= longest) {
        longest = arr[i];
        longestIdx = i;
      }
    }
    
    System.out.println(longestIdx);
  }

  // create an array of long so that each value represent the collatz chain of its index
  private static long[] collatzArr(int limit) {
    long[] arr = new long[limit];
    arr[0] = 0l;

    for (long i = 1; i < limit; i++) {
      arr[(int)i] = findChain(i);
    }

    return arr;
  }

  // calculate the collatz chain of the given number
  private static long findChain(long num) {
    long count = 0l;

    while (num != 1) {
      if (num % 2 == 0) {
        num /= 2;
        count++;
      } else {
        num = 3 * num + 1;
        count++;
      }
    }

    return count;
  }
}