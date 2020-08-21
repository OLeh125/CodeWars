public class Line {
    public static String createPhoneNumber(int[] numbers) {
        String str = "(";
        for (int i = 0; i <numbers.length; i++) {
            str = str +numbers[i];
            if(i == 2){
                str = str +") ";
            }
            if (i == 5){
                str = str + "-";
            }
        }
    return str;
    }

}

