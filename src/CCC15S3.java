import java.util.Scanner;

public class CCC15S3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean[] gates = new boolean[scan.nextInt() + 1];

        int total = scan.nextInt();
        int docked = 0;
        for (int i = 0; i < total; i++) {
            int gate = scan.nextInt();
            int st = docked;
            for (int j = gate; j >= 1; j--) {
                if (!gates[j]) {
                    docked++;
                    gates[j] = true;
                    j = 0;
                }
            }
            if (docked == st)
                i = total;
        }
        System.out.println(docked);
    }

}