public class TimeConversion {

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

}
