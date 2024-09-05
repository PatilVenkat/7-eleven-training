
//import java.util.regex.*;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    // there is no constructor for pattern class
    // we cant make pattern using new keyword
    // there is a static method(compile)
    public static void main(String[] args) {
       // Pattern pattern = Pattern.compile("Seven@11");

        // calling the matcher method by using the pattern class object
        // by calling matches method we can check the patern
        /*Matcher m = pattern.matcher("seven@11");
        Boolean b=m.matches();
         System.out.println(b);
         //boolean b=Pattern.matches(".m","am");
         //System.out.println(b);*/
        
         System.out.println(Pattern.matches("[abc]","j"));
         /** System.out.println(Pattern.matches("[^abc]","a"));
         * System.out.println(Pattern.matches("[a-zA-Z0-9]","7"));
         * System.out.println(Pattern.matches("[a-f[m-t]]","an"));
         * System.out.println(Pattern.matches("[h]?","c"));
         * System.out.println(Pattern.matches("/D","5"));
         */
       // while (m.find())
          //  System.out.println(+m.start() + "-" + (m.end()));
    }

}
