import java.util.Scanner;

public class CCC11S1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] sentences = new String[num];
        int sCounter = 0;
        int tCounter = 0;
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            sentences[i] = scan.nextLine().toLowerCase();
            sCounter += sentences[i].length() - sentences[i].replace("s", "").length();
            tCounter += sentences[i].length() - sentences[i].replace("t", "").length();
        }
        System.out.println(sCounter < tCounter ? "English" : "French");
    }
}
