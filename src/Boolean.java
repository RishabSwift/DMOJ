import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        List<String> boolText = Arrays.asList(text.split(" "));

        boolean t = boolText.contains("True");

        for (String txt : boolText) {
            if (txt.equals("not")) {
                t = !t;
            }
        }

        System.out.println(t ? "True" : "False");


    }
}
