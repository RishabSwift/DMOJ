

/*
 * CCC00J1.java
 * Calender
 * 5 3, 2017
 *
 * @author Rishab Bhatt
 */

import java.util.Scanner;

public class CCC00J1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weekStart = scan.nextInt();
        int days = scan.nextInt();


        String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
        for (String week : weeks) {
            System.out.print(week);
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 1; i <= weeks.length; i++) {
            for (int j = 1; j <= days; j++) {
                if (weekStart == i - 1) {
                    System.out.print(j + " ");
                }
            }
            if (weekStart != i - 1) {
                System.out.print(" ");
            }
        }

    }
}
