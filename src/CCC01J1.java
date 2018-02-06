import java.util.Scanner;

/**
 * Dressing Up
 */
public class CCC01J1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int stars, spaces;

        for (int i = 0; i < num; i++) {

            spaces = 4 * Math.abs(num / 2 - i);
            stars = 2 * num - spaces;

            // print stars
            for (int j = 0; j < stars / 2; j++)
                System.out.print("*");
            //print space
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            //print stars
            for (int j = 0; j < stars / 2; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}