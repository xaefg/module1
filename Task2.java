import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial position");
        String start = input.next();
        System.out.println("Enter target position");
        String end = input.next();
        int[] arr = pos(start);
        int[] arr1 = pos(end);
        System.out.println(checker(arr, arr1));
    }

    static int[] pos(String in) {
        String letters = "ABCDEFGH";
        String numbers = "12345678";
        if (!Pattern.matches("[A-H][1-8]", in)) {
            throw new RuntimeException("Invalid input");
        }
        return new int[]{letters.indexOf(in.charAt(0)) + 1, numbers.indexOf(in.charAt(1)) + 1};
    }

    static boolean checker(int[] arr, int[] arr1) {
        int x = arr[0];
        int y = arr[1];
        int x1 = arr1[0];
        int y1 = arr1[1];
        return Math.abs(x - x1) == 2 && Math.abs(y - y1) == 1 || Math.abs(x - x1) == 1 && Math.abs(y - y1) == 2;
    }
}
