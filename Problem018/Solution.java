import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner("15\n75\n"
        + "95 64\n"
        + "17 47 82\n"
        + "18 35 87 10\n"
        + "20 04 82 47 65\n"
        + "19 01 23 75 03 34\n"
        + "88 02 77 73 07 63 67\n"
        + "99 65 04 28 06 16 70 92\n"
        + "41 41 26 56 83 40 80 70 33\n"
        + "41 48 72 33 47 32 37 16 94 29\n"
        + "53 71 44 65 25 43 91 52 97 51 14\n"
        + "70 11 33 28 77 73 17 78 39 68 17 57\n"
        + "91 71 52 38 17 14 91 43 58 50 27 29 48\n"
        + "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n"
        + "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23");

    int line = in.nextInt();
    int[][] matrix = new int[line][line];

    // fill with 0
    for (int[] row : matrix) {
      Arrays.fill(row, 0);
    }

    for (int i = 0; i < line; i++) {
      for (int j = 0; j <= i; j++) {
        matrix[j][i-j] = in.nextInt();
      }
    }

    System.out.println(maxPath(matrix, line));
  }

  public static int maxPath(int[][] matrix, int line) {
    int[][] memory = new int[line][line];
    int max = 0;

    for (int i = 0; i < line; i++) {
      for (int j = 0; j < line; j++) {
        if (i + j >= line) {
          continue;
        }

        if (i == 0 && j == 0) {
          memory[0][0] = matrix[0][0];
        } else if (i == 0) {
          memory[i][j] = memory[i][j-1] + matrix[i][j];
        } else if (j == 0) {
          memory[i][j] = memory[i-1][j] + matrix[i][j];
        } else {
          if (matrix[i][j] + memory[i][j-1] > matrix[i][j] + memory[i-1][j]) {
            memory[i][j] = matrix[i][j] + memory[i][j-1];
          } else {
            memory[i][j] = matrix[i][j] + memory[i-1][j];
          }
        }
      }
    }

    for (int i = 0; i < line; i++) {
      if (memory[i][line-i-1] > max) {
        max = memory[i][line-i-1];
      }
    }

    return max;
  }
}