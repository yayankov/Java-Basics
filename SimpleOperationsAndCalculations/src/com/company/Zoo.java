package com.company;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double foodDog=2.50;
        double food=4;
        double numDogs= Double.parseDouble(sc.nextLine());
        double numAnimals= Double.parseDouble(sc.nextLine());
        double sum=foodDog*numDogs + food*numAnimals;
        System.out.printf("%.2f lv.",sum);
    }
}
