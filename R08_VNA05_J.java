// Rule 08. Ensure atomicity when reading and writing 64-bit values
// Compliant version

// Compile with "javac R08_VNA05_J.java"
// Run with "java R08_VNA05_J"

import java.util.*;

public class R08_VNA05_J{

  private static volatile long i = 0;

  public static void main(String[] args) {
    long j = 123;
    assignValue(j);
    printLong();
  }

  static void assignValue(long j) {
    i = j;
  }

  static void printLong() {
    System.out.println("i = " + i);
  }

}
