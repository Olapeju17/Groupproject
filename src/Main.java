import java.util.Scanner;
import java.util.Random;
public class Main {
    static void introPage() {
        //
        System.out.println("Hello! Welcome to the Budgeting app! Let's get started with a username!");
        System.out.println("Please enter your first name:");
        Scanner nameF = new Scanner(System.in);
        String firstName = nameF.next();
        System.out.println("Please enter your last name:");
        Scanner nameL = new Scanner(System.in);
        String lastName = nameL.next();
        Random num= new Random();
        int ranNum=num.nextInt(99);
        String userName= firstName.toUpperCase() + lastName.toUpperCase().substring(lastName.length() -1 )+ranNum;
        System.out.println("Your username is: " +userName);
        System.out.println("Hi " + firstName + ", let's start budgeting!");
    }
    public static void main(String[] args) {
        introPage();
        new percentageBreakdown();
        new enterBudget();
    }
}