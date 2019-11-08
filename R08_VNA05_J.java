// Rule 08. Ensure atomicity when reading and writing 64-bit values
// Uncompliant version
import java.util.*;

public class R08_VNA05_J{

  private long i = 0;

  public static void main(String[] args) {
    long j = 123;
    assignValue(j);
    printLong();
  }

  void static assignValue(long j) {
    i = j;
  }

  void static printLong() {
    System.out.println("i = " + i);
  }

}
