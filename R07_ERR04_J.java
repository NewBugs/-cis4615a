// Rule 07. Do not complete abruptly from a finally block
// Compliant version

// Compile with "javac R07_ERR04_J.java"
// Run with "java R07_ERR04_J"

import java.util.*;

public class R07_ERR04_J{

  public static void main(String[] args) {

    doLogic();

  }

  private static boolean doLogic() {
    try {
      throw new IllegalStateException();
    } finally {
      System.out.println("logic done");

      // Remove return statement
    }
  }

}
