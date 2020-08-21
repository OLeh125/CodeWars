import java.security.SecureRandom;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        final int S = 1;
        final int M = 60;
        final int H = 60*60;
        final int D = 24*60*60;
        final int Y = 365*24*60*60;
        int temp = 0;
        int remainder;
        StringBuilder sb = new StringBuilder();
        int y,d,h,m,s;


        if (seconds == 0){
            return "now";
        }

        ///////////////////////////////////// YEARS////////////////////////////////////
        y = seconds/Y;
        remainder = seconds%Y;

        if ( y > 1){
            sb.append(y);
            sb.append(" years");
            temp++;
        }

        if ( y == 1){
            sb.append(y);
            sb.append(" year");
            temp++;
        }

        if ( y!=0 && remainder %D == 0){
            sb.append(" and ");

        }else if (y!=0 && remainder !=0 && remainder !=0){
            sb.append(", ");

        }

        System.out.println(" years ="+ y);
        ///////////////////////////////////// YEARS////////////////////////////////////



        ///////////////////////////////////// DAYS////////////////////////////////////

        d = remainder/D;
        remainder= remainder%D;
        if ( d == 1){
            sb.append(d);
            sb.append(" day");
            temp++;
        }
        if ( d > 1){
            sb.append(d);
            sb.append(" days");
            temp++;
        }
        if ( d!=0 && remainder %H == 0 && remainder !=0){
            sb.append(" and ");

        }else if (d!=0 && remainder !=0){
            sb.append(", ");
        }
        System.out.println(" days = " + d);


        ///////////////////////////////////// DAYS////////////////////////////////////


        ///////////////////////////////////// HOURS////////////////////////////////////

        h = remainder/H;
        remainder = remainder%H;
        if ( h == 1){
            sb.append(h);
            sb.append(" hour");
            temp++;
        }
        if ( h > 1){
            sb.append(h);
            sb.append(" hours");
            temp++;
        }
        if ( h!=0 && remainder %M == 0 && remainder !=0){
            sb.append(" and ");

        }else if (h!=0 && remainder !=0){
            sb.append(", ");
        }
        System.out.println(" hours = " + h);

        ///////////////////////////////////// HOURS////////////////////////////////////


        ///////////////////////////////////// MINUETS////////////////////////////////////

        m = remainder/M;
        remainder = remainder%M;
        if ( m == 1){
            sb.append(m);
            sb.append(" minute");
            temp++;
        }
        if ( m > 1){
            sb.append(m);
            sb.append(" minutes");
            temp++;
        }
        if (m!=0 && remainder %S == 0 && remainder !=0){
            sb.append(" and ");

        }else if (m!=0 && remainder !=0){
            sb.append(", ");
        }
        System.out.println( " minutes = " + m);

        ///////////////////////////////////// MINUETS////////////////////////////////////


        ///////////////////////////////////// SECONDS////////////////////////////////////

        s = remainder/S;
        remainder = remainder%S;

        if ( s == 1){
            sb.append(s);
            sb.append(" second");
            temp++;
        }
        if ( s > 1){
            sb.append(s);
            sb.append(" seconds");
            temp++;
        }
        System.out.println( " seconds = " + s);

        ///////////////////////////////////// SECONDS////////////////////////////////////


        if(temp==2){
            String str = sb+ "";
            str = str.replace(", "," and ");
            return str;
        }
        if(temp == 3){
            String str = sb+ "";
            String end = str.substring(15);
            String beg = str.substring(0,15);
            end = end.replace(", "," and ");

            return beg+end;
        }

        return ""+sb;
    }
}