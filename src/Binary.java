import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalNumbers = scan.nextInt();

        String num;
        double totalDigits;
        String zeros;
        int sub;
        String[] grouped = new String[totalNumbers];
        String[] finalString = new String[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {

            // Reset the 0's
            zeros = "";

            // Get the numbers as Binary
            num = Integer.toBinaryString(scan.nextInt());

            // Get the total number of digits required that is divisible by 4
            // that's nearest to the num variable
            totalDigits = Math.ceil(num.length() / 4.0) * 4;

            if (totalDigits > num.length()) {

                sub = (int) (totalDigits - num.length());

                // Add the required zeros to make it a multiple of 4 to help
                // with adding space
                for (int j = 1; j <= sub; j++) {
                    zeros += "0";
                }

            }

            // Add the zeros before the num
            num = zeros + num;

            // Split it into an array that is split using regex - split every 4 characters
            grouped = num.split("(?<=\\G.{4})");

            // Join the array using a space
            finalString[i] = String.join(" ", grouped);

        }

        // Print the string
        for (String fString : finalString) {
            System.out.println(fString);
        }

    }

}