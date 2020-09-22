package com.company;

import java.util.Scanner;
public class USDtoBGN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double usd=Double.parseDouble(sc.nextLine());
double lev=usd*1.79549;
System.out.printf("%.2f",lev);
    }
}