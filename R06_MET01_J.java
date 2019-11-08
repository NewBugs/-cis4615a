// Rule 06. Never use assertions to validate method arguments
// Compliant version
import java.util.*;
import java.lang.*;

public class R06_MET01_J{

  public static void main(String[] args) {

    getAbsAdd(Integer.MIN_VALUE, 1);

  }

  public static int getAbsAdd(int x, int y) {
    // Check for exceptions first 
    if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
      throw new IllegalArgumentException();
    }
    
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    
    // Check for exception
    if (absX > Integer.MAX_VALUE - absY) {
      throw new IllegalArgumentException();
    }
    
    return absX + absY;
  }

}
