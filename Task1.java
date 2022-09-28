import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 0 , 2, 2};
        checker(arr);
    }

    static void checker(int[] arr) {
        System.out.println((int)Arrays.stream(arr).distinct().count());
    }
}
