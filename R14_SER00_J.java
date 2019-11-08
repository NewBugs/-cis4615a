// Rule 14. Enable serialization compatibility during class evolution
// Uncompliant version
import java.util.*;
import java.io.*;

public class R14_SER00_J implements Serializable {

int numOfWeapons = 10;


  public static void main(String[] args) {
    R14_SER00_J obj = new R14_SER00_J();

    System.out.println(obj.toString());
  }


  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
