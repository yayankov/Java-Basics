package com.company;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double L=Double.parseDouble(sc.nextLine());
        double W=Double.parseDouble(sc.nextLine());
        double A=Double.parseDouble(sc.nextLine());
        double AreaRoom=(L*100)*(W*100);
        double FreeArea=AreaRoom-(A*100*A*100+AreaRoom/10);
        double Dancers=FreeArea/7040;
        int dancers= (int) Math.floor(Dancers);
        System.out.printf("%.0f",dancers);
    }
}
