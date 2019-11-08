// Rule 49. Do not use an empty infinite loop
// Compliant version

// Compile with "javac R49_MSC01_J.java"
// Run with "java R49_MSC01_J"
// Remember it just yields (won't end program)

import java.util.*;

public class R49_MSC01_J{


  public static void main(String[] args) {
    R49_MSC01_J obj = new R49_MSC01_J();
    obj.nop();
  }

  public int nop() {
    while (true) {
      Thread.yield();
    }
  }

}
