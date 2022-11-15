import java.util.Scanner;
    public class percentageBreakdown {
        percentageBreakdown() {

            System.out.println("Please enter what percentage of your income will go towards the following budgets: (ex. 30 = 30%)" + '\n' + "* Budget must equal 100% *");
            System.out.println('\n' + "Enter your food budget percentage: ");
            Scanner food = new Scanner(System.in);
            int f = food.nextInt();
            System.out.println("Enter your shopping budget percentage: ");
            Scanner shopping = new Scanner(System.in);
            int s = shopping.nextInt();
            System.out.println("Enter your transportation budget percentage: ");
            Scanner transportation = new Scanner(System.in);
            int t = transportation.nextInt();
            System.out.println("Enter your misc budget percentage: ");
            Scanner misc = new Scanner(System.in);
            int m = misc.nextInt();
            int total = 0;
            Percent. extracted(f, s, t, m, total);
        }


    }

