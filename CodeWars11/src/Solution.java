

public class Solution {
    public static String camelCase(String str) {
        System.out.println(str);
        if(str.length() == 1){
            return str.toUpperCase();
        }else {
        StringBuilder sb = new StringBuilder();
        char [] chars = str.toCharArray();

        for (int i = 0; i <chars.length ; i++) {
            if(i == 0 & chars[i] != ' '){
                sb.append((""+chars[i]).toUpperCase());
                i++;
            }
           if(chars[i] == ' ' && i<chars.length-1){
               if(  chars[i+1] !=' '){
                   String temp = (""+chars[i+1]).toUpperCase();
                   sb.append(temp);
                   i++;
               }
           }else if(chars[i] != ' ') {
               sb.append(chars[i]);
           }

        }

        return "" +sb;
        }
    }
}
