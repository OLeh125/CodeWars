import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Pattern regex = Pattern.compile(BinaryRegexp.multipleOf7());
    public static void main(String[] args) {
        String s2 = "111  1110  101012";
        int a = 14;
        String s3 =Integer.toBinaryString(21); ;
       // System.out.println(s3);

        Pattern number = Pattern.compile("\\d+");
        Matcher matcher = number.matcher(s2);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

//        String s="111";
//        int in =Integer.parseInt(s,2) ;
//        System.out.println(in);
//        System.out.println(s.matches("(i%7 == 0)[0-1]+"));

    }
}
