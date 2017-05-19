public class Solution {

  public static void main(String[] args) {
    int sum = 0;
    
    for (int i = 1; i <= 1000; i++) {
      sum += toWord(i);
    }
    
    System.out.println(sum);
  }
  
  private static int toWord(int i) {
    int result = 0;
    
    if (i == 1000) {
      return 11;
    }
    
    if (i / 10 == 0) {
      return toWord1(i);
    }
    
    if (i / 100 == 0) {
      return toWord2(i);
    }
    
    return toWord3(i);
  }
  
  private static int toWord1(int i) {
    int result = 0;
    
    switch (i % 10) {
      case (1) :
        result += 3;
        break;
      case (2) :
        result += 3;
        break;
      case (3) :
        result += 5;
        break;
      case (4) :
        result += 4;
        break;
      case (5) :
        result += 4;
        break;
      case (6) :
        result += 3;
        break;
      case (7) :
        result += 5;
        break;
      case (8) :
        result += 5;
        break;
      case (9) :
        result += 4;
        break;
      default :
        break;        
    }
    
    return result;
  }
  
  private static int toWord2(int i) {
    int result = 0;
    
    if (i == 10) {
      return 3;
    }
    
    if (i == 11 || i == 12) {
      return 6;
    } 
    
    if (i == 13) {
      return 8;
    }
    
    if (i == 14) {
      return 8;
    }
    
    if (i == 15) {
      return 7;
    }
    
    if (i == 16) {
      return 7;
    }
    
    if (i == 17) {
      return 9;
    }
    
    if (i == 18) {
      return 8;
    }
    
    if (i == 19) {
      return 8;
    }
    
    switch (i / 10) {
      case (2) :
        result += 6;
        break;
      case (3) :
        result += 6;
        break;
      case (4) :
        result += 5;
        break;
      case (5) :
        result += 5;
        break;
      case (6) :
        result += 5;
        break;
      case (7) :
        result += 7;
        break;
      case (8) :
        result += 6;
        break;
      case (9) :
        result += 6;
        break;
      default :
        break;        
    }
    
    return result + toWord1(i % 10);
  }
  
  private static int toWord3(int i) {
    int result = 0;
    
    switch (i / 100) {
      case 1:
        result += 10;
        break;
      case 2:
        result += 10;
        break;  
      case 3:
        result += 12;
        break;
      case 4:
        result += 11;
        break;  
      case 5:
        result += 11;
        break;
      case 6:
        result += 10;
        break;  
      case 7:
        result += 12;
        break;
      case 8:
        result += 12;
        break;
      case 9:
        result += 11;
        break;      
      default:
        break;
    }
    
    if (i % 100 == 0) {
      return result;
    }
        
    return result + toWord2(i % 100) + 3;
  }
}