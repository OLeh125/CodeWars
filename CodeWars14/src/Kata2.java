

public class Kata2 {

    public static int nextBiggerNumber(int N) {
        System.out.println(N);
        int num = N;
        int n = countDigits(N);
        int[] ints = new int[N];
        int i = 0;
        while (true) {
            ints[i] = num;
            System.out.println(num);
            i++;

            int rem = num % 10;
            int dev = num / 10;
            num = (int) ((Math.pow(10, n - 1)) *
                    rem + dev);

            if (num == N)
                break;
        }

//        for (int j = 0; j <ints.length ; j++) {
//            System.out.println(ints[i]);
//        }
        int min = ints[1];
        for (int j = 1; j < ints.length; j++) {

            if(ints[j] > N){
                if(ints[i] < min){
                    min = ints[i];
                }
            }

        }
        return min;
    }





    static int countDigits(int N)
    {
        int count = 0;
        while (N>0) {
            count++;
            N = N / 10;
        }
        return count;
    }


    }
