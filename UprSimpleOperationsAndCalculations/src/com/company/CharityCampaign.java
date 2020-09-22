package com.company;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=Integer.parseInt(sc.nextLine());
        int confectioners=Integer.parseInt(sc.nextLine());
        int cakes=Integer.parseInt(sc.nextLine());
        int waffles=Integer.parseInt(sc.nextLine());
        int pancakes=Integer.parseInt(sc.nextLine());
        double moneyWaffles=waffles*5.80;
        double moneyPancakes=pancakes*3.20;
        double moneyCakes=cakes*45;
        double sumDay=confectioners*(moneyCakes+moneyPancakes+moneyWaffles);
        double sumAll=days*sumDay;
        double sumCharity=sumAll-sumAll/8;
        System.out.printf("%.2f",sumCharity);
    }
}
