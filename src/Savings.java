import java.util.Scanner;
public class Savings {
    public static void savings () {
        double savings1 = (MultiArray.SpentSaving2 + MultiArray.totalLeftover);
        double savings2 = MultiArray.SpentSaving2;
            System.out.println("Would you like to add your leftover budget to your savings? Click 1 for yes, Click 2 for no.");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int savings = x;
            String savingsString = "";
            switch (savings) {
                case 1:
                    savingsString = "Your total savings are: $" + savings1 + "!";
                    break;
                case 2:
                    savingsString = "Your total savings are: $" +savings2+ "!";
                    break;
            }
            System.out.println(savingsString);
        }
    }


