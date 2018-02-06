import java.util.Scanner;
import java.util.Stack;

public class CCC14S3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {

            int ingredients = scan.nextInt();

            Stack<Integer> mountain = new Stack<Integer>();
            Stack<Integer> branch = new Stack<Integer>();

            boolean pathFound = false;

            for (int j = 0; j < ingredients; j++) {
                mountain.push(scan.nextInt());
            }

            int currentNum = 1;

            while (true) {

                if (mountain.empty() && branch.empty()) {
                    pathFound = true;
                    break;
                }

                if (!mountain.empty() && mountain.peek() == currentNum) {
                    mountain.pop();
                    currentNum++;
                } else if (!branch.empty() && branch.peek() == currentNum) {
                    branch.pop();
                    currentNum++;
                } else {
                    if (mountain.empty()) {
                        break;
                    }
                    branch.push(mountain.pop());
                }
            }

            System.out.println(pathFound ? "Y" : "N");

        }

    }
}