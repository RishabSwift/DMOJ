import java.util.Scanner;

/**
 * Problem J3/S1: Snakes and Ladders
 */
public class CCC03S1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int place = 1;
        while (true) {
            int move = scan.nextInt();


            if (move == 0) {
                System.out.println("You Quit!");
                break;
            }

            if (move >= 2 && move <= 12) {
                place += move;
            }

            if (place == 54) {
                place = 19;
            } else if (place == 90) {
                place = 48;
            } else if (place == 99) {
                place = 77;
            } else if (place == 9) {
                place = 34;
            } else if (place == 40) {
                place = 64;
            } else if (place == 67) {
                place = 86;
            } else if (place > 100) {
                place -= move;
            }

            System.out.println("You are now on square " + place);
            if (place == 100) {
                System.out.println("You Win!");
                break;
            }
        }
    }
}