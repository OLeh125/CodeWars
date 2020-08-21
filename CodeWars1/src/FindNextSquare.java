public class FindNextSquare {
    public static long findNextSquare(long sq) {
        double a = Math.sqrt(sq);
        if (a % 1 == 0){
            a = a+1;
            a= a*a;
            return (long) a;
        }else {
            return -1;
        }
    }
}
