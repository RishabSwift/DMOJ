import java.util.Scanner;

public class MOCKCCC15J1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int areaCode = scan.nextInt();
        String number = scan.next();

        if (areaCode == 416 || areaCode == 647 || areaCode == 437) {

            if (number.length() == 7) {
                if (areaCode == 416) {
                    System.out.println("valuable");
                } else {
                    System.out.println("valueless");
                }
            } else {
                System.out.println("invalid");
            }

        } else {
            System.out.println("invalid");
        }
    }
}
