import java.util.Scanner;
public class MultiArray {
    public static double totalLeftover;
    public static double SpentSaving2;
    static double SpentFood2; static double SpentTrans2; static double SpentShop2;
    static double leftOverFood;
    static double leftOverTrans; static double leftOverShop; static double leftOverSaving;
    public static void Multi(){
        System.out.println("Please input how much you spent in food this month: ");
        Scanner input = new Scanner(System.in);
        String Food5 = input.next();
        System.out.println("Please input how much you spent in shopping this month:");
        String Shop5 = input.next();
        System.out.println("Please input how much you spent in transportation this month: ");
        String Trans5 = input.next();
        System.out.println("Please input how much money you've put towards savings this month:");
        String Saving5 = input.next();
        SpentFood2 = Double.parseDouble(String.valueOf(Food5));
        SpentTrans2 = Double.parseDouble(String.valueOf(Trans5));
        SpentShop2 = Double.parseDouble(String.valueOf(Shop5));
        SpentSaving2 = Double.parseDouble(String.valueOf(Saving5));
        leftOverFood = (MonthlyBudget.foodA-SpentFood2);
        leftOverTrans = (MonthlyBudget.transportationA-SpentTrans2);
        leftOverShop = (MonthlyBudget.shoppingA-SpentShop2);
        leftOverSaving = (MonthlyBudget.savingA-SpentSaving2);
        totalLeftover =(leftOverFood + leftOverSaving+leftOverTrans+leftOverShop);
        }
    public static void ArrayTable(){
        String[][] table = new String[5][4];
        table[0][0] = "Category"; table[0][1] = "Budget"; table[0][2]= "Spent"; table[0][3]= "Remainder";
        table[1][0] = "Food | "; table[1][1]=((MonthlyBudget.foodA)+ " | "); table[1][2]= ((SpentFood2)+ " | "); table[1][3]= ((leftOverFood)+ " | ");
        table[2][0] = "Shopping | "; table[2][1]=((MonthlyBudget.shoppingA)+ " | "); table[2][2]= ((SpentShop2)+ " | "); table[2][3]= ((leftOverShop)+ " | ");
        table[3][0] ="Transport | "; table[3][1]=((MonthlyBudget.transportationA)+ " | "); table[3][2]= ((SpentTrans2)+ " | "); table[3][3]= ((leftOverTrans)+ " | ");
        table[4][0] ="Savings | "; table[4][1]=((MonthlyBudget.savingA)+ " | "); table[4][2]= ((SpentSaving2)+ " | "); table[4][3]= ((leftOverSaving)+ " | ");
        System.out.print(table[0][0] + " | " + table[0][1]+ " | " + table[0][2] + " | " + table[0][3]+ " | ");
        for (int r = 1; r < 5; r++) {
            System.out.print("\n");
            System.out.println("-----------------------------------");
            for (int c =0; c<4; c++) {
                System.out.print(table[r][c]);
            }
        }
        System.out.println("\n" + "-----------------------------------");
    }
}



