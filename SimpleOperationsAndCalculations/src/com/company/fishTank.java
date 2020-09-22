package com.company;

import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length=Double.parseDouble(sc.nextLine());
        double width=Double.parseDouble(sc.nextLine());
        double height=Double.parseDouble(sc.nextLine());
        double percent=Double.parseDouble(sc.nextLine());
        double capacity=length*width*height*0.001;
        double capWater=capacity-(capacity*percent*(0.01));
        System.out.printf("%.3f",capWater);
    }
}
