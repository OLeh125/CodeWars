public class Solution2 {
    public static int zeros(int n) {
//        int count =0;
//        for (int i = 5; n / i >= 1; i *= 5)
//            count += n / i;
//
//        return count;


        if(n>0) return n/5+zeros(n/5);
        else return 0;

    }
}