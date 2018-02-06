import java.util.Scanner;

/**
 * AmeriCanadian
 */
public class CCC02J2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // more than 4 char
        // followed by or

        String word;
        while (true) {
            word = scan.nextLine();

            if (word.equals("quit!")) {
                break;
            }

            if (word.length() > 4) {
                if ("aeiouy".indexOf(word.charAt(word.length() - 3)) == -1) {

                    if (word.endsWith("or")) {
                        word = word.replace("or", "our");
                    }
                }
            }

            System.out.println(word);
        }


    }
}