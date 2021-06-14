package Assignment2.Ex28;
import java.util.Scanner;
public class FindingSum {

    private static final Scanner in = new Scanner(System.in);
    public static int sum (){

        int numbersRead = 0;
        int sum = 0;
        int num;

            while (true) {
                if (numbersRead == 5) {
                    break;
                }

                System.out.println("Enter a number:");
                num = in.nextInt();
                sum = sum + Integer.valueOf(num);
                numbersRead = numbersRead + 1;
            }

            return sum;
        }

}


