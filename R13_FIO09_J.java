// Rule 13. Do not rely on the write() method to output integers
         // outside the range 0 to 255
// Unompliant version
import java.util.*;

public class R13_FIO09_J{

  public static void main(String[] args) {
    // Any input value > 255 will result in unexpected output
    System.out.write(Integer.valueOf(args[0]));
    System.out.flush();
  }

}
