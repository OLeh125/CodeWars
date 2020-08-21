class Solution{
    public static String solve(String s){
        StringBuilder stringBuilder = new StringBuilder(s);

        if(s.equals(stringBuilder.reverse().toString())) return "OK";

        for (int i = 0; i < s.length(); i++) {
            stringBuilder = new StringBuilder(s).delete(i, i+1);

            if(stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                return "remove one";
            }

        }

        return "not possible";
    }
}