import java.util.Scanner;
    public class percentageBreakdown {
        static  double f;
        static double s;
        static double t;
        static double m;
        static double total;

        percentageBreakdown() {
            System.out.println("Please enter what percentage of your income will go towards the following budgets: (ex. .30 = 30%)" + '\n' + "* Budget must equal 100% *");
            System.out.println('\n' + "Enter your food budget percentage: ");
            Scanner food = new Scanner(System.in);
            f = food.nextDouble();
            System.out.println("Enter your shopping budget percentage: ");
            Scanner shopping = new Scanner(System.in);
            s = shopping.nextDouble();
            System.out.println("Enter your transportation budget percentage: ");
            Scanner transportation = new Scanner(System.in);
            t = transportation.nextDouble();
            System.out.println("Enter your misc budget percentage: ");
            Scanner misc = new Scanner(System.in);
            m = misc.nextDouble();
            total = 0.9;
            PercentY.PercentageMath(f,s,t,m,total);
        }
    }

