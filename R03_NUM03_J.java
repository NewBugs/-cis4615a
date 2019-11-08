// Rule 03. Use integer types that can fully represent the
//          possible range of unsigned data
// Compliant version
import java.io.*;

public class R03_NUM03_J {

  public static void main(String[] args) {

    DataInputStream dataIn = new DataInputStream(new
            FileInputStream("test.txt"));

    getInteger(dataIn);
  }

  public static long getInteger(DataInputStream is) throws IOException {
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
  }
}
