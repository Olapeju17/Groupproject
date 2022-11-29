import java.util.Scanner;
public class Percent {
      static double NewIncome;
      static double foodA;
      static double shoppingA;
      static double transportationA;
      static double miscA;
    static void PercentageM(double f, double s, double t, double m) {
        System.out.println("This app will help you budget your expenses! What is your monthly income: ");
        Scanner income = new Scanner(System.in);
        String myIncome = income.next();
        double myIncome2 = Double.parseDouble(myIncome);
        System.out.println("How much money do you pay in rent each month? (If you don't pay rent, enter 0)");
        String myRent = income.next();
        double myRent2 = Double.parseDouble(myRent);
        NewIncome = (myIncome2 - myRent2);
        foodA = (NewIncome * f);
        shoppingA = (NewIncome * s);
        transportationA = (NewIncome * t);
        miscA = (NewIncome * m);
        System.out.println("Food is " + ((f)*100)+"%");
        System.out.println("Shopping is " + ((s)*100)+"%");
        System.out.println("Transportation is " + ((t)*100)+"%");
        System.out.println("Misc is " + ((m)*100)+"%");
        System.out.println("Your monthly food budget is: $" + foodA);
        System.out.println("Your monthly shopping budget is: $" + shoppingA);
        System.out.println("Your monthly transportation budget is: $" + transportationA);
        System.out.println("Your monthly misc expenses budget is: $" + miscA + '\n');
    }
    public static double foodA(){
         return foodA;
    }
    public static double shoppingA(){
        return shoppingA;
    }
    public static double transportationA(){
        return transportationA;
    }
    public static double miscA(){
        return miscA;
    }
}

