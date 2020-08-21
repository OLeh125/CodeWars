public class PangramChecker {
    public static boolean check(String sentence){
        String str = sentence.toLowerCase();
        int t = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            char c = (char) i;
           if (str.contains((""+ c))){
               t++;
               System.out.println(c);
           }
        }


        if (t == 26){
            return true;
        }else {
            return false;
        }
    }
}
