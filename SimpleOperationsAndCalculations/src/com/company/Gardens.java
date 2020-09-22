package com.company;

import java.util.Scanner;

public class Gardens {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double size=Double.parseDouble(sc.nextLine());
        double price=size*7.61;
        double discount=price*0.18;
        double finalPrice=price-discount;
        System.out.printf("The final price is: %.2f lv.",finalPrice);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
