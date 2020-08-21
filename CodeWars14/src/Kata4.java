import java.util.ArrayList;
import java.util.List;

public class Kata4 {

    public static long nextBiggerNumber(long n) {
        long n2 = -1;
        char[] chars = (n + "").toCharArray();
        int[] list = new int[5];
        int [] list2 = new int[5];



        for (int i = 0; i < chars.length; i++) {
            String s = chars[i] + "";
            Integer in = Integer.parseInt(s);
            list [i] = in;
        }

        for (int i = 0; i < chars.length; i++) {
            String s = chars[i] + "";
            Integer in = Integer.parseInt(s);
            list2 [i] = in;
        }

        for (long j = n+1; j < n*5; j++) {
            list2 = new int[5];
            char[] chars2 = (j + "").toCharArray();
            for (int i = 0; i < chars2.length; i++) {
                String s = chars2[i] + "";
                Integer in = Integer.parseInt(s);
                list2 [i] = in;

            }



            if(eql(list,list2) ){

                StringBuilder str = new StringBuilder();
                for (int i: list2) {
                    str.append(i+"");
                }


                n2 = Long.parseLong(String.valueOf(str));
                System.out.println(n2);

            }
        }




        return n2;
    }

    public static boolean eql(int [] list1, int [] list2) {

        int[] t1 =list1;
        int [] t2 = list2;


        boolean eql = false;

        final int L = list1.length;
        final int L1 = list2.length;
        int count = 0;


        if (L == L1) {
            for (int i = 0; i < L; i++) {
                int a = list1[i];
                for (int j = 0; j < L1; j++) {
                    int b = list2[j];
                    if (a == b && a != 0 && b != 0) {
                        list1[i] = 0;
                        list2 [j] = 0;
                        break;
                    }
                }
            }
        } else eql = false;

        for (int i = 0; i < L; i++) {
            int a = list1[i];
            int b = list2[i];

            if (a == 0 && b == 0) {
                count++;
            }
        }




        list1 = t1;
        list2 = t2;


        if (count == L)
            eql = true;
        else eql = false;


        return eql;

    }


}
