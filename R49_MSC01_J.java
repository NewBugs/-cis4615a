// Rule 49. Do not use an empty infinite loop
// Uncompliant version

import java.util.*;

public class R49_MSC01_J{


  public static void main(String[] args) {
    nop();
  }

  public int nop() {
    while (true) {}
  }

}
