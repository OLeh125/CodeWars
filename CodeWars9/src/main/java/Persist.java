public class Persist {
    private static int count = 0;
    public static int persistence(long n) {
        if(count != 0)count = 0;
        if(n >= 10)
        {
            char[] chars = (n + "").toCharArray();
            int sum = 1;
            for (int i = 0; i < chars.length; i++)
            {
                sum = sum * (chars[i] - 48);
            }

            if (chars.length > 1)
            {
                persistence(sum);
                count++;
            }

          return count;
        }   else return 0;
    }
}
