import java.util.*;


public class Kata {


    public static long nextBiggerNumber(long n) {
        System.out.println(n);


        long b = System.currentTimeMillis();
        long n2 = -1;
        char[] chars = (n + "").toCharArray();
        List<Integer> list = new LinkedList<>();

        List<Integer> list2 = new LinkedList<>();


        for (int i = 0; i < chars.length; i++) {
            String s = chars[i] + "";
            Integer in = Integer.parseInt(s);
            list.add(in);
        }
        List<Integer> temp = new LinkedList<>(list);
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o1 < o2) return 1;
                else return 0;
            }
        });
        if (temp.equals(list)) {
            n2 = -1;
        }else {
        for (long j = n+1; j < n*5; j++) {
            list2.removeAll(list2);
            char[] chars2 = (j + "").toCharArray();
            for (int i = 0; i < chars2.length; i++) {
                String s = chars2[i] + "";
                Integer in = Integer.parseInt(s);
                list2.add(in);

            }



            if(eql(list,list2) ){

            String str = list2.toString();
            str = str.replace(", ","");
            str = str.replace("[","");
            str = str.replace("]","");


            n2 = Long.parseLong(str);
            break;
            }
            }
        }



        return n2;
    }

    public static boolean eql(List<Integer> list1, List<Integer> list2) {

        List<Integer> t1 = new LinkedList<>(list1);
        List<Integer> t2 = new LinkedList<>(list2);


        boolean eql = false;

        final int L = list1.size();
        final int L1 = list2.size();
        int count = 0;


        if (L == L1) {
            for (int i = 0; i < L; i++) {
                int a = list1.get(i);
                for (int j = 0; j < L1; j++) {
                    int b = list2.get(j);
                    if (a == b && a != 0 && b != 0) {
                        list1.set(i, 0);
                        list2.set(j, 0);
                        //  count++;
                        break;
                    }
                }
            }
        } else eql = false;

        for (int i = 0; i < L; i++) {
            int a = list1.get(i);
            int b = list2.get(i);

            if (a == 0 && b == 0) {
                count++;
            }
        }




        list1.removeAll(list1);
        list2.removeAll(list2);
        list1.addAll(t1);
        list2.addAll(t2);


        if (count == L)
            eql = true;
        else eql = false;


        return eql;

    }


}
