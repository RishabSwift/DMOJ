import java.util.Scanner;

/**
 * Problem J2: I Speak TXTMSG
 */
public class CCC07J2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = "";

        while (!message.equals("TTYL")) {
            message = scan.next();

            switch (message) {
                case "CU":
                    System.out.println("see you");
                    break;
                case ":-)":
                    System.out.println("I'm happy");
                    break;
                case ":-(":
                    System.out.println("I'm sad");
                    break;
                case ";-)":
                    System.out.println("wink");
                    break;
                case ":-P":
                    System.out.println("stick out my tongue");
                    break;
                case "(~.~)":
                    System.out.println("sleepy");
                    break;
                case "TA":
                    System.out.println("totally awesome");
                    break;
                case "CCC":
                    System.out.println("Canadian Computing Competition");
                    break;
                case "TY":
                    System.out.println("thank-you");
                    break;
                case "YW":
                    System.out.println("you're welcome");
                    break;
                case "TTYL":
                    System.out.println("talk to you later");
                    break;
                default:
                    System.out.println(message);
                    break;
            }


        }


    }
}