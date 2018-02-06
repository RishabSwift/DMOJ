import java.util.Scanner;

/**
 * Problem J3: Smile with Similes
 */
public class CCC04J3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNouns = scan.nextInt();
        int totalAdjectives = scan.nextInt();
        String[] nouns = new String[totalNouns];
        String[] adjectives = new String[totalAdjectives];


        for (int i = 0; i < nouns.length; i++) {
            nouns[i] = scan.next();
        }
        for (int i = 0; i < adjectives.length; i++) {
            adjectives[i] = scan.next();
        }

        for (String noun : nouns) {
            for (String adjective : adjectives) {
                System.out.println(noun + " as " + adjective);
            }
        }


    }
}