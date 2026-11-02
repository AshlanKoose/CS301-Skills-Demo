 import java.util.regex.*;

public class MatchPhoneNumber {

    // Created Macher function
    public static void check(String Number) {
        String areaCode = "\\b\\d{3}[-]?\\d{3}[-]?\\d{4}\\b";
        String noAreaCode = "\\b\\d{3}[-]?\\d{4}\\b";
        Pattern patternOne = Pattern.compile(areaCode);
        Pattern patternTwo = Pattern.compile(noAreaCode);
        
          Matcher matcherOne = patternOne.matcher(Number);
          Matcher matcherTwo = patternTwo.matcher(Number);
          if (matcherOne.matches() || matcherTwo.matches()) {
            IO.println("Is a match.");
            }
            else {
                IO.println("Not a match.");
            }
        }
    public static void main(String[] args) {
      String n = args[0];
        check(n);

    }
}
