import java.util.Scanner;


/**
 * Problem J2: RSA Numbers
 */
public class CCC05J2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int totalRSA = 0;
        int counter = 0;
        for (int i = num1; i <= num2; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 4) {
                totalRSA++;
            }

            counter = 0;
        }

        System.out.println("The number of RSA numbers between " + num1 + " and " + num2 + " is " + totalRSA);
    }

}