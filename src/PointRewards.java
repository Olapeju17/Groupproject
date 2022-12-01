public class PointRewards {
    public static void PointRewards2() {
        if (MultiArray.totalLeftover > 0.0 && MultiArray.totalLeftover < 30.0){
            System.out.println("Congrats! You've earned 10 savings points!");}
        if (MultiArray.totalLeftover > 30.0 && MultiArray.totalLeftover < 60.0){
            System.out.println("Congrats! You've earned 20 savings points!");}
        if (MultiArray.totalLeftover > 60.0 && MultiArray.totalLeftover < 90.0){
            System.out.println("Congrats! You've earned 30 savings points!");}
        if (MultiArray.totalLeftover > 90.0 && MultiArray.totalLeftover < 120.0){
            System.out.println("Congrats! You've earned 40 savings points!");}
        if (MultiArray.totalLeftover > 120.0 && MultiArray.totalLeftover < 180.0){
            System.out.println("Congrats! You've earned 50 savings points!");}
        if (MultiArray.totalLeftover > 180.0 && MultiArray.totalLeftover < 240.0){
            System.out.println("Congrats! You've earned 60 savings points!");}
        if (MultiArray.totalLeftover > 240.0 && MultiArray.totalLeftover < 300.0){
            System.out.println("Congrats! You've earned 70 savings points!");}
        if (MultiArray.totalLeftover > 300.0 && MultiArray.totalLeftover < 360.0){
            System.out.println("Congrats! You've earned 80 savings points!");}
        if (MultiArray.totalLeftover > 360.0 && MultiArray.totalLeftover < 420.0){
            System.out.println("Congrats! You've earned 90 savings points!");}
        if (MultiArray.totalLeftover > 420.0 && MultiArray.totalLeftover < 500){
            System.out.println("Congrats! You've earned 100 savings points!");}
        if (MultiArray.totalLeftover > 500.0 && MultiArray.totalLeftover < 700.0){
            System.out.println("Congrats! You've earned 150 savings points!");}
        if (MultiArray.totalLeftover > 700.0 && MultiArray.totalLeftover < 1000.0){
            System.out.println("Congrats! You've earned 200 savings points!");}
        if (MultiArray.totalLeftover > 1000.0 && MultiArray.totalLeftover < MonthlyBudget.NewIncome){
            System.out.println("Congrats! You've earned 500 savings points!");}
        else if (MultiArray.totalLeftover == 0.0){
            System.out.println("You've earned 0 points");}
        }
}

