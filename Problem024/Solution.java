import java.util.Arrays;

public class Solution {

  private static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }

  private static int[] shiftArray(int[] nums, int length, int remove) {
    int[] arr = new int[length];
    int j = 0;

    for (int i = 0; i < length; ++i) {
      if (nums[i] == remove) {
        ++j;
        arr[i] = nums[i+j];
      } else {
        arr[i] = nums[i+j];
      }
    }

    return arr;
  }

  private static int[] permutation(int nth, int[] nums) {
    nth -= 1;
    int[] digits = new int[nums.length];
    int length = nums.length-1;

    for(int i = 0; i < length+1; ++i) {
      digits[i] = nums[nth/factorial(length-i)];
      nth %= factorial(length-i);
      nums = shiftArray(nums, nums.length-1, digits[i]);
    }

    return digits;
  }

  public static void main(String[] args) {
    int[] nums = {0,1,2,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(permutation(1000000, nums)));
  }
}
