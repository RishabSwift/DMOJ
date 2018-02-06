import java.util.Scanner;

public class CCC07S1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int[] year = new int[people];
        int[] month = new int[people];
        int[] day = new int[people];

        for (int i = 0; i < people; i++) {
            year[i] = scan.nextInt();
            month[i] = scan.nextInt();
            day[i] = scan.nextInt();
        }

        for (int i = 0; i < people; i++) {
            if (year[i] > 1989) {
                System.out.println("No");
            } else if (year[i] == 1989 && month[i] == 2 && day[i] > 27) {
                System.out.println("No");
            } else if (year[i] == 1989 && month[i] > 2) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}