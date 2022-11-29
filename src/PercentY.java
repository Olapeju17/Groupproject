import java.util.Scanner;
public class PercentY {
    static void PercentageMath(double f, double s, double t, double sv, double total) {
        Scanner food;
        Scanner shopping;
        Scanner transportation;
        Scanner saving;
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
            food = new Scanner(System.in);
            f = food.nextDouble();
            System.out.println("Enter your shopping budget percentage: ");
            shopping = new Scanner(System.in);
            s = shopping.nextDouble();
            System.out.println("Enter your transportation budget percentage: ");
            transportation = new Scanner(System.in);
            t = transportation.nextDouble();
            System.out.println("Enter your misc budget percentage: ");
            saving = new Scanner(System.in);
            sv = saving.nextDouble();
        }
        System.out.println("Thank you! You've budgeted 100%.");
        Percent. PercentageM(f,s,t,sv);
    }
}

