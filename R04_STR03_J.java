// Rule 04. Do not encode noncharacter data as a string
// Compliant version
import java.util.*;
import java.math.BigInteger;


public class R04_STR03_J{

  public static void main(String[] args) {

    BigInteger x = new BigInteger("530500452766");

    // Convert to string first
    String s = x.toString();

    // Convert to byteArray second
    byte[] byteArray = s.getBytes();

    // And then back
    String ns = new String(byteArray);
    x = new BigInteger(ns);

  }


}
