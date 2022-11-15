import java.util.Scanner;

public class Percent {
    public static void extracted(int f, int s, int t, int m, int total) {
        Scanner food;
        Scanner misc;
        Scanner shopping;
        Scanner transportation;
        while (total != 100) {
            total = (int) (f + s + t + m);
            if (total > 100) {
                System.out.println("You've entered: " + total + "%. That's too high! Please re-enter your budget! * Must equal 100% *");
            } else if (total < 100) {
                System.out.println("You've entered: " + total + "%. That's too low! Please re-enter your budget! * Must equal 100% *");
            }
            else {break;}
            System.out.println('\n' + "Enter your food budget percentage: ");
            food = new Scanner(System.in);
            f = food.nextInt();
            System.out.println("Enter your shopping budget percentage: ");
            shopping = new Scanner(System.in);
            s = shopping.nextInt();
            System.out.println("Enter your transportation budget percentage: ");
            transportation = new Scanner(System.in);
            t = transportation.nextInt();
            System.out.println("Enter your misc budget percentage: ");
            misc = new Scanner(System.in);
            m = misc.nextInt();
        }
        System.out.println("Thank you! You've budgeted 100%.");
        System.out.println("Food is " + f + "%");
        System.out.println("Shopping is " + s + "%");
        System.out.println("Transportation is " + t + "%");
        System.out.println("Misc is " + m + "%");
    }
}
