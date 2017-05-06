#include <stdio.h>

/*
 * This is a better apporach to solve the same problem.
 * By applying inclusion-exclusion principle, the running time
 * can be reduced to O(1).
 */

// calculate the sum of multiples of the divisor under the given bound.
int sum(int divisor, int bound) {
  int fl = (bound - 1) / divisor;
  return divisor * fl * (fl + 1) / 2;
}

int main(int argc, char *argv[]) {
  printf("%d\n", sum(3, 1000) + sum(5, 1000) - sum(15, 1000));
  return 0;
}
