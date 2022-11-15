import java.util.Scanner;
public class enterBudget {
    enterBudget(){
        //food, rent,shopping, transportation, misc expenses
        System.out.println("This app will help you budget your expenses! What is your monthly income: ");
        Scanner income = new Scanner(System.in);
        String myIncome = income.next();
        int myIncome2 =Integer.parseInt(myIncome);
        System.out.println("How much money do you pay in rent each month? (If you don't pay rent, enter 0. If you pay rent, enter 1.)");
        //stop here
        Scanner rent = new Scanner(System.in);
        String myRent = income.next();
        int myRent2 =Integer.parseInt(myRent);
        int newIncome = (myIncome2-myRent2);

        if (myRent2 == 0) {
            System.out.println("No rent added.");
        }
        else {
            System.out.println("Your income after rent is: " + newIncome);
        }
        //stop here
//use getter and setter to call variables from another class
        //fix this section
        System.out.println("Please enter what percentage of your income will go towards the following budgets: (ex.0.30 = 30%)");
        System.out.println("Enter what percentage of your income will go towards food: ");
        Scanner foodBudget = new Scanner(System.in);
        String foodB = income.next();
        double foodB2 = Double.parseDouble(foodB);
        System.out.println("Enter what percentage of your income will go towards shopping: ");
        Scanner shoppingBudget = new Scanner(System.in);
        String shoppingB = income.next();
        double shoppingB2 = Double.parseDouble(shoppingB);
        System.out.println("Enter what percentage of your income will go towards transportation: ");
        Scanner transportationBudget = new Scanner(System.in);
        String transportationB = income.next();
        double transportationB2 = Double.parseDouble(transportationB);
        System.out.println("Enter what percentage of your income will go towards misc. expenses: ");
        Scanner miscBudget = new Scanner(System.in);
        String miscB = income.next();
        double miscB2 = Double.parseDouble(miscB);
        double food = (newIncome * foodB2);
        double shopping = (newIncome * shoppingB2);
        double transportation = (newIncome * transportationB2);
        double misc = (newIncome * miscB2);
        System.out.println("Your monthly food budget is: " + food);
        System.out.println("Your monthly shopping budget is: " + shopping);
        System.out.println("Your monthly transportation budget is: " + transportation);
        System.out.println("Your monthly misc expenses budget is: " + misc);
        //stop here
        double[] arr;
        arr = new double[4];
        arr[0] = food;
        arr[1] = shopping;
        arr[2] = transportation;
        arr[3] = misc;
        //To show that the array works
        for (int i = 0;
             i < arr.length; i++)
            System.out.println("Budget at " + i
                    + " : " + arr[i]);
    }
}
