// Rule 13. Do not rely on the write() method to output integers
         // outside the range 0 to 255
// Compliant version

// Compile with "javac R13_FIO09_J.java"
// Run with "java R13_FIO09_J 254"

import java.util.*;
import java.io.*;

public class R13_FIO09_J{

  public static void main(String[] args) throws NumberFormatException, IOException {
    // Perform range checking
    int value = Integer.valueOf(args[0]);

    if (value < 0 || value > 255) {
      throw new ArithmeticException("Value is out of range");
    }

    System.out.write(value);
    System.out.flush();
  }

}
