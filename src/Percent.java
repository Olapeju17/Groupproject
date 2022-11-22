import java.util.Scanner;
public class Percent {
    static void PercentageM(double f, double s, double t, double m) {
        System.out.println("This app will help you budget your expenses! What is your monthly income: ");
        Scanner income = new Scanner(System.in);
        String myIncome = income.next();
        double myIncome2 = Double.parseDouble(myIncome);
        System.out.println("How much money do you pay in rent each month? (If you don't pay rent, enter 0)");
        String myRent = income.next();
        double myRent2 = Double.parseDouble(myRent);
        double NewIncome = (myIncome2 - myRent2);
        double foodA = (NewIncome * f);
        double shoppingA = (NewIncome * s);
        double transportationA = (NewIncome * t);
        double miscA = (NewIncome * m);
        System.out.println("Food is " + f);
        System.out.println("Shopping is " + s);
        System.out.println("Transportation is " + t );
        System.out.println("Misc is " + m);
        System.out.println("Your monthly food budget is: $" + foodA);
        System.out.println("Your monthly shopping budget is: $" + shoppingA);
        System.out.println("Your monthly transportation budget is: $" + transportationA);
        System.out.println("Your monthly misc expenses budget is: $" + miscA + '\n');
        //use multi-dimensional array to print budget display
    }
}
