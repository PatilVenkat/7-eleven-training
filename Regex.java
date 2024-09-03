//import java.util.regex.*;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
    //there is no constructor for pattern class
    // we cant make pattern using new keyword
    // there is a static method(compile)
    public static void main(String[] args) {
       // Pattern pattern = Pattern.compile("Venky@123");
       //Matcher m=pattern.matcher("venky@123");
        //Boolean b=m.matches();
        //System.out.println(b);
        //boolean b=Pattern.matches(".m","am");
      //  System.out.println(b);
        System.out.println(Pattern.matches("[abc]","c"));
        System.out.println(Pattern.matches("[^abc]","a"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]","7"));
        System.out.println(Pattern.matches("[a-f[m-t]]","an"));
        System.out.println(Pattern.matches("[h]?","c"));
        System.out.println(Pattern.matches("/D","5"));
    }
    
}
