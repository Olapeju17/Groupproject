import java.util.Scanner;
public class PercentY {
    static void PercentageMath(double f, double s, double t, double sv, double total) {
        while (total != 1.0) {
            total = (double) (f + s + t + sv);
            if (total > 1.0) {
                System.out.println("You've entered: " + (total * 100) + "%. That's too high! Please re-enter your budget! * Must equal 100% *");
            } else if (total < 1.0) {
                System.out.println("You've entered: " + (total * 100) + "%. That's too low! Please re-enter your budget! * Must equal 100% *");
            } else {
                break;
            }
            System.out.println('\n' + "Enter your food budget percentage: ");
            Scanner input = new Scanner(System.in);
            f = input.nextDouble();
            System.out.println("Enter your shopping budget percentage: ");
            input = new Scanner(System.in);
            s = input.nextDouble();
            System.out.println("Enter your transportation budget percentage: ");
            input = new Scanner(System.in);
            t = input.nextDouble();
            System.out.println("Enter your savings budget percentage: ");
            input = new Scanner(System.in);
            sv = input.nextDouble();
        }
        System.out.println("Thank you! You've budgeted 100%.");
        Percent. PercentageM(f,s,t,sv);
    }
}

