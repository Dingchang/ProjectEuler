public class Solution {

  public static boolean isSunday(int year, int month, int day) {
    if (month<3) {
      month += 12;
      year--;
    }

    return (day + 13 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400 - 1) % 7 == 0;
  }

  public static void main(String[] args) {
    int count = 0;

    for(int i=1901; i<=2000; ++i) {
      for(int j=1; j<=12; ++j) {
        if(isSunday(i,j,1)) {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
