public class StairCase {

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
}
