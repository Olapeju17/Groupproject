import java.util.Scanner;
public class MultiArray {
    static double SpentFood2;
    static double SpentTrans2;
    static double SpentShop2;
    static  double SpentMisc2;
    static double leftOverFood;
    static double leftOverTrans;
    static double leftOverShop;
    static double leftOverMisc;

    MultiArray(){
        System.out.println("Please input how much you spent in Food this month: ");
        Scanner CurrentFood = new Scanner(System.in);
        String Food5 = CurrentFood.next();
        System.out.println("Please input how much you spent in Transportation this month: ");
        Scanner CurrentTrans = new Scanner(System.in);
        String Trans5 = CurrentTrans.next();
        System.out.println("Please input how much you spent in Shopping this month:");
        Scanner CurrentShop = new Scanner(System.in);
        String Shop5 = CurrentShop.next();
        System.out.println("Please input how much you spent in Miscellaneous this month:");
        Scanner CurrentMisc = new Scanner(System.in);
        String Misc5 = CurrentMisc.next();
        SpentFood2 = Double.parseDouble(String.valueOf(Food5));
        SpentTrans2 = Double.parseDouble(String.valueOf(Trans5));
        SpentShop2 = Double.parseDouble(String.valueOf(Shop5));
        SpentMisc2 = Double.parseDouble(String.valueOf(Misc5));
        leftOverFood = (Percent.foodA-SpentFood2);
        leftOverTrans = (Percent.transportationA-SpentTrans2);
        leftOverShop = (Percent.shoppingA-SpentShop2);
        leftOverMisc = (Percent.miscA-SpentMisc2);

        }
    void ArrayTable(){
        String[][] table = new String[5][3];
        table[0][0] = "Budget";
        table[0][1]= "Spent";
        table[0][2]= "Remainder";
        table[1][0]="0.0 | ";//food budget
        table[1][1]= (String.valueOf(SpentFood2)+ " | ");
        table[1][2]= (String.valueOf(leftOverFood)+ " | ");
        table[2][0]="0.0 | ";//transportation budget
        table[2][1]= (String.valueOf(SpentTrans2)+ " | ");
        table[2][2]= (String.valueOf(leftOverTrans)+ " | ");
        table[3][0]="0.0 | ";//shopping budget
        table[3][1]= (String.valueOf(SpentShop2)+ " | ");
        table[3][2]= (String.valueOf(leftOverTrans)+ " | ");
        table[4][0]="0.0 | ";//misc budget
        table[4][1]= (String.valueOf(SpentMisc2)+ " | ");
        table[4][2]= (String.valueOf(leftOverMisc)+ " | ");
        System.out.print(table[0][0] + " | " + table[0][1]+ " | " + table[0][2]);
        for (int r = 1; r < 5; r++) {
            System.out.print("\n");
            System.out.println("----------------------------");
            for (int c =0; c<3; c++) {
                System.out.print(table[r][c]);
            }
        }
        System.out.println("\n" + "----------------------------");
    }
}



