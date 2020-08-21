public class Main {
    public static void main(String[] args) {
        final int S = 1;
        final int M = 60;
        final int H = 60*60;
        final int D = 24*60*60;
        final int Y = 365*24*60*60;
     String s = TimeFormatter.formatDuration(3034824);
        System.out.println(s);
    }
}
