// Rule 06. Never use assertions to validate method arguments
// Uncompliant version
import java.util.*;

public class R06_MET01_J{

  public static void main(String[] args) {

    getAbsAdd(Integer.MIN_VALUE, 1);

  }

  public static int getAbsAdd(int x, int y) {
    return Math.abs(x) + Math.abs(y);
  }

}
