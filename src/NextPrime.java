import java.util.Scanner;

public class NextPrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (!isPrime(n)) {
            n++;
        }
        System.out.println(n);


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
