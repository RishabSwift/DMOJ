import java.util.Scanner;

public class ThePerfectMate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNames = scan.nextInt();

        String winner = "";
        int max = -1;

        for (int i = 0; i < totalNames; i++) {
            String name = scan.next();
            int wins = scan.nextInt();
            int loss = scan.nextInt();

            // if they haven't lost
            if (loss == 0) {
                // if they won
                if (wins > max) {
                    max = wins;
                    winner = name;
                }
            }
        }
        if (winner.equals("")) {
            System.out.println("None");
        }
        System.out.println(winner);
    }
}
