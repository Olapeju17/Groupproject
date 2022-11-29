import java.util.Scanner;
public class MultiArray {
    static double SpentFood2;
    static double SpentTrans2;
    static double SpentShop2;
    static  double SpentSaving2;
    static double leftOverFood;
    static double leftOverTrans;
    static double leftOverShop;
    static double leftOverSaving;

    MultiArray(){
        System.out.println("Please input how much you spent in food this month: ");
        Scanner CurrentFood = new Scanner(System.in);
        String Food5 = CurrentFood.next();
        System.out.println("Please input how much you spent in transportation this month: ");
        Scanner CurrentTrans = new Scanner(System.in);
        String Trans5 = CurrentTrans.next();
        System.out.println("Please input how much you spent in shopping this month:");
        Scanner CurrentShop = new Scanner(System.in);
        String Shop5 = CurrentShop.next();
        System.out.println("Please input how much you spent in savings this month:");
        Scanner CurrentSaving = new Scanner(System.in);
        String Saving5 = CurrentSaving.next();
        SpentFood2 = Double.parseDouble(String.valueOf(Food5));
        SpentTrans2 = Double.parseDouble(String.valueOf(Trans5));
        SpentShop2 = Double.parseDouble(String.valueOf(Shop5));
        SpentSaving2 = Double.parseDouble(String.valueOf(Saving5));
        leftOverFood = (Percent.foodA-SpentFood2);
        leftOverTrans = (Percent.transportationA-SpentTrans2);
        leftOverShop = (Percent.shoppingA-SpentShop2);
        leftOverSaving = (Percent.savingA-SpentSaving2);
        }
    void ArrayTable(){
        String[][] table = new String[5][4];
        table[0][0] = "Category";
        table[0][1] = "Budget";
        table[0][2]= "Spent";
        table[0][3]= "Remainder";
        table[1][0] = "Food | ";
        table[1][1]=(String.valueOf(Percent.foodA)+ " | ");
        table[1][2]= (String.valueOf(SpentFood2)+ " | ");
        table[1][3]= (String.valueOf(leftOverFood)+ " | ");
        table[2][0] = "Shopping | ";
        table[2][1]=(String.valueOf(Percent.shoppingA)+ " | ");
        table[2][2]= (String.valueOf(SpentShop2)+ " | ");
        table[2][3]= (String.valueOf(leftOverShop)+ " | ");
        table[3][0] ="Transport | ";
        table[3][1]=(String.valueOf(Percent.transportationA)+ " | ");
        table[3][2]= (String.valueOf(SpentTrans2)+ " | ");
        table[3][3]= (String.valueOf(leftOverTrans)+ " | ");
        table[4][0] ="Savings | ";
        table[4][1]=(String.valueOf(Percent.savingA)+ " | ");
        table[4][2]= (String.valueOf(SpentSaving2)+ " | ");
        table[4][3]= (String.valueOf(leftOverSaving)+ " | ");
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



