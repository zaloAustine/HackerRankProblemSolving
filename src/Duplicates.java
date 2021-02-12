import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args) {
        // staircase(5);
        //timeConversion("07:40:03AM");
    }

    static void staircase(int n) {
        StringBuilder stringBuffer = new StringBuilder();
        StringBuilder spaceBuffer = new StringBuilder();
        int start = n;

        for (int i = 0; i < n; i++) {
            for (int j = start; j > 0; j--) {
                spaceBuffer.append(" ");
            }
            stringBuffer.append("#");
            String result = spaceBuffer.toString() + stringBuffer.toString();
            System.out.println(result);
            spaceBuffer.setLength(0);
            start--;
        }

    }

    static String timeConversion(String s) {

        String result = "00";
        StringBuilder stringBuilder = new StringBuilder();
        char[] time = s.toCharArray();
        stringBuilder.append(time);
        String hr = chartoStr(time[0]) + chartoStr(time[1]);
        int hr12 = StringtoInt(hr);

        if (hr12 < 12) {
            if(chartoStr(time[time.length - 2]).equals("a".toUpperCase())){
                result = hr;
            }else {
                hr12 += 12;
                result = String.valueOf(hr12);
            }

        } else if (hr12 == 12) {
            if(chartoStr(time[time.length - 2]).equals("p".toUpperCase())){

                result = "12";
            }else {
                result = "00";
            }
        }
        stringBuilder.replace(0, 2, String.valueOf(result));
        stringBuilder.deleteCharAt(time.length - 1);
        stringBuilder.deleteCharAt(time.length - 2);

        return stringBuilder.toString();
    }

    public static int StringtoInt(String c) {
        return Integer.parseInt(String.valueOf(c));
    }

    public static String chartoStr(char c) {
        return String.valueOf(c);
    }

    static String[] twoStrings(long k, String a, String b) {
        String[] str = new String[2];


        return str;
    }

}