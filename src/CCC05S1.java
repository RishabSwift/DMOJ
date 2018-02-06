import java.util.Scanner;

/**
 * CCC '05 S1 - Snow Calls
 */
public class CCC05S1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            String phoneNumber = scan.next();
            phoneNumber = replaceNumbers(phoneNumber);
            phoneNumber = formatNumbers(phoneNumber);

            System.out.println(phoneNumber);
        }
    }

    private static String replaceNumbers(String num) {
        num = num.replaceAll("A", "2");
        num = num.replaceAll("B", "2");
        num = num.replaceAll("C", "2");
        num = num.replaceAll("D", "3");
        num = num.replaceAll("E", "3");
        num = num.replaceAll("F", "3");
        num = num.replaceAll("G", "4");
        num = num.replaceAll("H", "4");
        num = num.replaceAll("I", "4");
        num = num.replaceAll("J", "5");
        num = num.replaceAll("K", "5");
        num = num.replaceAll("L", "5");
        num = num.replaceAll("M", "6");
        num = num.replaceAll("N", "6");
        num = num.replaceAll("O", "6");
        num = num.replaceAll("P", "7");
        num = num.replaceAll("Q", "7");
        num = num.replaceAll("R", "7");
        num = num.replaceAll("S", "7");
        num = num.replaceAll("T", "8");
        num = num.replaceAll("U", "8");
        num = num.replaceAll("V", "8");
        num = num.replaceAll("W", "9");
        num = num.replaceAll("X", "9");
        num = num.replaceAll("Y", "9");
        num = num.replaceAll("Z", "9");

        return num;
    }

    private static String formatNumbers(String num) {
        num = num.replaceAll("-", "");

        String first, mid, last;
        first = num.substring(0, 3);
        mid = num.substring(3, 6);
        last = num.substring(6, 10);

        num = first + "-" + mid + "-" + last;

        return num;
    }
}