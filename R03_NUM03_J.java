// Rule 03. Use integer types that can fully represent the
         // possible range of unsigned data
// Vulnerable version

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt();
}

