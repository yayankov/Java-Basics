package com.company;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1=Double.parseDouble(sc.nextLine());
        double y1=Double.parseDouble(sc.nextLine());
        double x2=Double.parseDouble(sc.nextLine());
        double y2=Double.parseDouble(sc.nextLine());
        double length=Math.abs(x1-x2);
        double width=Math.abs(y1-y2);
        double rectArea= length*width;
        double rectPer=length*2+width*2;
        System.out.printf("%.2f",rectArea);
        System.out.println();
        System.out.printf("%.2f",rectPer);
    }
}
