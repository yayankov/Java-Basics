package com.company;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rad=Double.parseDouble(sc.nextLine());
        double deg=rad*180/3.14159265359;

        System.out.printf("%.0f",deg);

    }
}
