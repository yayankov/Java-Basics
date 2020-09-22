import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        double puzzle = 2.60;
        double doll = 3;
        double teddyBear = 4.10;
        double mignon = 8.20;
        double truck = 2;
        Scanner sc = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(sc.nextLine());
        int puzzleNum = Integer.parseInt(sc.nextLine());
        int dollNum = Integer.parseInt(sc.nextLine());
        int bearNum = Integer.parseInt(sc.nextLine());
        int mignonNum = Integer.parseInt(sc.nextLine());
        int truckNum = Integer.parseInt(sc.nextLine());
        int numAll = puzzleNum + dollNum + bearNum + mignonNum + truckNum;
        double priceAll = puzzleNum * puzzle + dollNum * doll + bearNum * teddyBear + mignonNum * mignon + truckNum * truck;
        double discount = priceAll * 0.25;
        if (numAll >= 50) {
            priceAll -= discount;
        }
        priceAll -= priceAll * 0.1;
        double rest;
        if (priceAll >= priceExcursion) {
            rest = priceAll - priceExcursion;
            System.out.printf("Yes! %.2f lv left.", rest);
        } else {
            rest = priceExcursion - priceAll;
            System.out.printf("Not enough money! %.2f lv needed.", rest);
        }
    }
}
