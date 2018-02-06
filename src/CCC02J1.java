import java.util.Scanner;

public class CCC02J1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String num[] = new String[10];

        num[0] = " * * * \n*     *\n*     *\n*     *\n*     *\n*     *\n*     *\n * * * \n";
        num[1] = "       \n      *\n      *\n      *\n       \n      *\n      *\n      *\n       \n";
        num[2] = " * * * \n      *\n      *\n      *\n * * * \n*      \n*      \n*      \n * * * \n";
        num[3] = " * * * \n      *\n      *\n      *\n * * * \n      *\n      *\n      *\n * * * \n";
        num[4] = "       \n*     *\n*     *\n*     *\n * * * \n      *\n      *\n      *\n       \n";
        num[5] = " * * * \n*      \n*      \n*      \n * * * \n      *\n      *\n      *\n * * * \n";
        num[6] = " * * * \n*      \n*      \n*      \n * * * \n*     *\n*     *\n*     *\n * * * \n";
        num[7] = " * * * \n      *\n      *\n      *\n       \n      *\n      *\n      *\n      *\n";
        num[8] = " * * * \n*     *\n*     *\n*     *\n * * * \n*     *\n*     *\n*     *\n * * * \n";
        num[9] = " * * * \n*     *\n*     *\n*     *\n * * * \n      *\n      *\n      *\n * * * \n";


        int n = scan.nextInt();

        System.out.println(num[n]);
    }
}