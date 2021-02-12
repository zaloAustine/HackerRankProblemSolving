import java.util.Arrays;
import java.util.List;

public class lambdas {
    public static void main(String[] args) {
        System.out.println(process("zalo", String::toUpperCase));
        Integer[] arr = {2, 56, 76, 5, 4, 4, 4, 67, 6, 4, 5, 2, 4, 66, 8, 87};
        String[] stringArray = {"Geeks", "forGeeks","A computer Portal"};

        System.out.println("Array :" + Arrays.toString(sortArray(arr)));
        System.out.println("List :" + sortList(stringArray).toString());
    }

    private static String process(String str, ProcessString processString) {
        return processString.process(str);
    }

    public static Integer[] sortArray(Integer[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static <T> List<T> sortList(T[] arr) {
        Arrays.sort(arr);
        return Arrays.asList(arr);
    }
}

interface ProcessString {
    String process(String str);
}


