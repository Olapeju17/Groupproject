import java.util.Scanner;
public class PercentY {
    static void PercentageMath(double f, double s, double t, double m, double total) {
        Scanner food;
        Scanner misc;
        Scanner shopping;
        Scanner transportation;
        while (total != 1.0) {
            total = (double) (f + s + t + m);
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
            misc = new Scanner(System.in);
            m = misc.nextDouble();
        }
        System.out.println("Thank you! You've budgeted 100%.");
        //why isn't the new f,s,t,m values saving

    }
}

