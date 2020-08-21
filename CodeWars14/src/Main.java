

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        //System.out.println(Kata.nextBiggerNumber(970977620));
       // System.out.println(Kata.nextBiggerNumber(698844311));
        System.out.println(Kata.nextBiggerNumber(98844311));






    }

    public static boolean eql(List<Integer> list1, List<Integer> list2) {

        List<Integer> t1 = new ArrayList<>(list1);
        List<Integer> t2 = new ArrayList<>(list2);


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

//    public static boolean eql2(List<Integer> list1, List<Integer> list2){
//        List<Integer> t1 = new ArrayList<>(list1);
//        List<Integer> t2 = new ArrayList<>(list2);
//
//
//
//        list2.retainAll(list1);
//
//        System.out.println(list1);
//        System.out.println(list2);
//
//        if (list2.size() == t2.size() ) return true;
//        else return false;
//
//        }
//    }


