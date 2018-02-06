import java.util.Scanner;

public class GuessTheSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentNum = 1;
        while (true) {

            String in = scan.nextLine();

            int num = Integer.parseInt(in);

            if (currentNum == num) {
                System.out.println("YES");
                currentNum++;
            } else {
                System.out.println("NO");
            }

            if (currentNum == 4) {
                System.out.println("DONE");
                return;
            }

        }
    }
}
