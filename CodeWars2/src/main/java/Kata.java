import java.util.List;

public class Kata {
    public static String getMiddle(String word) {
        char[] characters = word.toCharArray();
        if (word.length() % 2 == 0) {
            return characters[(word.length() / 2) - 1] + "" + characters[(word.length() / 2)];
        } else {

            return characters[(word.length() / 2)] + "";
        }

    }
}
