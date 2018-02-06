import java.util.Scanner;

public class BTS16_HARAMBE {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int lowerCaseCounter = 0, upperCaseCounter = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                upperCaseCounter++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lowerCaseCounter++;
            }

        }

        if (upperCaseCounter > lowerCaseCounter) {
            str = str.toUpperCase();
        } else if (upperCaseCounter < lowerCaseCounter) {
            str = str.toLowerCase();
        }

        System.out.println(str);


    }

}