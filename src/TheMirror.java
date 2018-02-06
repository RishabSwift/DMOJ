import java.util.Scanner;

public class TheMirror {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < total; i++) {
            int startNum = scan.nextInt();
            int endNum = scan.nextInt();
            for (int j = startNum; j < endNum; j++) {
                if (isPrime(j)) counter++;
            }
            System.out.println(counter);
            counter = 0;
        }

    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;
        if (num > 2 && num % 2 == 0) {
            return false;
        }
        int top = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < top; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
