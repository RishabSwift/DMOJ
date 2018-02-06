import java.util.Scanner;

public class RenAshbell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();
        int n = -1;
        boolean strongest = true;

        for (int i = 0; i < max; i++) {
            if (i == 0) {
                n = scan.nextInt();
            } else {

                int num = scan.nextInt();
                if (num > n) {
                    strongest = false;
                }
            }
        }

        System.out.println(strongest ? "YES" : "NO");
    }
}
