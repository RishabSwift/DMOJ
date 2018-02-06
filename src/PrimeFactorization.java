import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

    private static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        for (int i = 0; i < total; i++) {
            for (Integer num : primeFactors(scan.nextInt())) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
