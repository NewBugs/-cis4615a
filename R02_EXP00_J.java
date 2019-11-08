// EXP00-J. Do not ignore values returned by methods
// Compliant Code

import java.util.*;
import java.io.*;


public class R02_EXP00_J {

  public static void main(String[] args) {

    deleteFile();
  }

  public static void deleteFile(){

    // Create a file
    File someFile = new File("someFileName.txt");

    if (!someFile.delete()) {
      System.out.println("Failed to delete file.");
    }

  }
}
