import java.util.Scanner;

public class CCC08S1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city;
        int temp;

        String coldestCity = "";
        int coldestTemp = 201;

        while (true) {
            city = scan.next();
            temp = scan.nextInt();

            if (temp < coldestTemp) {
                coldestTemp = temp;
                coldestCity = city;
            }

            if (city.equals("Waterloo")) {
                break;
            }
        }

        System.out.println(coldestCity);

    }
}