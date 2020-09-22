package com.company;

import java.util.Scanner;

public class tailoringWorkshop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tables=Integer.parseInt(sc.nextLine());
        double length=Double.parseDouble(sc.nextLine());
        double width=Double.parseDouble(sc.nextLine());
        double RectMaterial=tables*((length+2*0.30)*(width+2*0.30));
        double KareMaterial=tables*((length/2)*(length/2));
        double price=RectMaterial*7+KareMaterial*9;
        System.out.printf("%.2f USD",price);
        System.out.println();
        double priceBg=price*1.85;
        System.out.printf("%.2f BGN",priceBg);
    }
}
