// Rule 14. Enable serialization compatibility during class evolution
// Uncompliant version
import java.util.*;
import java.io.*;

// Compile with "javac R14_SER00_J.java"
// Run with "java R14_SER00_J"

public class R14_SER00_J implements Serializable {

  // Assign a number unique to this version of the class.
  private static final long serialVersionUID = 24L;

  int numOfWeapons = 10;

  public static void main(String[] args) {
    R14_SER00_J obj = new R14_SER00_J();

    System.out.println(obj.toString());
  }


  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
