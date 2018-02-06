import java.util.Scanner;

/**
 * Seed 1
 */
public class Ship {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String parts[] = {"B", "F", "T", "L", "C"};

        int count = 1;
        for (String part : parts) {
            if (s.contains(part)) {

                if (count == 5) {
                    System.out.println("NO MISSING PARTS");
                }
                count++;
            } else {
                System.out.println(part);
            }

        }

    }
}
