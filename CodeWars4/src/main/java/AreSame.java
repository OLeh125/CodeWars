



public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        // 10,2,4,8
        if( a.length == 0 || b.length == 0){
            return false;
        }
        boolean v = false;
        int t = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                System.out.println(a[i] +" == " + b[j]);
                if(a[i] == b[j] || a[i] == Math.sqrt(b[j]) || a[i] == (b[j] * b[j])  ){
                    b[j] =-123456789;
                    t++;
                    break;

                }else {
                    System.out.println("false");


                }

            }
        }
        System.out.println("-----");
        if(t >= a.length){
            return true;
        }else {
            return false;
        }
    }
}