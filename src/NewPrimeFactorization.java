import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewPrimeFactorization {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        primeFactors(number).forEach(System.out::println);
    }

    private static List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }


}
