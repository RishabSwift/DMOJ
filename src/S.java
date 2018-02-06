import java.util.Scanner;

public class S {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNumbers = scan.nextInt();

        // total numbers
        for (int i = 0; i < totalNumbers; i++) {
            // total words
            int totalWords = scan.nextInt();
            String words[] = new String[totalWords];

            // loop through words
            for (int j = 0; j <= words.length; j++) {
                words[i] = scan.nextLine();
            }

            // once we have all words loop through each word
            for (int j = 0; j < words.length; j++) {
                int matchingNumber = 0;

                // loop through letters in words
                for (int k = 0; k < words[j].length(); k++) {
                    if (!(words.length < j + 1)) {
                        if ((words[j].charAt(i) != words[j + 1].charAt(i))) {
                            if (matchingNumber == 0) {
                                System.out.println("Found first difference!");
                            }
                            if (matchingNumber != 0) {
                                System.out.println("Strings are more than one letter different!");
                            }
                            matchingNumber++;
                        }
                    }
                }
                System.out.println(matchingNumber);
            }
        }


    }
}

