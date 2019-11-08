// Rule 00. Input Validation and Data Sanitization (IDS)
// Safe version
import java.util.*;
import java.util.logging.*;
import java.util.regex.Pattern;
import java.io.IOException;


public class R00_IDS03_J{
  public static void main(String[] args) throws SecurityException, IOException {

    boolean loginSuccessful = false;

    Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    // Set Logger level()
    logger.setLevel(Level.SEVERE);

    Scanner scanIn = new Scanner(System.in);
    String username = scanIn.nextLine();

    scanIn.close();

    System.out.println(sanitizeUser(username));


    if (sanitizeUser(username).equals("guest"))
      loginSuccessful = true;

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
  }

  public static String sanitizeUser(String username) {
    return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
  }
}
