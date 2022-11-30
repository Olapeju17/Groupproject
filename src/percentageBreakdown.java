import java.util.Random;
import java.util.Scanner;
    public class percentageBreakdown {
        double f; double s; double t; double sv; double total;
        static void introPage() {
            System.out.println("Hello! Welcome to the MoneyUP! Let's get started with a username!");
            System.out.println("Please enter your first name:");
            Scanner input = new Scanner(System.in);
            String firstName = input.next();
            System.out.println("Please enter your last name:");
            String lastName = input.next();
            Random num= new Random();
            int ranNum=num.nextInt(99);
            String userName= firstName.toUpperCase() + lastName.toUpperCase().substring(lastName.length() -1 )+ranNum;
            System.out.println("Your username is: " +userName);
            System.out.println("Hi " + firstName + ", let's start budgeting!");}
        percentageBreakdown() {
            System.out.println("Please enter what percentage of your income will go towards the following budgets: (ex. .30 = 30%)" + '\n' + "* Budget must equal 100% *");
            System.out.println('\n' + "Enter your food budget percentage: ");
            Scanner input = new Scanner(System.in);
            f = input.nextDouble();
            System.out.println("Enter your shopping budget percentage: ");
            s = input.nextDouble();
            System.out.println("Enter your transportation budget percentage: ");
            t = input.nextDouble();
            System.out.println("Enter your savings budget percentage: ");
            sv = input.nextDouble();
            total = 0.9;
            PercentY.PercentageMath(f,s,t,sv,total);
        }
    }

