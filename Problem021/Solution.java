import java.util.ArrayList;

public class Solution {

    private static int sumOfDivisor(int num) {
        int sum = 1;
        int root = (int) Math.sqrt(num);

        // num is a square number
        if(root*root == num) {
            sum += root;
        }

        for(int i = 2; i < root; ++i) {
            if (num % i == 0) {
                sum += i + (num / i);
            }
        }

        return sum;
    }

    private static ArrayList<Integer> amNumArr(int num) {
        int[] sodArr = new int[num+1];
        sodArr[0] = 0;
        ArrayList<Integer> amNumArr = new ArrayList<Integer>();

        for(int i=1; i<num+1; ++i) {
            sodArr[i] = sumOfDivisor(i);
        }

        for(int i=220; i<num+1; ++i) {
            if(sodArr[i] > num || sodArr[i] == i) {
                continue;
            } else if(sodArr[sodArr[i]] == i) {
                amNumArr.add(i);
            }
        }

        return amNumArr;
    }

    public static void main(String args[]) {
        ArrayList<Integer> amNumArr = amNumArr(10000);
        int sum = 0;

        for(Integer i : amNumArr) {
            sum += i;
        }

        System.out.println(sum);
    }
}
