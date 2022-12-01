import java.util.Scanner;
import java.lang.Math;
public class MonthlyBudget {
      static double NewIncome;
      static double foodA;
      static double shoppingA;
      static double transportationA;
      static double savingA;
    public static void BudgetPercentages(double f, double s, double t, double sv) {
        System.out.println("This app will help you budget your expenses! What is your monthly income: ");
        Scanner input = new Scanner(System.in);
        String myIncome = input.next();
        double myIncome2 = Double.parseDouble(myIncome);
        System.out.println("How much money do you pay in rent each month? (If you don't pay rent, enter 0)");
        String myRent = input.next();
        double myRent2 = Double.parseDouble(myRent);
        NewIncome = (myIncome2 - myRent2);
        foodA = (NewIncome * f);
        shoppingA = (NewIncome * s);
        transportationA = (NewIncome * t);
        savingA = (NewIncome * sv);
        System.out.println("Food is: " + (Math.round((f)*100))+"%");
        System.out.println("Shopping is: " + (Math.round((s)*100))+"%");
        System.out.println("Transportation is: " + (Math.round((t)*100))+"%");
        System.out.println("Savings is: " + (Math.round((sv)*100))+"%");
        System.out.println("Your monthly food budget is: $" + foodA);
        System.out.println("Your monthly shopping budget is: $" + shoppingA);
        System.out.println("Your monthly transportation budget is: $" + transportationA);
        System.out.println("Your monthly savings expenses budget is: $" + savingA + '\n');
    }
    public static double savingA() {
        return savingA;
    }
}

