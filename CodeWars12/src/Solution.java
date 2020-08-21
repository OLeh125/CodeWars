public class Solution {
    public static int zeros(int n) {
        char[]chars = (""+fact(n)).toCharArray();
        System.out.println(chars);
        int count = 0;

            if(chars[chars.length-1] == '0')
            {
                int i =chars.length-1 ;
                 while (chars[i--] == '0')
                {
                    count++;
                }
            }

        return count;
    }

    public static long fact(long n){
        if(n == 0 || n == 1)
            return 1;
        n = n * fact(n-1);

        return n;
    }
}
