import java.util.Scanner;

/**
 * mockccc15j2 - Problem J2: Lowest Exam Mark
 */
public class LowestExamMark {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentMark = scan.nextInt();
        int wantMark = scan.nextInt();
        int weight = scan.nextInt();

        int markRequired =  (int)Math.ceil((100 * (wantMark - 0.5) - currentMark * (100 - weight)) / weight);

        if (markRequired > 100) {
            System.out.println("DROP THE COURSE");
        } else {
            System.out.println(Math.max(0, markRequired));
        }
    }
}
