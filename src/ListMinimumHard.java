import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ListMinimumHard {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());
        Integer[] s = new Integer[n];


        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(scan.readLine());
        }


        Arrays.sort(s);
        for (int t : s) {
            System.out.println(t);
        }

    }
}
