import java.util.Scanner;

/**
 * Problem J2: Terms of Office
 */
public class CCC04J2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startYear = scan.nextInt();
        int endYear = scan.nextInt();

        for (int i = startYear; i <= endYear; i += 60) {
            System.out.println("All positions change in year " + i);
        }
    }
}