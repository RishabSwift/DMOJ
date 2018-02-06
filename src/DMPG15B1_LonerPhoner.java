import java.util.Scanner;

public class DMPG15B1_LonerPhoner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNumbers = scan.nextInt();
        String phoneNum[] = new String[totalNumbers];
        String formattedNum[] = new String[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            phoneNum[i] = scan.next();

            if (phoneNum[i].length() != 10) {
                formattedNum[i] = "not a phone number";
            } else {
                String first, mid, last;
                first = phoneNum[i].substring(0, 3);
                mid = phoneNum[i].substring(3, 6);
                last = phoneNum[i].substring(6, 10);

                if (first.equals("647") || first.equals("416")) {
                    formattedNum[i] = "(" + first + ")-" + mid + "-" + last;
                } else {
                    formattedNum[i] = "not a phone number";
                }
            }
        }

        for (String num : formattedNum) {
            System.out.println(num);
        }
    }
}
