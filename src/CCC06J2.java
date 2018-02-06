import java.util.Scanner;

/**
 * Roll the dice
 */
public class CCC06J2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();

        int counter = 0;
        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                if (i + j == 10) counter++;
            }
        }

        String str1 = (counter == 1 ? "is" : "are");
        String str2 = (counter == 1 ? "way" : "ways");
        System.out.println("There " + str1 + " " + counter + " " + str2 + " to get the sum 10.");
    }
}