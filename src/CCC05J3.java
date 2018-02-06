import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC05J3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> directions = new ArrayList<String>();
        List<String> street = new ArrayList<String>();

        int counter = 0;
        while (true) {
            directions.add(scan.nextLine());
            street.add(scan.nextLine());
            if (street.get(counter).equals("SCHOOL")) {
                break;
            }
            counter++;
        }

        for (int i = directions.size(); i-- > 0; ) {
            System.out.println("Turn " + (directions.get(i).equals("R") ? "LEFT" : "RIGHT") + (i != 0 ? " onto " + street.get(i - 1) + " street." : " into your HOME."));
        }

    }
}