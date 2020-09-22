import java.util.Scanner;

public class christmasMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyGoal = Double.parseDouble(sc.nextLine());
        int fantasy = Integer.parseInt(sc.nextLine());
        int horror = Integer.parseInt(sc.nextLine());
        int romantic = Integer.parseInt(sc.nextLine());
        double priceF = 14.90;
        double priceH = 9.80;
        double priceR = 4.30;

        double totalMoney = fantasy * priceF + horror * priceH + romantic * priceR;
        double sellerMoney;
        double neededMoney;
        double moneyDDS = totalMoney - totalMoney * 0.2;
        if (moneyDDS >= moneyGoal) {
            sellerMoney = (moneyDDS - moneyGoal) * 0.1;
            sellerMoney=Math.floor(sellerMoney);
            moneyDDS -= sellerMoney;
            System.out.printf("%.2f leva donated.", moneyDDS);
            System.out.println();
            System.out.printf("Sellers will receive %.0f leva.", sellerMoney);
        } else {
            neededMoney = moneyGoal - moneyDDS;
            System.out.printf("%.2f money needed.", neededMoney);
        }
    }
}
