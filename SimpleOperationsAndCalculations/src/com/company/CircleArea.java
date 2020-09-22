package com.company;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r=Double.parseDouble(sc.nextLine());
        double p=3.14159265359;
        double squareArea=r*r*p;
        double squarePer=2*p*r;
        System.out.printf("%.2f",squareArea);
        System.out.println();
        System.out.printf("%.2f",squarePer);
    }
}
