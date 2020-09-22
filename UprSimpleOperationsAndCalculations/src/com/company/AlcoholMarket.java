package com.company;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double whiskeyLEV=Double.parseDouble(sc.nextLine());
        double beerL=Double.parseDouble(sc.nextLine());
        double wineL=Double.parseDouble(sc.nextLine());
        double rakiaL=Double.parseDouble(sc.nextLine());
        double whiskeyL=Double.parseDouble(sc.nextLine());

        double whiskeyAll=whiskeyL*whiskeyLEV;
        double rakiaLEV=whiskeyLEV-whiskeyLEV*0.5;
        double rakiaAll=rakiaL*rakiaLEV;
        double wineAll=wineL*(rakiaLEV-rakiaLEV*0.4);
        double beerAll=beerL*(rakiaLEV-rakiaLEV*0.8);
        double All=whiskeyAll+rakiaAll+beerAll+wineAll;
        System.out.printf("%.2f",All);
    }
}
