import java.util.Arrays;
import java.util.Scanner;

public class ListMinimum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = scan.nextInt();
        }


        Arrays.sort(s);
        for (int t : s) {
            System.out.println(t);
        }
    }
}
