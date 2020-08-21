public class Mascify {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
